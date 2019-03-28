package com.unknow.spiderparent.mapper;

import com.unknow.spiderparent.entity.RaceInfo;
import com.unknow.spiderparent.entity.RaceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RaceInfoMapper {
    int countByExample(RaceInfoExample example);

    int deleteByExample(RaceInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RaceInfo record);

    int insertSelective(RaceInfo record);

    List<RaceInfo> selectByExample(RaceInfoExample example);

    RaceInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RaceInfo record, @Param("example") RaceInfoExample example);

    int updateByExample(@Param("record") RaceInfo record, @Param("example") RaceInfoExample example);

    int updateByPrimaryKeySelective(RaceInfo record);

    int updateByPrimaryKey(RaceInfo record);
}