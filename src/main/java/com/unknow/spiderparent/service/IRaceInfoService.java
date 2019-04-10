package com.unknow.spiderparent.service;

import com.unknow.spiderparent.common.OptionVo;
import com.unknow.spiderparent.entity.*;

import java.util.List;
import java.util.Map;

public interface IRaceInfoService {

    List<RaceInfo> queryRaceInfoList(Integer type, Integer pageNum, Integer pageSize) throws Exception;
    int countRaceInfoList(Integer type);

    List<RaceInfo> fetchRaceInfoList(Integer type) throws Exception;

    RaceRateBasic queryRaceRateBasic(String raceId);
    List<RaceRateNum> queryRaceRateNum(String raceId);
    RaceRateScoreAnd queryRaceRateScoreAnd(String raceId);
    List<RaceRateScoreOr> queryRaceRateScoreOr(String raceId);

    int addRaceInfo(RaceInfo record);

    Map<String, Object> queryRaceRateDetail(String raceId);
    Map<String, Object> queryRaceRateDetailOption(String raceId, OptionVo options);
}
