package com.liangzi.mapper;

import com.liangzi.pojo.TSystemMenu;
import com.liangzi.pojo.TSystemMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemMenuMapper {
    long countByExample(TSystemMenuExample example);

    int deleteByExample(TSystemMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSystemMenu record);

    int insertSelective(TSystemMenu record);

    List<TSystemMenu> selectByExample(TSystemMenuExample example);

    TSystemMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSystemMenu record, @Param("example") TSystemMenuExample example);

    int updateByExample(@Param("record") TSystemMenu record, @Param("example") TSystemMenuExample example);

    int updateByPrimaryKeySelective(TSystemMenu record);

    int updateByPrimaryKey(TSystemMenu record);
}