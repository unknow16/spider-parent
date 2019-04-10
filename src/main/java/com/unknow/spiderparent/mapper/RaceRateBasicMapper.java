package com.unknow.spiderparent.mapper;

import com.unknow.spiderparent.entity.RaceRateBasic;
import com.unknow.spiderparent.entity.RaceRateBasicExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RaceRateBasicMapper {
    int countByExample(RaceRateBasicExample example);

    int deleteByExample(RaceRateBasicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RaceRateBasic record);

    int insertSelective(RaceRateBasic record);

    List<RaceRateBasic> selectByExample(RaceRateBasicExample example);
    List<RaceRateBasic> selectByExampleOptions(Map<String, Object> options);

    RaceRateBasic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RaceRateBasic record, @Param("example") RaceRateBasicExample example);

    int updateByExample(@Param("record") RaceRateBasic record, @Param("example") RaceRateBasicExample example);

    int updateByPrimaryKeySelective(RaceRateBasic record);

    int updateByPrimaryKey(RaceRateBasic record);
}