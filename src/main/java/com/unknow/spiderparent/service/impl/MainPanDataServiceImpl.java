package com.unknow.spiderparent.service.impl;

import com.unknow.spiderparent.common.BaseConstants;
import com.unknow.spiderparent.common.MainPanTypeConstants;
import com.unknow.spiderparent.entity.RaceRateBasic;
import com.unknow.spiderparent.entity.RaceRateScoreOr;
import com.unknow.spiderparent.entity.RaceTabRef;
import com.unknow.spiderparent.mapper.RaceRateBasicMapper;
import com.unknow.spiderparent.mapper.RaceRateScoreOrMapper;
import com.unknow.spiderparent.mapper.RaceTabRefMapper;
import com.unknow.spiderparent.service.IMainPanDataService;
import com.unknow.spiderparent.utils.HttpClientUtil;
import com.unknow.spiderparent.utils.SpiderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MainPanDataServiceImpl implements IMainPanDataService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RaceRateBasicMapper raceRateBasicMapper;

    @Autowired
    private RaceRateScoreOrMapper raceRateScoreOrMapper;

    @Autowired
    private RaceTabRefMapper raceTabRefMapper;

    @Autowired
    private SpiderUtil spiderUtil;

    /**
     * https://www.188-sb.com/SportsBook.API/web?
     *
     * lid=10&
     * zid=0&
     * pd=#AC#B1#C1#D8#E79268703#F3#R0#P^14#Q^37628399#&  该场比赛id
     * cid=42&
     * ctid=42
     *
     * @param raceId
     */
    @Override
    public void fetchMainPanData(String raceId) {
        Map<String, String> params = new HashMap<>();
        params.put("lid", "10");
        params.put("zid", "0");
        params.put("pd", raceId);
        params.put("cid", "42");
        params.put("ctid", "42");

        String respOriginContent = HttpClientUtil.doGet(BaseConstants.BASE_URL, params);
        logger.info("获取比赛id为[ {} ]的比赛主要盘口赔率===>[原始数据]: {}", raceId, respOriginContent);

        String[] mainDataArray = respOriginContent.split("\\|MG;");

        // tab 切换页id入库
        parseTabIdRef(mainDataArray[1], raceId);

        for (int i = 3; i < mainDataArray.length; i++) {
            String content = mainDataArray[i];
            String contentType = content.split(";")[1].split("=")[1];

            switch (contentType) {
                case MainPanTypeConstants.All_Section_Result:
                    // 主要盘口（全场赛果）
                    parseFullResultRate(content, raceId);
                    break;
                case MainPanTypeConstants.Half_All_Section:
                    // 主要盘口（半/全场）
                    parsehalfFullWinRate(content, raceId);
                    break;
                case MainPanTypeConstants.Both_Score:
                    // 主要盘口（两队均得分）
                    parseFullAllScore(content, raceId);
                    break;
                case MainPanTypeConstants.All_Score:
                    // 主要盘口（全场比分）
                    parseFullScore(content, raceId);
                    break;
            }
        }
    }

    /**
     * IT=MG1;SY=cm;
     * |MA;NA=亚洲盘口;PD=#AC#B1#C1#D8#E79321987#F3#H0#I3#R1#P^14#Q^37628399;IT=MGT3;
     * |MA;NA=主要盘口;PD=#AC#B1#C1#D8#E79321987#F3#H0#I1#R1#P^14#Q^37628399;IT=MGT1;LS=1;
     * |MA;NA=盘口编辑器;PD=#AC#B1#C1#D8#E79321987#F3#H0#I99#R1#P^14#Q^37628399;IT=MGT99;FF=HX;
     * |MA;NA=进球;PD=#AC#B1#C1#D8#E79321987#F3#H0#I6#R1#P^14#Q^37628399;IT=MGT6;
     * |MA;NA=上半场/下半场;PD=#AC#B1#C1#D8#E79321987#F3#H0#I7#R1#P^14#Q^37628399;IT=MGT7;
     * |MA;NA=精选;PD=#AC#B1#C1#D8#E79321987#F3#H0#I9#R1#P^14#Q^37628399;IT=MGT9;
     * |MA;NA=分钟;PD=#AC#B1#C1#D8#E79321987#F3#H0#I2#R1#P^14#Q^37628399;IT=MGT2;
     *
     * @param raceId
     */
    private void parseTabIdRef(String source, String raceId) {
        RaceTabRef raceTabRef = new RaceTabRef();
        String[] tabRefs = source.split("\\|MA;");
        raceTabRef.setRaceId(raceId);

        for (int i = 1; i < tabRefs.length; i++) {
            String[] tabs = tabRefs[i].split(";");
            String tabType = tabs[2].split("=")[1];
            switch (tabType) {
                case "MGT1": raceTabRef.setMainPan(tabs[1].split("=")[1]);
                case "MGT6": raceTabRef.setEnterBall(tabs[1].split("=")[1]);
                case "MGT7": raceTabRef.setUpDownSection(tabs[1].split("=")[1]);
            }
        }
        raceTabRefMapper.insert(raceTabRef);
    }

    /**
     * 主要盘口（全场赛果）
     *
     * ID=G40;
     * IT=G40;
     * NA=全场赛果;
     * DO=1;
     *
     * |MA;ID=M40;IT=M40;CN=3;SY=A;PY=a;
     *
     * |PA;ID=2040216004;IT=79321987-2040216004;NA=富勒姆;OD=16/1;NF=79321987;
     * |PA;ID=2040216006;IT=79321987-2040216006;NA=平局;OD=13/2;NF=79321987;
     * |PA;ID=2040216007;IT=79321987-2040216007;NA=曼城;OD=1/7;NF=79321987;
     */
    private void parseFullResultRate(String source, String raceId) {
        RaceRateBasic raceRateBasic = spiderUtil.getRaceRateBasic(raceId);

        String[] fullResultRate = source.split("\\|PA;");
        // 主胜赔率
        String[] fullHostWinArray = fullResultRate[1].split(";")[3].split("=")[1].split("/");
        raceRateBasic.setFullHostWin(Double.parseDouble(fullHostWinArray[0]) / Double.parseDouble(fullHostWinArray[1]) + 1.00);

        // 平局
        String[] fullDraw = fullResultRate[2].split(";")[3].split("=")[1].split("/");
        raceRateBasic.setFullDraw(Double.parseDouble(fullDraw[0]) / Double.parseDouble(fullDraw[1]) + 1.00);

        // 客胜赔率
        String[] fullGuestRate = fullResultRate[3].split(";")[3].split("=")[1].split("/");
        raceRateBasic.setFullGuestWin(Double.parseDouble(fullGuestRate[0]) / Double.parseDouble(fullGuestRate[1]) + 1.00);

        raceRateBasicMapper.updateByPrimaryKeySelective(raceRateBasic);
    }

    /**
     * 主要盘口（半/全场） 半全场胜平负  6
     *
     * ID=G42;IT=G42;NA=半/全场;DO=1;|MA;ID=M42;IT=M42;CN=3;SY=A;PY=a;
     *
     * |PA;ID=2040235242;IT=79321987-2040235242;NA=富勒姆 - 富勒姆;OD=28/1;NF=79321987;  AA
     * |PA;ID=2040235243;IT=79321987-2040235243;NA=富勒姆 - 平局;OD=28/1;NF=79321987; AD
     * |PA;ID=2040235244;IT=79321987-2040235244;NA=富勒姆 - 曼城;OD=20/1;NF=79321987; AB
     * |PA;ID=2040235245;IT=79321987-2040235245;NA=平局 - 富勒姆;OD=33/1;NF=79321987; DA
     * |PA;ID=2040235246;IT=79321987-2040235246;NA=平局 - 平局;OD=14/1;NF=79321987; DD
     * |PA;ID=2040235247;IT=79321987-2040235247;NA=平局 - 曼城;OD=10/3;NF=79321987; DB
     * |PA;ID=2040235248;IT=79321987-2040235248;NA=曼城 - 富勒姆;OD=100/1;NF=79321987; BA
     * |PA;ID=2040235249;IT=79321987-2040235249;NA=曼城 - 平局;OD=28/1;NF=79321987; BD
     * |PA;ID=2040235250;IT=79321987-2040235250;NA=曼城 - 曼城;OD=1/2;NF=79321987; BB
     */
    private void parsehalfFullWinRate(String source, String raceId) {
        RaceRateBasic raceRateBasic = spiderUtil.getRaceRateBasic(raceId);
        String[] halfFullWinRate = source.split("\\|PA;");

        String[] AA = halfFullWinRate[1].split(";")[3].split("=")[1].split("/");
        Double AARate = Double.parseDouble(AA[0]) / Double.parseDouble(AA[1]) + 1.00;
        raceRateBasic.setHostHost(AARate);

        String[] AD = halfFullWinRate[2].split(";")[3].split("=")[1].split("/");
        Double ADRate = Double.parseDouble(AD[0]) / Double.parseDouble(AD[1]) + 1.00;
        raceRateBasic.setHostDraw(ADRate);

        String[] AB = halfFullWinRate[3].split(";")[3].split("=")[1].split("/");
        Double ABRate = Double.parseDouble(AB[0]) / Double.parseDouble(AB[1])  + 1.00;
        raceRateBasic.setHostGuest(ABRate);

        String[] DA = halfFullWinRate[4].split(";")[3].split("=")[1].split("/");
        Double DARate = Double.parseDouble(DA[0]) / Double.parseDouble(DA[1])  + 1.00;
        raceRateBasic.setDrawHost(DARate);

        String[] DD = halfFullWinRate[5].split(";")[3].split("=")[1].split("/");
        Double DDRate = Double.parseDouble(DD[0]) / Double.parseDouble(DD[1])  + 1.00;
        raceRateBasic.setDrawDraw(DDRate);

        String[] DB = halfFullWinRate[6].split(";")[3].split("=")[1].split("/");
        Double DBRate = Double.parseDouble(DB[0]) / Double.parseDouble(DB[1])  + 1.00;
        raceRateBasic.setDrawGuest(DBRate);

        String[] BA = halfFullWinRate[7].split(";")[3].split("=")[1].split("/");
        Double BARate = Double.parseDouble(BA[0]) / Double.parseDouble(BA[1])  + 1.00;
        raceRateBasic.setGuestHost(BARate);

        String[] BD = halfFullWinRate[8].split(";")[3].split("=")[1].split("/");
        Double BDRate = Double.parseDouble(BD[0]) / Double.parseDouble(BD[1])  + 1.00;
        raceRateBasic.setGuestDraw(BDRate);

        String[] BB = halfFullWinRate[9].split(";")[3].split("=")[1].split("/");
        Double BBRate = Double.parseDouble(BB[0]) / Double.parseDouble(BB[1])  + 1.00;
        raceRateBasic.setGuestGuest(BBRate);

        raceRateBasicMapper.updateByPrimaryKeySelective(raceRateBasic);
    }

    /**
     * 主要盘口（两队均得分）
     *
     * ID=G10150;IT=G10150;NA=两队均得分;DO=1;|MA;ID=M10150;IT=M10150;CN=2;SY=A;PY=a;
     * |PA;ID=2051393083;IT=79321987-2051393083;NA=是;OD=4/5;NF=79321987;
     * |PA;ID=2051393084;IT=79321987-2051393084;NA=否;OD=19/20;NF=79321987;
     */
    private void parseFullAllScore(String source, String raceId) {
        RaceRateBasic raceRateBasic = spiderUtil.getRaceRateBasic(raceId);
        String[] fullAllScore = source.split("\\|PA;");

        String[] yes = fullAllScore[1].split(";")[3].split("=")[1].split("/");
        Double yesRate = Double.parseDouble(yes[0]) / Double.parseDouble(yes[1])  + 1.00;
        raceRateBasic.setFullAllScore(yesRate);

        String[] no = fullAllScore[2].split(";")[3].split("=")[1].split("/");
        Double noRate = Double.parseDouble(no[0]) / Double.parseDouble(no[1])  + 1.00;
        raceRateBasic.setFullAllScoreNo(noRate);
        raceRateBasicMapper.updateByPrimaryKeySelective(raceRateBasic);
    }

    /**
     * 主要盘口（全场比分）
     *
     * |MG;ID=43;IT=43;NA=正确比分;DO=1;SY=b;MT=4;OT=1;BB=滑动条¬全部;BI=1;
     *
     * |MA;ID=M43-43;IT=M43-43;SY=i;NA=富勒姆¬曼城;OT=1;RA=0-4¬0-9;DO=1;
     *
     * |MA;ID=M43-43;IT=M43-43;CN=1;SY=H;PY=c;NA=富勒姆;OR=1;
     * |PA;ID=2040235175;IT=CBA-79321987-43-2040235175-M43;OR=1;NA=1-0;OD=50/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235177;IT=CBA-79321987-43-2040235177-M43;OR=2;NA=2-0;OD=100/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235178;IT=CBA-79321987-43-2040235178-M43;OR=3;NA=2-1;OD=50/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235181;IT=CBA-79321987-43-2040235181-M43;OR=4;NA=3-0;OD=400/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235183;IT=CBA-79321987-43-2040235183-M43;OR=5;NA=3-1;OD=125/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235185;IT=CBA-79321987-43-2040235185-M43;OR=6;NA=3-2;OD=80/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235190;IT=CBA-79321987-43-2040235190-M43;OR=7;NA=4-2;OD=400/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235192;IT=CBA-79321987-43-2040235192-M43;OR=8;NA=4-3;OD=400/1;SU=0;NF=79321987;CN=1;
     *
     * |MA;ID=M43-43;IT=M43-43;CN=1;SY=H;PY=c;NA=平局;OR=2;
     * |PA;ID=2040235200;IT=CBA-79321987-43-2040235200-M43;OR=1;NA=0-0;OD=25/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235201;IT=CBA-79321987-43-2040235201-M43;OR=2;NA=1-1;OD=16/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235204;IT=CBA-79321987-43-2040235204-M43;OR=3;NA=2-2;OD=28/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235205;IT=CBA-79321987-43-2040235205-M43;OR=4;NA=3-3;OD=66/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235228;IT=CBA-79321987-43-2040235228-M43;OR=5;NA=4-4;OD=350/1;SU=0;NF=79321987;CN=1;
     *
     * |MA;ID=M43-43;IT=M43-43;CN=1;SY=H;PY=c;NA=曼城;OR=3;
     * |PA;ID=2040235207;IT=CBA-79321987-43-2040235207-M43;OR=1;NA=1-0;OD=11/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235208;IT=CBA-79321987-43-2040235208-M43;OR=2;NA=2-0;OD=8/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235210;IT=CBA-79321987-43-2040235210-M43;OR=3;NA=2-1;OD=10/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235211;IT=CBA-79321987-43-2040235211-M43;OR=4;NA=3-0;OD=15/2;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235213;IT=CBA-79321987-43-2040235213-M43;OR=5;NA=3-1;OD=10/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235214;IT=CBA-79321987-43-2040235214-M43;OR=6;NA=3-2;OD=25/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235216;IT=CBA-79321987-43-2040235216-M43;OR=7;NA=4-0;OD=10/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235217;IT=CBA-79321987-43-2040235217-M43;OR=8;NA=4-1;OD=14/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235219;IT=CBA-79321987-43-2040235219-M43;OR=9;NA=4-2;OD=33/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235220;IT=CBA-79321987-43-2040235220-M43;OR=10;NA=4-3;OD=80/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235222;IT=CBA-79321987-43-2040235222-M43;OR=11;NA=5-0;OD=16/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235223;IT=CBA-79321987-43-2040235223-M43;OR=12;NA=5-1;OD=20/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235225;IT=CBA-79321987-43-2040235225-M43;OR=13;NA=5-2;OD=40/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235226;IT=CBA-79321987-43-2040235226-M43;OR=14;NA=5-3;OD=125/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051239998;IT=CBA-79321987-43-2051239998-M43;OR=15;NA=6-0;OD=28/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240002;IT=CBA-79321987-43-2051240002-M43;OR=16;NA=6-1;OD=33/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240005;IT=CBA-79321987-43-2051240005-M43;OR=17;NA=6-2;OD=66/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240008;IT=CBA-79321987-43-2051240008-M43;OR=18;NA=6-3;OD=200/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240011;IT=CBA-79321987-43-2051240011-M43;OR=19;NA=7-0;OD=50/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240014;IT=CBA-79321987-43-2051240014-M43;OR=20;NA=7-1;OD=50/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240017;IT=CBA-79321987-43-2051240017-M43;OR=21;NA=7-2;OD=125/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240020;IT=CBA-79321987-43-2051240020-M43;OR=22;NA=7-3;OD=450/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240023;IT=CBA-79321987-43-2051240023-M43;OR=23;NA=8-0;OD=80/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240026;IT=CBA-79321987-43-2051240026-M43;OR=24;NA=8-1;OD=125/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240028;IT=CBA-79321987-43-2051240028-M43;OR=25;NA=8-2;OD=300/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240032;IT=CBA-79321987-43-2051240032-M43;OR=26;NA=9-0;OD=200/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240034;IT=CBA-79321987-43-2051240034-M43;OR=27;NA=9-1;OD=300/1;SU=0;NF=79321987;CN=1;
     */
    private void parseFullScore(String source, String raceId) {
        String[] fullScoreArray = source.split("\\|MA;");

        RaceRateScoreOr hostScoreRate = spiderUtil.getRateScoreOr(raceId, 1, 2);
        String[] hostScore = fullScoreArray[2].split("\\|PA;");
        spiderUtil.scoreToBean(hostScore, hostScoreRate);
        raceRateScoreOrMapper.updateByPrimaryKeySelective(hostScoreRate);

        RaceRateScoreOr drawScoreRate = spiderUtil.getRateScoreOr(raceId, 2, 2);
        String[] drawScore = fullScoreArray[3].split("\\|PA;");
        spiderUtil.scoreToBean(drawScore, drawScoreRate);
        raceRateScoreOrMapper.updateByPrimaryKeySelective(drawScoreRate);

        RaceRateScoreOr guestScoreRate = spiderUtil.getRateScoreOr(raceId, 3, 2);
        String[] guestScore = fullScoreArray[4].split("\\|PA;");
        spiderUtil.scoreToBean(guestScore, guestScoreRate);
        raceRateScoreOrMapper.updateByPrimaryKeySelective(guestScoreRate);
    }
}
