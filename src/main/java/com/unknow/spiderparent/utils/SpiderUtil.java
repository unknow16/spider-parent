package com.unknow.spiderparent.utils;

import com.unknow.spiderparent.common.BaseConstants;
import com.unknow.spiderparent.common.SpiderException;
import com.unknow.spiderparent.entity.*;
import com.unknow.spiderparent.mapper.RaceRateBasicMapper;
import com.unknow.spiderparent.mapper.RaceRateNumMapper;
import com.unknow.spiderparent.mapper.RaceRateScoreOrMapper;
import com.unknow.spiderparent.mapper.RaceTabRefMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SpiderUtil {

    @Autowired
    private RaceRateBasicMapper raceRateBasicMapper;

    @Autowired
    private RaceRateNumMapper raceRateNumMapper;

    @Autowired
    private RaceRateScoreOrMapper raceRateScoreOrMapper;

    @Autowired
    private RaceTabRefMapper raceTabRefMapper;

    public Map<String, String> getLeagueIdParams(Integer type) {
        String leagueId = getLeagueIdByType(type);
        return createParamMap(leagueId);
    }

    public Map<String, String> getEnterBallParam(String raceId) throws SpiderException {
        RaceTabRef raceTabRef = getRaceTabRefByRaceId(raceId);
        return createParamMap(raceTabRef.getEnterBall());
    }

    public Map<String, String> getUpDownSectionParam(String raceId) throws SpiderException {
        RaceTabRef raceTabRef = getRaceTabRefByRaceId(raceId);
        return createParamMap(raceTabRef.getUpDownSection());
    }

    private RaceTabRef getRaceTabRefByRaceId(String raceId) throws SpiderException {
        RaceTabRefExample raceTabRefExample = new RaceTabRefExample();
        raceTabRefExample.createCriteria().andRaceIdEqualTo(raceId);
        List<RaceTabRef> raceTabRefs = raceTabRefMapper.selectByExample(raceTabRefExample);
        if (raceTabRefs == null || raceTabRefs.size() == 0) {
            throw new SpiderException("查询切换页id为空，请先获取主要盘口数据");
        }
        return raceTabRefs.get(0);
    }

    public String getLeagueIdByType(Integer type) {
        String leagueId = "";
        switch (type) {
            case 1: leagueId = BaseConstants.YING_CHAO; break;
            case 2: leagueId = BaseConstants.XI_JIA; break;
            case 3: leagueId = BaseConstants.DE_JIA; break;
            case 4: leagueId = BaseConstants.RUI_DI_CHAO; break;
            case 5: leagueId = BaseConstants.OU_GUAN; break;
            case 6: leagueId = BaseConstants.RI_BEN_J; break;
            case 7: leagueId = BaseConstants.RI_BEN_J2; break;
            case 8: leagueId = BaseConstants.OU_ZHOU_LIAN_SAI; break;
            case 9: leagueId = BaseConstants.MEI_ZHOU_BEI; break;
        }
        return leagueId;
    }

    private Map<String, String> createParamMap(String id) {
        Map<String, String> params = new HashMap<>();
        params.put("lid", "10");
        params.put("zid", "0");
        params.put("pd", id);
        params.put("cid", "42");
        params.put("ctid", "42");
        return params;
    }

    public Double parseThreeTypeRate(String source) {
        String[] up = source.split(";")[3].split("=")[1].split("/");
        return Double.parseDouble(up[0]) / Double.parseDouble(up[1]) + 1.00;
    }

    public RaceRateBasic getRaceRateBasic(String raceId) {
        RaceRateBasicExample raceRateBasicExample = new RaceRateBasicExample();
        raceRateBasicExample.createCriteria()
                .andStateEqualTo(1)
                .andRaceIdEqualTo(raceId);
        List<RaceRateBasic> raceRateBasics = raceRateBasicMapper.selectByExample(raceRateBasicExample);
        RaceRateBasic raceRateBasic = null;
        if (raceRateBasics != null && raceRateBasics.size() > 0) {
            raceRateBasic = raceRateBasics.get(0);
            raceRateBasic.setUpdateTime(new Date());
        } else {
            raceRateBasic = new RaceRateBasic();
            raceRateBasic.setRaceId(raceId);
            raceRateBasic.setCreateTime(new Date());
            raceRateBasic.setUpdateTime(new Date());
            raceRateBasic.setState(1);
            raceRateBasicMapper.insert(raceRateBasic);
        }
        return raceRateBasic;
    }

    public RaceRateNum getRaceRateNum(String raceId, Integer type) {
        RaceRateNumExample raceRateNumExample = new RaceRateNumExample();
        raceRateNumExample.createCriteria()
                .andTypeEqualTo(type)
                .andStateEqualTo(1)
                .andRaceIdEqualTo(raceId);
        List<RaceRateNum> raceRateNums = raceRateNumMapper.selectByExample(raceRateNumExample);
        RaceRateNum raceRateNum = null;
        if (raceRateNums != null && raceRateNums.size() > 0) {
            raceRateNum = raceRateNums.get(0);
            raceRateNum.setUpdateTime(new Date());
        } else {
            raceRateNum = new RaceRateNum();
            raceRateNum.setRaceId(raceId);
            raceRateNum.setCreateTime(new Date());
            raceRateNum.setUpdateTime(new Date());
            raceRateNum.setType(type);
            raceRateNum.setState(1);
            raceRateNumMapper.insertSelective(raceRateNum);
        }
        return raceRateNum;
    }

    public RaceRateScoreOr getRateScoreOr(String raceId, Integer hostType, Integer sessionType) {
        RaceRateScoreOrExample raceRateScoreOrExample = new RaceRateScoreOrExample();
        raceRateScoreOrExample.createCriteria()
                .andRaceIdEqualTo(raceId)
                .andSessionTypeEqualTo(sessionType)
                .andHostTypeEqualTo(hostType)
                .andStateEqualTo(1);
        List<RaceRateScoreOr> raceRateScoreOrs = raceRateScoreOrMapper.selectByExample(raceRateScoreOrExample);

        RaceRateScoreOr hostScoreRate = null;
        if (raceRateScoreOrs != null && raceRateScoreOrs.size() > 0) {
            hostScoreRate = raceRateScoreOrs.get(0);
            hostScoreRate.setUpdateTime(new Date());
        } else {
            hostScoreRate = new RaceRateScoreOr();
            hostScoreRate.setRaceId(raceId);
            hostScoreRate.setCreateTime(new Date());
            hostScoreRate.setUpdateTime(new Date());
            hostScoreRate.setSessionType(sessionType);
            hostScoreRate.setState(1);
            hostScoreRate.setHostType(hostType);
            raceRateScoreOrMapper.insertSelective(hostScoreRate);
        }
        return hostScoreRate;
    }

    public void scoreToBean(String[] hostScore, RaceRateScoreOr hostScoreRate) {
        for (int i = 1; i < hostScore.length; i++) {
            // 比分：eg: 1-0
            String[] scoreArray = hostScore[i].split(";");
            String score = scoreArray[3].split("=")[1];
            String[] scoreRateArray = scoreArray[4].split("=")[1].split("/");
            Double scoreRate = Double.parseDouble(scoreRateArray[0]) / Double.parseDouble(scoreRateArray[1]) + 1.00;
            switch (score) {
                case "1-0": hostScoreRate.setS10(scoreRate); break;
                case "2-0": hostScoreRate.setS20(scoreRate); break;
                case "2-1": hostScoreRate.setS21(scoreRate); break;
                case "3-0": hostScoreRate.setS30(scoreRate); break;
                case "3-1": hostScoreRate.setS31(scoreRate); break;
                case "3-2": hostScoreRate.setS32(scoreRate); break;
                case "4-0": hostScoreRate.setS40(scoreRate); break;
                case "4-1": hostScoreRate.setS41(scoreRate); break;
                case "4-2": hostScoreRate.setS42(scoreRate); break;
                case "4-3": hostScoreRate.setS43(scoreRate); break;
                case "5-0": hostScoreRate.setS50(scoreRate); break;
                case "5-1": hostScoreRate.setS51(scoreRate); break;
                case "5-2": hostScoreRate.setS52(scoreRate); break;
                case "5-3": hostScoreRate.setS53(scoreRate); break;
                case "5-4": hostScoreRate.setS54(scoreRate); break;
                case "6-0": hostScoreRate.setS60(scoreRate); break;
                case "6-1": hostScoreRate.setS61(scoreRate); break;
                case "6-2": hostScoreRate.setS62(scoreRate); break;
                case "6-3": hostScoreRate.setS63(scoreRate); break;
                case "6-4": hostScoreRate.setS64(scoreRate); break;
                case "6-5": hostScoreRate.setS65(scoreRate); break;
                case "7-0": hostScoreRate.setS70(scoreRate); break;
                case "7-1": hostScoreRate.setS71(scoreRate); break;
                case "7-2": hostScoreRate.setS72(scoreRate); break;
                case "7-3": hostScoreRate.setS73(scoreRate); break;
                case "7-4": hostScoreRate.setS74(scoreRate); break;
                case "7-5": hostScoreRate.setS75(scoreRate); break;
                case "7-6": hostScoreRate.setS76(scoreRate); break;
                case "0-0": hostScoreRate.setS00(scoreRate); break;
                case "1-1": hostScoreRate.setS11(scoreRate); break;
                case "2-2": hostScoreRate.setS22(scoreRate); break;
                case "3-3": hostScoreRate.setS33(scoreRate); break;
                case "4-4": hostScoreRate.setS44(scoreRate); break;
                case "5-5": hostScoreRate.setS55(scoreRate); break;
                case "6-6": hostScoreRate.setS66(scoreRate); break;
                case "7-7": hostScoreRate.setS77(scoreRate); break;
            }
        }
    }
}
