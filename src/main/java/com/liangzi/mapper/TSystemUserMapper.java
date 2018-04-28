package com.liangzi.mapper;

import com.liangzi.pojo.TSystemUser;
import com.liangzi.pojo.TSystemUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemUserMapper {
    long countByExample(TSystemUserExample example);

    int deleteByExample(TSystemUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSystemUser record);

    int insertSelective(TSystemUser record);

    List<TSystemUser> selectByExample(TSystemUserExample example);

    TSystemUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSystemUser record, @Param("example") TSystemUserExample example);

    int updateByExample(@Param("record") TSystemUser record, @Param("example") TSystemUserExample example);

    int updateByPrimaryKeySelective(TSystemUser record);

    int updateByPrimaryKey(TSystemUser record);
}