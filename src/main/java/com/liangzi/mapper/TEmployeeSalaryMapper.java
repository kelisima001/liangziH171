package com.liangzi.mapper;

import com.liangzi.pojo.TEmployeeSalary;
import com.liangzi.pojo.TEmployeeSalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEmployeeSalaryMapper {
    long countByExample(TEmployeeSalaryExample example);

    int deleteByExample(TEmployeeSalaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TEmployeeSalary record);

    int insertSelective(TEmployeeSalary record);

    List<TEmployeeSalary> selectByExample(TEmployeeSalaryExample example);

    TEmployeeSalary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TEmployeeSalary record, @Param("example") TEmployeeSalaryExample example);

    int updateByExample(@Param("record") TEmployeeSalary record, @Param("example") TEmployeeSalaryExample example);

    int updateByPrimaryKeySelective(TEmployeeSalary record);

    int updateByPrimaryKey(TEmployeeSalary record);
}