package com.liangzi.mapper;

import com.liangzi.pojo.TSystemLog;
import com.liangzi.pojo.TSystemLogExample;
import com.liangzi.pojo.TSystemLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemLogMapper {
    long countByExample(TSystemLogExample example);

    int deleteByExample(TSystemLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSystemLogWithBLOBs record);

    int insertSelective(TSystemLogWithBLOBs record);

    List<TSystemLogWithBLOBs> selectByExampleWithBLOBs(TSystemLogExample example);

    List<TSystemLog> selectByExample(TSystemLogExample example);

    TSystemLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSystemLogWithBLOBs record, @Param("example") TSystemLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TSystemLogWithBLOBs record, @Param("example") TSystemLogExample example);

    int updateByExample(@Param("record") TSystemLog record, @Param("example") TSystemLogExample example);

    int updateByPrimaryKeySelective(TSystemLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TSystemLogWithBLOBs record);

    int updateByPrimaryKey(TSystemLog record);
}