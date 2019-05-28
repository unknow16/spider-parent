package com.unknow.spiderparent.service.impl;

import com.github.pagehelper.PageHelper;
import com.unknow.spiderparent.common.BaseConstants;
import com.unknow.spiderparent.entity.*;
import com.unknow.spiderparent.mapper.*;
import com.unknow.spiderparent.service.IRaceInfoService;
import com.unknow.spiderparent.utils.HttpClientUtil;
import com.unknow.spiderparent.utils.SpiderUtil;
import com.unknow.spiderparent.vo.*;
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
        if (type.intValue() == 5 || type.intValue() == 7 || type.intValue() == 8) {
            races = raceListArray[3].split("\\|PA;");
        } else if (type.intValue() == 6 || type.intValue() == 9) {
            races = raceListArray[4].split("\\|PA;");
        } else {
            races = raceListArray[5].split("\\|PA;");
        }
        List<RaceInfo> raceInfoList = new ArrayList<>();

        for (int i = 1; i < races.length; i = i + 3) {
            String[] hostInfo = races[i].split(";");
            String[] guestInfo = races[i + 1].split(";");
            String[] drawInfo = races[i + 2].split(";");

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
    public Map<String, Object> queryRaceRateDetailOption(String raceId, OptionVo optionVo) throws Exception {
        Map<String, Object> result = new HashMap<>();


        // 基础信息
        if (optionVo.getBasicInfo() != null && optionVo.getBasicInfo().size() > 0) {
            Map<String, Object> condition = new HashMap<>();
            condition.put("raceId", raceId);

            StringBuffer sb = new StringBuffer();
            for (String c : optionVo.getBasicInfo()) {
                sb.append(c).append(",");
            }
            String sbStr = sb.toString();
            condition.put("column_list", sbStr.substring(0, sbStr.length() - 1));

            List<RaceRateBasic> raceRateBasics = raceRateBasicMapper.selectByExampleOptions(condition);
            if (raceRateBasics != null && raceRateBasics.size() > 0) {
                result.put("basicInfo", raceRateBasics.get(0));
            } else {
                result.put("basicInfo", null);
            }
        }

        // 进球数
        if (optionVo.getEnterBallNum() != null) {
            Map<String, Object> condition = new HashMap<>();
            condition.put("raceId", raceId);

            if (optionVo.getEnterBallNum().getColumns() != null && optionVo.getEnterBallNum().getColumns().size() > 0) {

                StringBuffer sb = new StringBuffer();
                for (String c : optionVo.getEnterBallNum().getColumns()) {
                    sb.append(c).append(",");
                }
                String sbStr = sb.toString();
                condition.put("column_list", sbStr.substring(0, sbStr.length() - 1));
            }

            if (optionVo.getEnterBallNum().getType() != null && optionVo.getEnterBallNum().getType().size() > 0) {
                condition.put("type_list", optionVo.getEnterBallNum().getType());
            }

            List<RaceRateNum> raceRateNums = raceRateNumMapper.selectByExampleOptions(condition);
            result.put("enterBallNum", raceRateNums);
        }

        //
        if (optionVo.getScoreOr() != null) {
            Map<String, Object> condition = new HashMap<>();
            condition.put("raceId", raceId);

            if (optionVo.getScoreOr().getColumns() != null && optionVo.getScoreOr().getColumns().size() > 0) {

                StringBuffer sb = new StringBuffer();
                for (String c : optionVo.getScoreOr().getColumns()) {
                    sb.append(c).append(",");
                }
                String sbStr = sb.toString();
                condition.put("column_list", sbStr.substring(0, sbStr.length() - 1));
            }

            if (optionVo.getScoreOr().getHostType() != null && optionVo.getScoreOr().getHostType().size() > 0) {
                condition.put("host_type_list", optionVo.getScoreOr().getHostType());
            }

            if (optionVo.getScoreOr().getSessionType() != null && optionVo.getScoreOr().getSessionType().size() > 0) {
                condition.put("session_type_list", optionVo.getScoreOr().getSessionType());
            }

            List<RaceRateScoreOr> raceRateScoreOrs = raceRateScoreOrMapper.selectByExampleOptions(condition);
            result.put("scoreOr", raceRateScoreOrs);
        }
        return result;
    }

    @Override
    public Map<String, Object> queryRaceRateDetailOptionValue(String raceId, OptionValueRequestVo optionValueRequestVo) throws Exception {

        OptionValueVo optionValueVo = new OptionValueVo();
        optionValueVo.setPageInfo(optionValueRequestVo.getPageInfo());

        List<Map<String, Double>> basicInfo = new ArrayList<>();
        optionValueVo.setBasicInfo(basicInfo);

        EnterBallNumValue enterBallNumValue = new EnterBallNumValue();
        List<Integer> enterBallNumValueType = new ArrayList<>();
        List<Map<String, Double>> enterBallNumValueCondition = new ArrayList<>();
        enterBallNumValue.setType(enterBallNumValueType);
        enterBallNumValue.setCondition(enterBallNumValueCondition);
        optionValueVo.setEnterBallNum(enterBallNumValue);

        ScoreOrValue scoreOr = new ScoreOrValue();
        List<Integer> scoreOrType = new ArrayList<>();
        List<Map<String, Double>> scoreOrCondition = new ArrayList<>();
        scoreOr.setSessionType(scoreOrType);
        scoreOr.setCondition(scoreOrCondition);
        optionValueVo.setScoreOr(scoreOr);

        Map<String, Double> dynamicMap = optionValueRequestVo.getDynamic();
        if (dynamicMap != null) {
            Set<Map.Entry<String, Double>> entrySet = dynamicMap.entrySet();
            for (Map.Entry<String, Double> entry : entrySet) {
                String key = entry.getKey();
                Double value = entry.getValue();
                if (key.startsWith("basicInfo")) {
                    String[] split = key.split("&");
                    Map<String, Double> map = new HashMap<>();
                    map.put(split[1], value);
                    basicInfo.add(map);
                }

                if (key.startsWith("enterBallNum")) {
                    String[] split = key.split("&");
                    enterBallNumValueType.add(Integer.parseInt(split[2]));
                    Map<String, Double> map = new HashMap<>();
                    map.put(split[1], value);
                    enterBallNumValueCondition.add(map);
                }

                if (key.startsWith("scoreOr")) {
                    String[] split = key.split("&");
                    scoreOrType.add(Integer.parseInt(split[2]));
                    Map<String, Double> map = new HashMap<>();
                    map.put(split[1], value);
                    scoreOrCondition.add(map);
                }
            }
        }

        Map<String, Object> result = new HashMap<>();
        // 基础信息
        if (optionValueVo.getBasicInfo() != null && optionValueVo.getBasicInfo().size() > 0) {
            Map<String, Object> condition = new HashMap<>();
            condition.put("raceId", raceId);

            StringBuffer whereCondition = new StringBuffer(" and ");

            for (Map<String, Double> map : optionValueVo.getBasicInfo()) {
                Set<Map.Entry<String, Double>> entrySet = map.entrySet();
                for (Map.Entry<String, Double> entry : entrySet) {
                    String key = entry.getKey();
                    Double value = entry.getValue();

                    if (value.doubleValue() == 0) {
                        continue;
                    }
                    whereCondition.append(key).append(" = ").append(value.toString()).append(" and ");
                }
                String whereConditionStr = whereCondition.toString();
                condition.put("where_cond", whereConditionStr.substring(0, whereConditionStr.length() - 5));
            }

            StringBuffer columns = new StringBuffer();
            List<String> main = optionValueRequestVo.getMain();
            if (main != null && main.size() > 0) {
                for (String s: main) {
                    if (s.startsWith("basicInfo")) {
                        String[] split = s.split("&");
                        columns.append(split[1]).append(",");
                    }
                }
                String columnsStr = columns.toString();
                condition.put("column_list", columnsStr.substring(0, columnsStr.length() - 1));
            }



            List<RaceRateBasic> raceRateBasics = raceRateBasicMapper.selectByExampleOptionsValue(condition);
            if (raceRateBasics != null && raceRateBasics.size() > 0) {
                result.put("basicInfo", raceRateBasics.get(0));
            } else {
                result.put("basicInfo", null);
            }
        }

        // 进球数
        EnterBallNumValue enterBallNumValue11 = optionValueVo.getEnterBallNum();
        if (enterBallNumValue11 != null ) {
            Map<String, Object> condition = new HashMap<>();
            condition.put("raceId", raceId);

            List<Integer> types = enterBallNumValue11.getType();
            if (types != null && types.size() > 0) {
                condition.put("type_list", types);
            }

            List<Map<String, Double>> condList = enterBallNumValue11.getCondition();
            if (condList != null && condList.size() > 0) {

                StringBuffer whereCondition = new StringBuffer(" and (");
                for (Map<String, Double> map : condList) {
                    Set<Map.Entry<String, Double>> entrySet = map.entrySet();

                    for (Map.Entry<String, Double> entry : entrySet) {
                        String key = entry.getKey();
                        Double value = entry.getValue();

                        if (value.doubleValue() == 0) {
                            continue;
                        }
                        whereCondition.append(key).append(" = ").append(value.toString()).append(" or ");
                    }
                }

                //String columnsStr = columns.toString();
                //condition.put("column_list", columnsStr.substring(0, columnsStr.length() - 1));

                String whereConditionStr = whereCondition.toString();
                condition.put("where_cond", whereConditionStr.substring(0, whereConditionStr.length() - 5) + ")");
            }

            List<RaceRateNum> raceRateNums = raceRateNumMapper.selectByExampleOptionsValue(condition);
            result.put("enterBallNum", raceRateNums);
        }


        //
        ScoreOrValue scoreOr11 = optionValueVo.getScoreOr();
        if (scoreOr11 != null) {
            Map<String, Object> condition = new HashMap<>();
            condition.put("raceId", raceId);

            if (scoreOr11.getSessionType() != null && scoreOr11.getSessionType().size() > 0) {
                condition.put("session_type_list", scoreOr11.getSessionType());
            }

            List<Map<String, Double>> scoreOrCondition11 = scoreOr11.getCondition();
            if (scoreOrCondition11 != null && scoreOrCondition11.size() > 0) {

                StringBuffer columns = new StringBuffer();
                StringBuffer whereCondition = new StringBuffer(" and ( ");
                for (Map<String, Double> map : scoreOrCondition11) {
                    Set<Map.Entry<String, Double>> entrySet = map.entrySet();

                    for (Map.Entry<String, Double> entry : entrySet) {
                        String key = entry.getKey();
                        Double value = entry.getValue();

                        columns.append(key).append(",");
                        whereCondition.append(key).append(" = ").append(value.toString()).append(" or ");
                    }
                }

                // String columnsStr = columns.toString();
                // condition.put("column_list", columnsStr.substring(0, columnsStr.length() - 1));

                String whereConditionStr = whereCondition.toString();
                condition.put("where_cond", whereConditionStr.substring(0, whereConditionStr.length() - 5) + " )");

            }

            List<RaceRateScoreOr> raceRateScoreOrs = raceRateScoreOrMapper.selectByExampleOptionsValue(condition);
            result.put("scoreOr", raceRateScoreOrs);
        }


        return result;
    }

}
