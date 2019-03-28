package com.unknow.spiderparent.service.impl;

import com.unknow.spiderparent.common.BaseConstants;
import com.unknow.spiderparent.common.SpiderException;
import com.unknow.spiderparent.common.UpDownSectionTypeConstants;
import com.unknow.spiderparent.entity.*;
import com.unknow.spiderparent.mapper.*;
import com.unknow.spiderparent.service.IUpDownSectionDataService;
import com.unknow.spiderparent.utils.HttpClientUtil;
import com.unknow.spiderparent.utils.SpiderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UpDownSectionDataServiceImpl implements IUpDownSectionDataService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RaceRateBasicMapper raceRateBasicMapper;

    @Autowired
    private RaceRateNumMapper raceRateNumMapper;

    @Autowired
    private RaceRateScoreOrMapper raceRateScoreOrMapper;

    @Autowired
    private SpiderUtil spiderUtil;

    /**
     *
     * @param raceId
     */
    @Override
    public void fetchMainData(String raceId) throws SpiderException {
        Map<String, String> params = spiderUtil.getUpDownSectionParam(raceId);

        String respOriginContent = HttpClientUtil.doGet(BaseConstants.BASE_URL, params);
        logger.info("获取比赛id为[ {} ]的比赛上下场赔率===>[原始数据]: {}", raceId, respOriginContent);

        String[] mainDataArray = respOriginContent.split("\\|MG;");

        for (int i = 3; i < mainDataArray.length; i++) {
            String content = mainDataArray[i];
            String contentType = content.split(";")[1].split("=")[1];

            switch (contentType) {
                case UpDownSectionTypeConstants.Half_Section_Result:
                    // 半场结果
                    parseHalfResult(content, raceId);
                    break;
                case UpDownSectionTypeConstants.Half_Section_Enter_Ball_Num:
                    // 上半场进球数
                    parseHalfEnterBallNum(content, raceId);
                    break;
                case UpDownSectionTypeConstants.Half_Section_Both_Score:
                    // 上半场两队均得分
                    parseHalfBothScore(content, raceId);
                    break;
                case UpDownSectionTypeConstants.Half_Section_Score:
                    // 半场正确比分
                    parseHalfScoreResult(content, raceId);
                    break;
            }
        }
    }

    /**
     * ID=G50424;IT=G50424;NA=上半场两队均得分;DO=1;|MA;ID=M50424;IT=M50424;CN=2;SY=A;PY=a;
     * |PA;ID=2051393414;IT=79321987-2051393414;NA=是;OD=10/3;NF=79321987;
     * |PA;ID=2051393416;IT=79321987-2051393416;NA=否;OD=1/5;NF=79321987;
     * @param source
     * @param raceId
     */
    private void parseHalfBothScore(String source, String raceId) {
        String[] scoreArray = source.split("\\|PA;");

        RaceRateBasicExample raceRateBasicExample = new RaceRateBasicExample();
        raceRateBasicExample.createCriteria()
                .andRaceIdEqualTo(raceId)
                .andStateEqualTo(1);
        List<RaceRateBasic> raceRateBasics = raceRateBasicMapper.selectByExample(raceRateBasicExample);
        RaceRateBasic raceRateBasic = null;
        if (raceRateBasics != null && raceRateBasics.size() > 0) {
            raceRateBasic = raceRateBasics.get(0);
            raceRateBasic.setUpdateTime(new Date());
        } else {
            raceRateBasic = new RaceRateBasic();
            raceRateBasic.setCreateTime(new Date());
            raceRateBasic.setUpdateTime(new Date());
            raceRateBasic.setState(1);
        }

        String[] yes = scoreArray[1].split(";")[3].split("=")[1].split("/");
        raceRateBasic.setHalfAllScore(Double.parseDouble(yes[0]) / Double.parseDouble(yes[1]) + 1.00);

        String[] no = scoreArray[2].split(";")[3].split("=")[1].split("/");
        raceRateBasic.setHalfAllScoreNo(Double.parseDouble(no[0]) / Double.parseDouble(no[1]) + 1.00);

        raceRateBasicMapper.updateByPrimaryKeySelective(raceRateBasic);
    }

    /**
     * ID=10540;IT=10540;NA=半场的正确比分;DO=1;SY=b;MT=4;OT=1;BB=滑动条¬全部;BI=1;
     *
     * |MA;ID=M43-10540;IT=M43-10540;SY=i;NA=富勒姆¬曼城;OT=1;RA=0-3¬0-6;DO=1;
     *
     * |MA;ID=M43-10540;IT=M43-10540;CN=1;SY=H;PY=c;NA=富勒姆;OR=1;
     * |PA;ID=2040235264;IT=CBA-79321987-10540-2040235264-M43;OR=1;NA=1-0;OD=14/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235265;IT=CBA-79321987-10540-2040235265-M43;OR=2;NA=2-0;OD=50/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235266;IT=CBA-79321987-10540-2040235266-M43;OR=3;NA=2-1;OD=40/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235267;IT=CBA-79321987-10540-2040235267-M43;OR=4;NA=3-0;OD=350/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235268;IT=CBA-79321987-10540-2040235268-M43;OR=5;NA=3-1;OD=250/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235269;IT=CBA-79321987-10540-2040235269-M43;OR=6;NA=3-2;OD=350/1;SU=0;NF=79321987;CN=1;
     *
     * |MA;ID=M43-10540;IT=M43-10540;CN=1;SY=H;PY=c;NA=平局;OR=2;
     * |PA;ID=2040235272;IT=CBA-79321987-10540-2040235272-M43;OR=1;NA=0-0;OD=4/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235273;IT=CBA-79321987-10540-2040235273-M43;OR=2;NA=1-1;OD=9/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235274;IT=CBA-79321987-10540-2040235274-M43;OR=3;NA=2-2;OD=50/1;SU=0;NF=79321987;CN=1;
     *
     * |MA;ID=M43-10540;IT=M43-10540;CN=1;SY=H;PY=c;NA=曼城;OR=3;
     * |PA;ID=2040235275;IT=CBA-79321987-10540-2040235275-M43;OR=1;NA=1-0;OD=5/2;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235276;IT=CBA-79321987-10540-2040235276-M43;OR=2;NA=2-0;OD=15/4;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235277;IT=CBA-79321987-10540-2040235277-M43;OR=3;NA=2-1;OD=12/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235278;IT=CBA-79321987-10540-2040235278-M43;OR=4;NA=3-0;OD=17/2;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235279;IT=CBA-79321987-10540-2040235279-M43;OR=5;NA=3-1;OD=25/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235280;IT=CBA-79321987-10540-2040235280-M43;OR=6;NA=3-2;OD=80/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235281;IT=CBA-79321987-10540-2040235281-M43;OR=7;NA=4-0;OD=22/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235282;IT=CBA-79321987-10540-2040235282-M43;OR=8;NA=4-1;OD=50/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2040235283;IT=CBA-79321987-10540-2040235283-M43;OR=9;NA=4-2;OD=200/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240068;IT=CBA-79321987-10540-2051240068-M43;OR=10;NA=5-0;OD=50/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240070;IT=CBA-79321987-10540-2051240070-M43;OR=11;NA=5-1;OD=125/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240075;IT=CBA-79321987-10540-2051240075-M43;OR=12;NA=6-0;OD=150/1;SU=0;NF=79321987;CN=1;
     * |PA;ID=2051240089;IT=CBA-79321987-10540-2051240089-M43;OR=13;NA=6-1;OD=500/1;SU=0;NF=79321987;CN=1;
     *
     * @param source
     * @param raceId
     */
    private void parseHalfScoreResult(String source, String raceId) {
        String[] originGroup = source.split("\\|MA;");

        RaceRateScoreOr hostRateScoreOr = spiderUtil.getRateScoreOr(raceId, 1, 1);
        String[] hostScoreArray = originGroup[2].split("\\|PA;");
        spiderUtil.scoreToBean(hostScoreArray, hostRateScoreOr);
        raceRateScoreOrMapper.updateByPrimaryKeySelective(hostRateScoreOr);

        RaceRateScoreOr drawRateScoreOr = spiderUtil.getRateScoreOr(raceId, 2, 1);
        String[] drawScoreArray = originGroup[3].split("\\|PA;");
        spiderUtil.scoreToBean(drawScoreArray, drawRateScoreOr);
        raceRateScoreOrMapper.updateByPrimaryKeySelective(drawRateScoreOr);

        RaceRateScoreOr guestRateScoreOr = spiderUtil.getRateScoreOr(raceId, 3, 1);
        String[] guestScoreArray = originGroup[4].split("\\|PA;");
        spiderUtil.scoreToBean(guestScoreArray, guestRateScoreOr);
        raceRateScoreOrMapper.updateByPrimaryKeySelective(guestRateScoreOr);
    }

    /**
     * |MG;ID=G10205;IT=G10205;NA=上半场进球;PD=#AC#B1#C1#D8#E79321987#F3#G10205#H4#I7#O2#;
     *
     * F|CL;ID=1;IT=X#AC#B1#C1#D8#E79321987#F3#G10205#H4#I7#O2#;OR=0;EX=7,#AC#B1#C1#D8#E79321987#F3#G10205#H4#I7#O2#@8,AUDIO1@9,BETTINGNEWS1@15,<;ED=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H1=1,#AS#B1#Q1#,0@2,#AS#B1#,1;H2=;NA=显示足球菜单,隐藏足球菜单;MF=1;NG=Sports/Soccer Coupon;NS=0;PV=2.0.364.0/SCC;|EV;ID=EMB;IT=XEMB;NA=热门赛事投注;OR=0;EX=富勒姆 v 曼城;CM=开始时间~20190330123000;TB=足球,#AS#B1#¬英格兰超级联赛,#AC#B1#C1#D13#E37628398#F2#¬富勒姆 v 曼城,#ABM#B1#C1#D8#E79321987#F3#I7#;EN=2;FI=79321987;P1=100055;P2=100011;CC=FA Barclaycard;CK=1123;|MG;ID=G10205;IT=G10205;NA=上半场进球;|MA;ID=M10205;IT=XM10205;CN=3;SY=A;PY=a;
     * |PA;ID=2051392823;IT=X79321987-2051392823;NA=无进球;OD=4/1;NF=79321987;
     * |PA;ID=2051392824;IT=X79321987-2051392824;NA=1个进球;OD=2/1;NF=79321987;
     * |PA;ID=2051392825;IT=X79321987-2051392825;NA=2个进球;OD=12/5;NF=79321987;
     * |PA;ID=2051392826;IT=X79321987-2051392826;NA=3个进球;OD=9/2;NF=79321987;
     * |PA;ID=2051392827;IT=X79321987-2051392827;NA=4个进球;OD=12/1;NF=79321987;
     * |PA;ID=2051392829;IT=X79321987-2051392829;NA=5+ 进球;OD=20/1;NF=79321987;|
     * @param source
     * @param raceId
     */
    private void parseHalfEnterBallNum(String source, String raceId) {
        Map<String, String> params = new HashMap<>();
        params.put("lid", "10");
        params.put("zid", "0");
        params.put("pd", source.split(";")[3].split("=")[1]);
        params.put("cid", "42");
        params.put("ctid", "42");
        String originContent = HttpClientUtil.doGet(BaseConstants.BASE_URL, params);

        RaceRateNumExample raceRateNumExample = new RaceRateNumExample();
        raceRateNumExample.createCriteria()
                .andRaceIdEqualTo(raceId)
                .andStateEqualTo(1)
                .andTypeEqualTo(1);
        List<RaceRateNum> raceRateNums = raceRateNumMapper.selectByExample(raceRateNumExample);

        RaceRateNum raceRateNum = null;
        if (raceRateNums != null && raceRateNums.size() > 0) {
            raceRateNum = raceRateNums.get(0);
            raceRateNum.setUpdateTime(new Date());
        } else {
            raceRateNum = new RaceRateNum();
            raceRateNum.setRaceId(raceId);
            raceRateNum.setType(1);
            raceRateNum.setUpdateTime(new Date());
            raceRateNum.setCreateTime(new Date());
            raceRateNum.setState(1);
            raceRateNumMapper.insertSelective(raceRateNum);
        }

        String[] lines = originContent.split("\\|PA;");
        String[] noneNum = lines[1].split(";")[3].split("=")[1].split("/");
        raceRateNum.setS0(Double.parseDouble(noneNum[0]) / Double.parseDouble(noneNum[1]) + 1.00);

        String[] one = lines[2].split(";")[3].split("=")[1].split("/");
        raceRateNum.setS1(Double.parseDouble(one[0]) / Double.parseDouble(one[1]) + 1.00);

        String[] two = lines[3].split(";")[3].split("=")[1].split("/");
        raceRateNum.setS2(Double.parseDouble(two[0]) / Double.parseDouble(two[1]) + 1.00);

        String[] three = lines[4].split(";")[3].split("=")[1].split("/");
        raceRateNum.setS3(Double.parseDouble(three[0]) / Double.parseDouble(three[1]) + 1.00);

        String[] four = lines[5].split(";")[3].split("=")[1].split("/");
        raceRateNum.setS4(Double.parseDouble(four[0]) / Double.parseDouble(four[1]) + 1.00);

        String[] five = lines[6].split(";")[3].split("=")[1].split("/");
        raceRateNum.setS5Up(Double.parseDouble(five[0]) / Double.parseDouble(five[1]) + 1.00);

        raceRateNumMapper.updateByPrimaryKey(raceRateNum);
    }

    /**
     * ID=G1579;IT=G1579;NA=半场结果;DO=1;|MA;ID=M1579;IT=M1579;CN=3;SY=A;PY=a;
     * |PA;ID=2040235261;IT=79321987-2040235261;NA=富勒姆;OD=10/1;NF=79321987;
     * |PA;ID=2040235262;IT=79321987-2040235262;NA=平局;OD=9/4;NF=79321987;
     * |PA;ID=2040235263;IT=79321987-2040235263;NA=曼城;OD=4/9;NF=79321987;
     * @param source
     */
    private void parseHalfResult(String source, String raceId) throws SpiderException {
        RaceRateBasicExample raceRateBasicExample = new RaceRateBasicExample();
        raceRateBasicExample.createCriteria().andRaceIdEqualTo(raceId);
        List<RaceRateBasic> raceRateBasics = raceRateBasicMapper.selectByExample(raceRateBasicExample);
        if (raceRateBasics == null || raceRateBasics.size() == 0) {
            throw new SpiderException("查询基础项数据失败，请先获取主要盘口数据");
        }

        RaceRateBasic raceRateBasic = raceRateBasics.get(0);
        String[] halfResultRate = source.split("\\|PA;");

        String[] hostWin = halfResultRate[1].split(";")[3].split("=")[1].split("/");
        raceRateBasic.setHalfHostWin(Double.parseDouble(hostWin[0]) / Double.parseDouble(hostWin[1]) + 1.00);

        String[] draw = halfResultRate[2].split(";")[3].split("=")[1].split("/");
        raceRateBasic.setHalfDraw(Double.parseDouble(draw[0]) / Double.parseDouble(draw[1]) + 1.00);

        String[] guestWin = halfResultRate[3].split(";")[3].split("=")[1].split("/");
        raceRateBasic.setHalfGuestWin(Double.parseDouble(guestWin[0]) / Double.parseDouble(guestWin[1]) + 1.00);

        raceRateBasicMapper.updateByPrimaryKeySelective(raceRateBasic);
    }
}
