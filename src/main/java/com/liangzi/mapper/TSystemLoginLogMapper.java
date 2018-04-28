package com.liangzi.mapper;

import com.liangzi.pojo.TSystemLoginLog;
import com.liangzi.pojo.TSystemLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemLoginLogMapper {
    long countByExample(TSystemLoginLogExample example);

    int deleteByExample(TSystemLoginLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSystemLoginLog record);

    int insertSelective(TSystemLoginLog record);

    List<TSystemLoginLog> selectByExampleWithBLOBs(TSystemLoginLogExample example);

    List<TSystemLoginLog> selectByExample(TSystemLoginLogExample example);

    TSystemLoginLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSystemLoginLog record, @Param("example") TSystemLoginLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TSystemLoginLog record, @Param("example") TSystemLoginLogExample example);

    int updateByExample(@Param("record") TSystemLoginLog record, @Param("example") TSystemLoginLogExample example);

    int updateByPrimaryKeySelective(TSystemLoginLog record);

    int updateByPrimaryKeyWithBLOBs(TSystemLoginLog record);

    int updateByPrimaryKey(TSystemLoginLog record);
}