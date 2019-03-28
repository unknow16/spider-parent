package com.unknow.spiderparent.service.impl;

import com.unknow.spiderparent.common.BaseConstants;
import com.unknow.spiderparent.common.EnterBallTypeConstants;
import com.unknow.spiderparent.common.SpiderException;
import com.unknow.spiderparent.entity.RaceRateBasic;
import com.unknow.spiderparent.entity.RaceRateNum;
import com.unknow.spiderparent.mapper.RaceRateBasicMapper;
import com.unknow.spiderparent.mapper.RaceRateNumMapper;
import com.unknow.spiderparent.service.IEnterBallDataService;
import com.unknow.spiderparent.utils.HttpClientUtil;
import com.unknow.spiderparent.utils.SpiderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EnterBallDataServiceImpl implements IEnterBallDataService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RaceRateBasicMapper raceRateBasicMapper;

    @Autowired
    private RaceRateNumMapper raceRateNumMapper;

    @Autowired
    private SpiderUtil spiderUtil;

    /**
     * @param raceId
     */
    @Override
    public void fetchMainData(String raceId) throws SpiderException {
        Map<String, String> params = spiderUtil.getEnterBallParam(raceId);

        String respOriginContent = HttpClientUtil.doGet(BaseConstants.BASE_URL, params);
        logger.info("获取比赛id为[ {} ]的比赛上下场赔率===>[原始数据]: {}", raceId, respOriginContent);

        String[] mainDataArray = respOriginContent.split("\\|MG;");

        for (int i = 3; i < mainDataArray.length; i++) {
            String content = mainDataArray[i];
            String contentType = content.split(";")[1].split("=")[1];

            switch (contentType) {
                case EnterBallTypeConstants.Half_Section_Ball_More:
                    // 哪个半场产生最多进球
                    parseEnterBallMoreSection(content, raceId);
                    break;
                case EnterBallTypeConstants.First_Ball_Team:
                    // 首个得分球队
                    parseGetScore(content, raceId);
                    break;
                case EnterBallTypeConstants.Enter_Ball_Num:
                    // 比赛的进球数
                    parseEnterBallNum(content, raceId);
                    break;
                case EnterBallTypeConstants.Ball_Num_Odd_Even:
                    // 进球数 - 奇odd/偶 even
                    parseBallOddEven(content, raceId);
                    break;
                case EnterBallTypeConstants.Host_Ball_Num:
                    // 主队准确进球
                    parseHostBallNum(content, raceId);
                    break;
                case EnterBallTypeConstants.Guest_Ball_Num:
                    // 客队准确进球
                    parseGuestBallNum(content, raceId);
                    break;
                case EnterBallTypeConstants.Total_Ball_Num:
                    // 准确进球总数
                    parseTotalBallNum(content, raceId);
                    break;
            }
        }
    }

    /**
     * ID=G10203;IT=G10203;NA=准确进球总数;PD=#AC#B1#C1#D8#E79321987#F3#G10203#H4#I6#O2#;
     *
     * F|CL;ID=1;IT=X#AC#B1#C1#D8#E79321987#F3#G10203#H4#I6#O2#;OR=0;EX=7,#AC#B1#C1#D8#E79321987#F3#G10203#H4#I6#O2#@8,AUDIO1@9,BETTINGNEWS1@15,<;ED=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H1=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H2=;NA=显示足球菜单,隐藏足球菜单;MF=1;NG=Sports/Soccer Coupon;NS=0;PV=2.0.364.0/SCC;|EV;ID=EMB;IT=XEMB;NA=热门赛事投注;OR=0;EX=富勒姆 v 曼城;CM=开始时间~20190330123000;TB=足球,#AS#B1#¬英格兰超级联赛,#AC#B1#C1#D13#E37628398#F2#¬富勒姆 v 曼城,#ABM#B1#C1#D8#E79321987#F3#I6#;EN=2;FI=79321987;P1=100055;P2=100011;CC=FA Barclaycard;CK=1123;|MG;ID=G10203;IT=G10203;NA=准确进球总数;|MA;ID=M10203;IT=XM10203;CN=3;SY=A;PY=a;
     * |PA;ID=2051392579;IT=X79321987-2051392579;NA=无进球;OD=25/1;NF=79321987;
     * |PA;ID=2051392580;IT=X79321987-2051392580;NA=1个进球;OD=9/1;NF=79321987;
     * |PA;ID=2051392581;IT=X79321987-2051392581;NA=2个进球;OD=5/1;NF=79321987;
     * |PA;ID=2051392582;IT=X79321987-2051392582;NA=3个进球;OD=10/3;NF=79321987;
     * |PA;ID=2051392584;IT=X79321987-2051392584;NA=4个进球;OD=7/2;NF=79321987;
     * |PA;ID=2051392585;IT=X79321987-2051392585;NA=5个进球;OD=9/2;NF=79321987;
     * |PA;ID=2051392587;IT=X79321987-2051392587;NA=6个进球;OD=15/2;NF=79321987;
     * |PA;ID=2051392588;IT=X79321987-2051392588;NA=7+ 进球;OD=7/1;NF=79321987;|
     * @param source
     * @param raceId
     */
    private void parseTotalBallNum(String source, String raceId) {
        String id = source.split(";")[3].split("=")[1];

        Map<String, String> params = new HashMap<>();
        params.put("lid", "10");
        params.put("zid", "0");
        params.put("pd", id);
        params.put("cid", "42");
        params.put("ctid", "42");

        String originContent = HttpClientUtil.doGet(BaseConstants.BASE_URL, params);
        String[] lines = originContent.split("\\|PA;");

        RaceRateNum raceRateNum = spiderUtil.getRaceRateNum(raceId, BaseConstants.FULL_SECTION_TOTAL_ENTER_BALL_NUM);
        Double none = spiderUtil.parseThreeTypeRate(lines[1]);
        raceRateNum.setS0(none);

        Double s1 = spiderUtil.parseThreeTypeRate(lines[2]);
        raceRateNum.setS1(s1);

        Double s2 = spiderUtil.parseThreeTypeRate(lines[3]);
        raceRateNum.setS2(s2);

        Double s3 = spiderUtil.parseThreeTypeRate(lines[4]);
        raceRateNum.setS3(s3);

        Double s4 = spiderUtil.parseThreeTypeRate(lines[5]);
        raceRateNum.setS4(s4);

        Double s5 = spiderUtil.parseThreeTypeRate(lines[6]);
        raceRateNum.setS5(s5);

        Double s6 = spiderUtil.parseThreeTypeRate(lines[7]);
        raceRateNum.setS6(s6);

        Double s7 = spiderUtil.parseThreeTypeRate(lines[8]);
        raceRateNum.setS7(s7);

        raceRateNumMapper.updateByPrimaryKey(raceRateNum);
    }

    /**
     * ID=G50416;IT=G50416;NA=客队准确进球;PD=#AC#B1#C1#D8#E79321987#F3#G50416#H4#I6#O2#;
     *
     * F|CL;ID=1;IT=X#AC#B1#C1#D8#E79321987#F3#G50416#H4#I6#O2#;OR=0;EX=7,#AC#B1#C1#D8#E79321987#F3#G50416#H4#I6#O2#@8,AUDIO1@9,BETTINGNEWS1@15,<;ED=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H1=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H2=;NA=显示足球菜单,隐藏足球菜单;MF=1;NG=Sports/Soccer Coupon;NS=0;PV=2.0.364.0/SCC;|EV;ID=EMB;IT=XEMB;NA=热门赛事投注;OR=0;EX=富勒姆 v 曼城;CM=开始时间~20190330123000;TB=足球,#AS#B1#¬英格兰超级联赛,#AC#B1#C1#D13#E37628398#F2#¬富勒姆 v 曼城,#ABM#B1#C1#D8#E79321987#F3#I6#;EN=2;FI=79321987;P1=100055;P2=100011;CC=FA Barclaycard;CK=1123;|MG;ID=G50416;IT=G50416;NA=客队准确进球;|MA;ID=M50416;IT=XM50416;CN=2;SY=A;PY=a;
     * |PA;ID=2051393363;IT=X79321987-2051393363;NA=曼城 - 无进球;OD=18/1;NF=79321987;
     * |PA;ID=2051393365;IT=X79321987-2051393365;NA=曼城 - 1个进球;OD=5/1;NF=79321987;
     * |PA;ID=2051393367;IT=X79321987-2051393367;NA=曼城 - 2个进球;OD=3/1;NF=79321987;
     * |PA;ID=2051393369;IT=X79321987-2051393369;NA=曼城 - 3个或更多进球;OD=8/15;NF=79321987;|
     * @param source
     * @param raceId
     */
    private void parseGuestBallNum(String source, String raceId) {
        String id = source.split(";")[3].split("=")[1];

        Map<String, String> params = new HashMap<>();
        params.put("lid", "10");
        params.put("zid", "0");
        params.put("pd", id);
        params.put("cid", "42");
        params.put("ctid", "42");

        String originContent = HttpClientUtil.doGet(BaseConstants.BASE_URL, params);
        String[] lines = originContent.split("\\|PA;");

        RaceRateNum guestRaceRateNum = spiderUtil.getRaceRateNum(raceId, BaseConstants.FULL_SECTION_GUEST_ENTER_BALL_NUM);
        Double none = spiderUtil.parseThreeTypeRate(lines[1]);
        guestRaceRateNum.setS0(none);

        Double s1 = spiderUtil.parseThreeTypeRate(lines[2]);
        guestRaceRateNum.setS1(s1);

        Double s2 = spiderUtil.parseThreeTypeRate(lines[3]);
        guestRaceRateNum.setS2(s2);

        Double s3Up = spiderUtil.parseThreeTypeRate(lines[4]);
        guestRaceRateNum.setS3(s3Up);

        raceRateNumMapper.updateByPrimaryKey(guestRaceRateNum);
    }

    /**
     * ID=G50415;IT=G50415;NA=主队准确进球;PD=#AC#B1#C1#D8#E79321987#F3#G50415#H4#I6#O2#;
     *
     * F|CL;ID=1;IT=X#AC#B1#C1#D8#E79321987#F3#G50415#H4#I6#O2#;OR=0;EX=7,#AC#B1#C1#D8#E79321987#F3#G50415#H4#I6#O2#@8,AUDIO1@9,BETTINGNEWS1@15,<;ED=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H1=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H2=;NA=显示足球菜单,隐藏足球菜单;MF=1;NG=Sports/Soccer Coupon;NS=0;PV=2.0.364.0/SCC;|EV;ID=EMB;IT=XEMB;NA=热门赛事投注;OR=0;EX=富勒姆 v 曼城;CM=开始时间~20190330123000;TB=足球,#AS#B1#¬英格兰超级联赛,#AC#B1#C1#D13#E37628398#F2#¬富勒姆 v 曼城,#ABM#B1#C1#D8#E79321987#F3#I6#;EN=2;FI=79321987;P1=100055;P2=100011;CC=FA Barclaycard;CK=1123;|MG;ID=G50415;IT=G50415;NA=主队准确进球;|MA;ID=M50415;IT=XM50415;CN=2;SY=A;PY=a;
     * |PA;ID=2051393347;IT=X79321987-2051393347;NA=富勒姆 - 无进球;OD=10/11;NF=79321987;
     * |PA;ID=2051393349;IT=X79321987-2051393349;NA=富勒姆 - 1个进球;OD=6/4;NF=79321987;
     * |PA;ID=2051393351;IT=X79321987-2051393351;NA=富勒姆 - 2个进球;OD=11/2;NF=79321987;
     * |PA;ID=2051393353;IT=X79321987-2051393353;NA=富勒姆 - 3个或更多进球;OD=18/1;NF=79321987;|
     * @param source
     * @param raceId
     */
    private void parseHostBallNum(String source, String raceId) {
        String id = source.split(";")[3].split("=")[1];

        Map<String, String> params = new HashMap<>();
        params.put("lid", "10");
        params.put("zid", "0");
        params.put("pd", id);
        params.put("cid", "42");
        params.put("ctid", "42");

        String originContent = HttpClientUtil.doGet(BaseConstants.BASE_URL, params);
        String[] lines = originContent.split("\\|PA;");

        RaceRateNum hostRaceRateNum = spiderUtil.getRaceRateNum(raceId, BaseConstants.FULL_SECTION_HOST_ENTER_BALL_NUM);
        Double none = spiderUtil.parseThreeTypeRate(lines[1]);
        hostRaceRateNum.setS0(none);

        Double s1 = spiderUtil.parseThreeTypeRate(lines[2]);
        hostRaceRateNum.setS1(s1);

        Double s2 = spiderUtil.parseThreeTypeRate(lines[3]);
        hostRaceRateNum.setS2(s2);

        Double s3Up = spiderUtil.parseThreeTypeRate(lines[4]);
        hostRaceRateNum.setS3(s3Up);

        raceRateNumMapper.updateByPrimaryKey(hostRaceRateNum);
    }

    /**
     * ID=G10111;IT=G10111;NA=进球数 - 奇/偶;DO=1;|MA;ID=M10111;IT=M10111;CN=2;SY=A;PY=a;
     * |PA;ID=2040235260;IT=79321987-2040235260;NA=奇数;OD=19/20;NF=79321987;
     * |PA;ID=2040235259;IT=79321987-2040235259;NA=偶数;OD=9/10;NF=79321987;
     * @param source
     * @param raceId
     */
    private void parseBallOddEven(String source, String raceId) {
        String[] array = source.split("\\|PA;");

        RaceRateBasic raceRateBasic = spiderUtil.getRaceRateBasic(raceId);
        Double odd = spiderUtil.parseThreeTypeRate(array[1]);
        raceRateBasic.setFullScoreOdd(odd);

        Double even = spiderUtil.parseThreeTypeRate(array[2]);
        raceRateBasic.setFullScoreEven(even);

        raceRateBasicMapper.updateByPrimaryKeySelective(raceRateBasic);
    }

    /**
     * ID=G10536;IT=G10536;NA=比赛的进球数;DO=1;|MA;ID=M10536;IT=M10536;CN=3;SY=A;PY=a;
     * |PA;ID=2051392576;IT=79321987-2051392576;NA=低于两个进球;OD=7/1;NF=79321987;
     * |PA;ID=2051392577;IT=79321987-2051392577;NA=2个或3个进球;OD=6/4;NF=79321987;
     * |PA;ID=2051392578;IT=79321987-2051392578;NA=超过3个进球;OD=8/11;NF=79321987;
     * @param source
     * @param raceId
     */
    private void parseEnterBallNum(String source, String raceId) {
        String[] array = source.split("\\|PA;");

        RaceRateBasic raceRateBasic = spiderUtil.getRaceRateBasic(raceId);
        Double S01 = spiderUtil.parseThreeTypeRate(array[1]);
        raceRateBasic.setFullScoreRange01(S01);

        Double S23 = spiderUtil.parseThreeTypeRate(array[2]);
        raceRateBasic.setFullScoreRange23(S23);

        Double S3Up = spiderUtil.parseThreeTypeRate(array[3]);
        raceRateBasic.setFullScoreRange3Up(S3Up);

        raceRateBasicMapper.updateByPrimaryKeySelective(raceRateBasic);
    }

    /**
     * ID=G1178;IT=G1178;NA=首个得分球队;PD=#AC#B1#C1#D8#E79321987#F3#G1178#H4#I6#O2#;
     * <p>
     * F|CL;ID=1;IT=X#AC#B1#C1#D8#E79321987#F3#G1178#H4#I6#O2#;OR=0;EX=7,#AC#B1#C1#D8#E79321987#F3#G1178#H4#I6#O2#@8,AUDIO1@9,BETTINGNEWS1@15,<;ED=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H1=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H2=;NA=显示足球菜单,隐藏足球菜单;MF=1;NG=Sports/Soccer Coupon;NS=0;PV=2.0.364.0/SCC;|EV;ID=EMB;IT=XEMB;NA=热门赛事投注;OR=0;EX=富勒姆 v 曼城;CM=开始时间~20190330123000;TB=足球,#AS#B1#¬英格兰超级联赛,#AC#B1#C1#D13#E37628398#F2#¬富勒姆 v 曼城,#ABM#B1#C1#D8#E79321987#F3#I6#;EN=2;FI=79321987;P1=100055;P2=100011;CC=FA Barclaycard;CK=1123;|MG;ID=G1178;IT=G1178;NA=首个得分球队;|MA;ID=M1178;IT=XM1178;CN=3;SY=A;PY=a;
     * |PA;ID=2040235302;IT=X79321987-2040235302;NA=富勒姆;OD=15/4;NF=79321987;
     * |PA;ID=2040235304;IT=X79321987-2040235304;NA=没有进球;OD=25/1;NF=79321987;
     * |PA;ID=2040235307;IT=X79321987-2040235307;NA=曼城;OD=1/6;NF=79321987;|
     *
     * @param source
     * @param raceId
     */
    private void parseGetScore(String source, String raceId) {
        String id = source.split(";")[3].split("=")[1];

        Map<String, String> params = new HashMap<>();
        params.put("lid", "10");
        params.put("zid", "0");
        params.put("pd", id);
        params.put("cid", "42");
        params.put("ctid", "42");

        String originContent = HttpClientUtil.doGet(BaseConstants.BASE_URL, params);
        String[] array = originContent.split("\\|PA;");

        RaceRateBasic raceRateBasic = spiderUtil.getRaceRateBasic(raceId);
        Double host = spiderUtil.parseThreeTypeRate(array[1]);
        raceRateBasic.setHostFirstScore(host);

        Double none = spiderUtil.parseThreeTypeRate(array[2]);
        raceRateBasic.setNoScore(none);

        Double guest = spiderUtil.parseThreeTypeRate(array[3]);
        raceRateBasic.setGuestFirstScore(guest);

        raceRateBasicMapper.updateByPrimaryKeySelective(raceRateBasic);
    }

    /**
     * ID=G10537;IT=G10537;NA=哪一半场将产生最多进球;PD=#AC#B1#C1#D8#E79321987#F3#G10537#H4#I6#O2#;
     * <p>
     * https://www.48365-365.com/SportsBook.API/web?
     * <p>
     * lid=10&zid=0&
     * pd=#AC#B1#C1#D8#E79321987#F3#G10537#H4#I6#O2#&
     * cid=42&ctid=42
     * <p>
     * F|CL;ID=1;IT=X#AC#B1#C1#D8#E79321987#F3#G10537#H4#I6#O2#;OR=0;EX=7,#AC#B1#C1#D8#E79321987#F3#G10537#H4#I6#O2#@8,AUDIO1@9,BETTINGNEWS1@15,<;ED=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H1=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H2=;NA=显示足球菜单,隐藏足球菜单;MF=1;NG=Sports/Soccer Coupon;NS=0;PV=2.0.364.0/SCC;|EV;ID=EMB;IT=XEMB;NA=热门赛事投注;OR=0;EX=富勒姆 v 曼城;CM=开始时间~20190330123000;TB=足球,#AS#B1#¬英格兰超级联赛,#AC#B1#C1#D13#E37628398#F2#¬富勒姆 v 曼城,#ABM#B1#C1#D8#E79321987#F3#I6#;EN=2;FI=79321987;P1=100055;P2=100011;CC=FA Barclaycard;CK=1123;|MG;ID=G10537;IT=G10537;NA=哪一半场将产生最多进球;|MA;ID=M10537;IT=XM10537;CN=3;SY=A;PY=a;
     * |PA;ID=2051392850;IT=X79321987-2051392850;NA=上半场;OD=15/8;NF=79321987;
     * |PA;ID=2051392860;IT=X79321987-2051392860;NA=下半场;OD=10/11;NF=79321987;
     * |PA;ID=2051392862;IT=X79321987-2051392862;NA=平局;OD=10/3;NF=79321987;|
     *
     * @param source
     * @param raceId
     */
    private void parseEnterBallMoreSection(String source, String raceId) {
        String id = source.split(";")[3].split("=")[1];

        Map<String, String> params = new HashMap<>();
        params.put("lid", "10");
        params.put("zid", "0");
        params.put("pd", id);
        params.put("cid", "42");
        params.put("ctid", "42");

        String originContent = HttpClientUtil.doGet(BaseConstants.BASE_URL, params);
        String[] array = originContent.split("\\|PA;");

        RaceRateBasic raceRateBasic = spiderUtil.getRaceRateBasic(raceId);
        Double halfScoreMoreRate = spiderUtil.parseThreeTypeRate(array[1]);
        raceRateBasic.setHalfScoreMore(halfScoreMoreRate);

        Double fullScoreMoreRate = spiderUtil.parseThreeTypeRate(array[2]);
        raceRateBasic.setFullScoreMore(fullScoreMoreRate);

        Double halfFullScoreDrawRate = spiderUtil.parseThreeTypeRate(array[3]);
        raceRateBasic.setHalfFullScoreDraw(halfFullScoreDrawRate);

        raceRateBasicMapper.updateByPrimaryKeySelective(raceRateBasic);
    }
}
