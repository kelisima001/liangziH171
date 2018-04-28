package com.liangzi.mapper;

import com.liangzi.pojo.TEmployeeUserRef;
import com.liangzi.pojo.TEmployeeUserRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEmployeeUserRefMapper {
    long countByExample(TEmployeeUserRefExample example);

    int deleteByExample(TEmployeeUserRefExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TEmployeeUserRef record);

    int insertSelective(TEmployeeUserRef record);

    List<TEmployeeUserRef> selectByExample(TEmployeeUserRefExample example);

    TEmployeeUserRef selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TEmployeeUserRef record, @Param("example") TEmployeeUserRefExample example);

    int updateByExample(@Param("record") TEmployeeUserRef record, @Param("example") TEmployeeUserRefExample example);

    int updateByPrimaryKeySelective(TEmployeeUserRef record);

    int updateByPrimaryKey(TEmployeeUserRef record);
}