package com.liangzi.mapper;

import com.liangzi.pojo.TCustomerService;
import com.liangzi.pojo.TCustomerServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerServiceMapper {
    long countByExample(TCustomerServiceExample example);

    int deleteByExample(TCustomerServiceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerService record);

    int insertSelective(TCustomerService record);

    List<TCustomerService> selectByExample(TCustomerServiceExample example);

    TCustomerService selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCustomerService record, @Param("example") TCustomerServiceExample example);

    int updateByExample(@Param("record") TCustomerService record, @Param("example") TCustomerServiceExample example);

    int updateByPrimaryKeySelective(TCustomerService record);

    int updateByPrimaryKey(TCustomerService record);
}