package com.unknow.spiderparent.mapper;

import com.unknow.spiderparent.entity.RaceRateScoreOr;
import com.unknow.spiderparent.entity.RaceRateScoreOrExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RaceRateScoreOrMapper {
    int countByExample(RaceRateScoreOrExample example);

    int deleteByExample(RaceRateScoreOrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RaceRateScoreOr record);

    int insertSelective(RaceRateScoreOr record);

    List<RaceRateScoreOr> selectByExample(RaceRateScoreOrExample example);
    List<RaceRateScoreOr> selectByExampleOptions(Map<String, Object> options);
    List<RaceRateScoreOr> selectByExampleOptionsValue(Map<String, Object> options);

    RaceRateScoreOr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RaceRateScoreOr record, @Param("example") RaceRateScoreOrExample example);

    int updateByExample(@Param("record") RaceRateScoreOr record, @Param("example") RaceRateScoreOrExample example);

    int updateByPrimaryKeySelective(RaceRateScoreOr record);

    int updateByPrimaryKey(RaceRateScoreOr record);
}