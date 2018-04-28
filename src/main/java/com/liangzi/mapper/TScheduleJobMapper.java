package com.liangzi.mapper;

import com.liangzi.pojo.TScheduleJob;
import com.liangzi.pojo.TScheduleJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TScheduleJobMapper {
    long countByExample(TScheduleJobExample example);

    int deleteByExample(TScheduleJobExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TScheduleJob record);

    int insertSelective(TScheduleJob record);

    List<TScheduleJob> selectByExample(TScheduleJobExample example);

    TScheduleJob selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TScheduleJob record, @Param("example") TScheduleJobExample example);

    int updateByExample(@Param("record") TScheduleJob record, @Param("example") TScheduleJobExample example);

    int updateByPrimaryKeySelective(TScheduleJob record);

    int updateByPrimaryKey(TScheduleJob record);
}