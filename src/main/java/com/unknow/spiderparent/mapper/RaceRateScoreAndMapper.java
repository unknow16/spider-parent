package com.unknow.spiderparent.mapper;

import com.unknow.spiderparent.entity.RaceRateScoreAnd;
import com.unknow.spiderparent.entity.RaceRateScoreAndExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RaceRateScoreAndMapper {
    int countByExample(RaceRateScoreAndExample example);

    int deleteByExample(RaceRateScoreAndExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RaceRateScoreAnd record);

    int insertSelective(RaceRateScoreAnd record);

    List<RaceRateScoreAnd> selectByExample(RaceRateScoreAndExample example);

    RaceRateScoreAnd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RaceRateScoreAnd record, @Param("example") RaceRateScoreAndExample example);

    int updateByExample(@Param("record") RaceRateScoreAnd record, @Param("example") RaceRateScoreAndExample example);

    int updateByPrimaryKeySelective(RaceRateScoreAnd record);

    int updateByPrimaryKey(RaceRateScoreAnd record);
}