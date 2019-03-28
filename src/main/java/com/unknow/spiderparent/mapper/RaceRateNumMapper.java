package com.unknow.spiderparent.mapper;

import com.unknow.spiderparent.entity.RaceRateNum;
import com.unknow.spiderparent.entity.RaceRateNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RaceRateNumMapper {
    int countByExample(RaceRateNumExample example);

    int deleteByExample(RaceRateNumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RaceRateNum record);

    int insertSelective(RaceRateNum record);

    List<RaceRateNum> selectByExample(RaceRateNumExample example);

    RaceRateNum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RaceRateNum record, @Param("example") RaceRateNumExample example);

    int updateByExample(@Param("record") RaceRateNum record, @Param("example") RaceRateNumExample example);

    int updateByPrimaryKeySelective(RaceRateNum record);

    int updateByPrimaryKey(RaceRateNum record);
}