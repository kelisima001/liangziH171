package com.liangzi.mapper;

import com.liangzi.pojo.TSystemRole;
import com.liangzi.pojo.TSystemRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemRoleMapper {
    long countByExample(TSystemRoleExample example);

    int deleteByExample(TSystemRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSystemRole record);

    int insertSelective(TSystemRole record);

    List<TSystemRole> selectByExample(TSystemRoleExample example);

    TSystemRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSystemRole record, @Param("example") TSystemRoleExample example);

    int updateByExample(@Param("record") TSystemRole record, @Param("example") TSystemRoleExample example);

    int updateByPrimaryKeySelective(TSystemRole record);

    int updateByPrimaryKey(TSystemRole record);
}