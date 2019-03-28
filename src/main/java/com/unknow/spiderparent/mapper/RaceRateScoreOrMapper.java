package com.unknow.spiderparent.mapper;

import com.unknow.spiderparent.entity.RaceRateScoreOr;
import com.unknow.spiderparent.entity.RaceRateScoreOrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RaceRateScoreOrMapper {
    int countByExample(RaceRateScoreOrExample example);

    int deleteByExample(RaceRateScoreOrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RaceRateScoreOr record);

    int insertSelective(RaceRateScoreOr record);

    List<RaceRateScoreOr> selectByExample(RaceRateScoreOrExample example);

    RaceRateScoreOr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RaceRateScoreOr record, @Param("example") RaceRateScoreOrExample example);

    int updateByExample(@Param("record") RaceRateScoreOr record, @Param("example") RaceRateScoreOrExample example);

    int updateByPrimaryKeySelective(RaceRateScoreOr record);

    int updateByPrimaryKey(RaceRateScoreOr record);
}