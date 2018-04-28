package com.liangzi.mapper;

import com.liangzi.pojo.TSystemMession;
import com.liangzi.pojo.TSystemMessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemMessionMapper {
    long countByExample(TSystemMessionExample example);

    int deleteByExample(TSystemMessionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSystemMession record);

    int insertSelective(TSystemMession record);

    List<TSystemMession> selectByExample(TSystemMessionExample example);

    TSystemMession selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSystemMession record, @Param("example") TSystemMessionExample example);

    int updateByExample(@Param("record") TSystemMession record, @Param("example") TSystemMessionExample example);

    int updateByPrimaryKeySelective(TSystemMession record);

    int updateByPrimaryKey(TSystemMession record);
}