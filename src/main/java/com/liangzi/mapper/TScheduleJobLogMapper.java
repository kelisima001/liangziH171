package com.liangzi.mapper;

import com.liangzi.pojo.TScheduleJobLog;
import com.liangzi.pojo.TScheduleJobLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TScheduleJobLogMapper {
    long countByExample(TScheduleJobLogExample example);

    int deleteByExample(TScheduleJobLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TScheduleJobLog record);

    int insertSelective(TScheduleJobLog record);

    List<TScheduleJobLog> selectByExample(TScheduleJobLogExample example);

    TScheduleJobLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TScheduleJobLog record, @Param("example") TScheduleJobLogExample example);

    int updateByExample(@Param("record") TScheduleJobLog record, @Param("example") TScheduleJobLogExample example);

    int updateByPrimaryKeySelective(TScheduleJobLog record);

    int updateByPrimaryKey(TScheduleJobLog record);
}