package com.unknow.spiderparent.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unknow.spiderparent.common.BaseConstants;
import com.unknow.spiderparent.common.OptionVo;
import com.unknow.spiderparent.entity.*;
import com.unknow.spiderparent.mapper.*;
import com.unknow.spiderparent.service.IRaceInfoService;
import com.unknow.spiderparent.utils.HttpClientUtil;
import com.unknow.spiderparent.utils.SpiderUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class RaceInfoServiceImpl implements IRaceInfoService {

    private Logger logger = LoggerFactory.getLogger(RaceInfoServiceImpl.class);

    @Autowired
    private RaceInfoMapper raceInfoMapper;

    @Autowired
    private RaceRateBasicMapper raceRateBasicMapper;

    @Autowired
    private RaceRateNumMapper raceRateNumMapper;

    @Autowired
    private RaceRateScoreAndMapper raceRateScoreAndMapper;

    @Autowired
    private RaceRateScoreOrMapper raceRateScoreOrMapper;

    @Autowired
    private SpiderUtil spiderUtil;

    /**
     *
     * @param type 联赛类型： 1=英超
     * @return
     */
    @Override
    public List<RaceInfo> fetchRaceInfoList(Integer type) throws Exception {
        Map<String, String> params = spiderUtil.getLeagueIdParams(type);
        String respOriginContent = HttpClientUtil.doGet(BaseConstants.BASE_URL, params);
        logger.info("获取比赛信息列表===>[原始数据]: {}", respOriginContent);

        if (StringUtils.isBlank(respOriginContent)) {
            throw new RuntimeException("获取比赛信息列表原始数据为空");
        }

        String[] raceListArray = respOriginContent.split("\\|MA;");

        String[] races = null;
        if (type.intValue() == 5 || type.intValue() ==  7 || type.intValue() == 8) {
            races = raceListArray[3].split("\\|PA;");
        } else if (type.intValue() == 6 || type.intValue() == 9) {
            races = raceListArray[4].split("\\|PA;");
        } else {
            races = raceListArray[5].split("\\|PA;");
        }
        List<RaceInfo> raceInfoList = new ArrayList<>();

        for(int i = 1; i < races.length; i = i+3) {
            String[] hostInfo = races[i].split(";");
            String[] guestInfo = races[i+1].split(";");
            String[] drawInfo = races[i+2].split(";");

            String raceId = drawInfo[4].split("=")[1];

            RaceInfoExample raceInfoExample = new RaceInfoExample();
            raceInfoExample.createCriteria()
                    .andRaceIdEqualTo(raceId)
                    .andStateEqualTo(1)
                    .andRaceTypeEqualTo(type);
            List<RaceInfo> raceInfoListResult = raceInfoMapper.selectByExample(raceInfoExample);
            if (raceInfoListResult != null && raceInfoListResult.size() > 0) continue;

            RaceInfo raceInfo = new RaceInfo();
            raceInfo.setCreateTime(new Date());
            raceInfo.setUpdateTime(new Date());
            raceInfo.setState(1);

            raceInfo.setRaceId(raceId);
            raceInfo.setRaceType(type);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
            raceInfo.setRaceTime(sdf.parse(hostInfo[4].split("=")[1]));
            raceInfo.setHostTeam(hostInfo[2].split("=")[1]);

            raceInfo.setGuestTeam(guestInfo[2].split("=")[1]);
            raceInfoList.add(raceInfo);

            // 抓取并保存基础赔率信息
            raceInfoMapper.insert(raceInfo);
        }
        return raceInfoList;
    }

    @Override
    public List<RaceInfo> queryRaceInfoList(Integer type, Integer pageNum, Integer pageSize) throws Exception {
        RaceInfoExample raceInfoExample = new RaceInfoExample();
        raceInfoExample.createCriteria().andRaceTypeEqualTo(type);
        PageHelper.startPage(pageNum, pageSize, false);
        List<RaceInfo> raceInfos = raceInfoMapper.selectByExample(raceInfoExample);
        return raceInfos;
    }

    @Override
    public int countRaceInfoList(Integer type) {
        RaceInfoExample raceInfoExample = new RaceInfoExample();
        raceInfoExample.createCriteria().andRaceTypeEqualTo(type);
        return raceInfoMapper.countByExample(raceInfoExample);
    }

    @Override
    public RaceRateBasic queryRaceRateBasic(String raceId) {
        RaceRateBasicExample raceRateBasicExample = new RaceRateBasicExample();
        raceRateBasicExample.createCriteria().andRaceIdEqualTo(raceId);
        List<RaceRateBasic> raceRateBasics = raceRateBasicMapper.selectByExample(raceRateBasicExample);
        if (raceRateBasics != null && raceRateBasics.size() > 0) {
            return raceRateBasics.get(0);
        }
        return null;
    }

    @Override
    public List<RaceRateNum> queryRaceRateNum(String raceId) {
        RaceRateNumExample raceRateNumExample = new RaceRateNumExample();
        raceRateNumExample.createCriteria().andRaceIdEqualTo(raceId);
        List<RaceRateNum> raceRateNums = raceRateNumMapper.selectByExample(raceRateNumExample);
        if (raceRateNums != null && raceRateNums.size() > 0) {
            return raceRateNums;
        }
        return null;
    }

    @Override
    public RaceRateScoreAnd queryRaceRateScoreAnd(String raceId) {
        RaceRateScoreAndExample raceRateScoreAndExample = new RaceRateScoreAndExample();
        raceRateScoreAndExample.createCriteria().andRaceIdEqualTo(raceId);
        List<RaceRateScoreAnd> raceRateScoreAnds = raceRateScoreAndMapper.selectByExample(raceRateScoreAndExample);
        if (raceRateScoreAnds != null && raceRateScoreAnds.size() > 0) {
            return raceRateScoreAnds.get(0);
        }
        return null;
    }

    @Override
    public List<RaceRateScoreOr> queryRaceRateScoreOr(String raceId) {
        RaceRateScoreOrExample raceRateScoreOrExample = new RaceRateScoreOrExample();
        raceRateScoreOrExample.createCriteria().andRaceIdEqualTo(raceId);
        List<RaceRateScoreOr> raceRateScoreOrs = raceRateScoreOrMapper.selectByExample(raceRateScoreOrExample);
        if (raceRateScoreOrs != null && raceRateScoreOrs.size() > 0) {
            return raceRateScoreOrs;
        }
        return null;
    }

    @Override
    public int addRaceInfo(RaceInfo record) {
        return 0;
    }

    @Override
    public Map<String, Object> queryRaceRateDetail(String raceId) {
        Map<String, Object> result = new HashMap<>();
        RaceRateBasicExample raceRateBasicExample = new RaceRateBasicExample();
        raceRateBasicExample.createCriteria()
                .andRaceIdEqualTo(raceId)
                .andStateEqualTo(1);
        List<RaceRateBasic> raceRateBasics = raceRateBasicMapper.selectByExample(raceRateBasicExample);
        if (raceRateBasics != null && raceRateBasics.size() > 0) {
            result.put("basicInfo", raceRateBasics.get(0));
        } else {
            result.put("basicInfo", null);
        }

        RaceRateNumExample raceRateNumExample = new RaceRateNumExample();
        raceRateNumExample.createCriteria()
                .andRaceIdEqualTo(raceId)
                .andStateEqualTo(1);
        List<RaceRateNum> raceRateNums = raceRateNumMapper.selectByExample(raceRateNumExample);
        result.put("enterBallNum", raceRateNums);

        RaceRateScoreOrExample raceRateScoreOrExample = new RaceRateScoreOrExample();
        raceRateScoreOrExample.createCriteria()
                .andRaceIdEqualTo(raceId)
                .andStateEqualTo(1);
        List<RaceRateScoreOr> raceRateScoreOrs = raceRateScoreOrMapper.selectByExample(raceRateScoreOrExample);
        result.put("scoreOr", raceRateScoreOrs);
        return result;
    }

    @Override
    public Map<String, Object> queryRaceRateDetailOption(String raceId, OptionVo options) {
        Map<String, Object> result = new HashMap<>();

        Map<String, Object> condition = new HashMap<>();
        condition.put("raceId", raceId);

        condition.put("column_list", "full_host_win,full_guest_win");

        StringBuffer whereSb = new StringBuffer();
        whereSb.append(" and 1 = 1");
        condition.put("where_list", whereSb.toString());

        List<RaceRateBasic> raceRateBasics = raceRateBasicMapper.selectByExampleOptions(condition);
        if (raceRateBasics != null && raceRateBasics.size() > 0) {
            result.put("basicInfo", raceRateBasics.get(0));
        } else {
            result.put("basicInfo", null);
        }

        return result;
    }

}
