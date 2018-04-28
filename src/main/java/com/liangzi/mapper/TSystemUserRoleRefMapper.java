package com.liangzi.mapper;

import com.liangzi.pojo.TSystemUserRoleRef;
import com.liangzi.pojo.TSystemUserRoleRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemUserRoleRefMapper {
    long countByExample(TSystemUserRoleRefExample example);

    int deleteByExample(TSystemUserRoleRefExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSystemUserRoleRef record);

    int insertSelective(TSystemUserRoleRef record);

    List<TSystemUserRoleRef> selectByExample(TSystemUserRoleRefExample example);

    TSystemUserRoleRef selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSystemUserRoleRef record, @Param("example") TSystemUserRoleRefExample example);

    int updateByExample(@Param("record") TSystemUserRoleRef record, @Param("example") TSystemUserRoleRefExample example);

    int updateByPrimaryKeySelective(TSystemUserRoleRef record);

    int updateByPrimaryKey(TSystemUserRoleRef record);
}