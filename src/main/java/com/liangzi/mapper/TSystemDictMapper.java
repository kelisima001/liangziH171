package com.liangzi.mapper;

import com.liangzi.pojo.TSystemDict;
import com.liangzi.pojo.TSystemDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemDictMapper {
    long countByExample(TSystemDictExample example);

    int deleteByExample(TSystemDictExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSystemDict record);

    int insertSelective(TSystemDict record);

    List<TSystemDict> selectByExample(TSystemDictExample example);

    TSystemDict selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSystemDict record, @Param("example") TSystemDictExample example);

    int updateByExample(@Param("record") TSystemDict record, @Param("example") TSystemDictExample example);

    int updateByPrimaryKeySelective(TSystemDict record);

    int updateByPrimaryKey(TSystemDict record);
}