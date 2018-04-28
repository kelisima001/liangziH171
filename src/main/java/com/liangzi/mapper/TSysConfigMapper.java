package com.liangzi.mapper;

import com.liangzi.pojo.TSysConfig;
import com.liangzi.pojo.TSysConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysConfigMapper {
    long countByExample(TSysConfigExample example);

    int deleteByExample(TSysConfigExample example);

    int deleteByPrimaryKey(Long cfgId);

    int insert(TSysConfig record);

    int insertSelective(TSysConfig record);

    List<TSysConfig> selectByExample(TSysConfigExample example);

    TSysConfig selectByPrimaryKey(Long cfgId);

    int updateByExampleSelective(@Param("record") TSysConfig record, @Param("example") TSysConfigExample example);

    int updateByExample(@Param("record") TSysConfig record, @Param("example") TSysConfigExample example);

    int updateByPrimaryKeySelective(TSysConfig record);

    int updateByPrimaryKey(TSysConfig record);
}