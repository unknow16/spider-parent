package com.unknow.spiderparent.mapper;

import com.unknow.spiderparent.entity.RaceTabRef;
import com.unknow.spiderparent.entity.RaceTabRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RaceTabRefMapper {
    int countByExample(RaceTabRefExample example);

    int deleteByExample(RaceTabRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RaceTabRef record);

    int insertSelective(RaceTabRef record);

    List<RaceTabRef> selectByExample(RaceTabRefExample example);

    RaceTabRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RaceTabRef record, @Param("example") RaceTabRefExample example);

    int updateByExample(@Param("record") RaceTabRef record, @Param("example") RaceTabRefExample example);

    int updateByPrimaryKeySelective(RaceTabRef record);

    int updateByPrimaryKey(RaceTabRef record);
}