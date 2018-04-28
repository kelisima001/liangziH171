package com.liangzi.mapper;

import com.liangzi.pojo.TSystemDept;
import com.liangzi.pojo.TSystemDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemDeptMapper {
    long countByExample(TSystemDeptExample example);

    int deleteByExample(TSystemDeptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSystemDept record);

    int insertSelective(TSystemDept record);

    List<TSystemDept> selectByExample(TSystemDeptExample example);

    TSystemDept selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSystemDept record, @Param("example") TSystemDeptExample example);

    int updateByExample(@Param("record") TSystemDept record, @Param("example") TSystemDeptExample example);

    int updateByPrimaryKeySelective(TSystemDept record);

    int updateByPrimaryKey(TSystemDept record);
}