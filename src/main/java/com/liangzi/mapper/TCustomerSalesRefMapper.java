package com.liangzi.mapper;

import com.liangzi.pojo.TCustomerSalesRef;
import com.liangzi.pojo.TCustomerSalesRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerSalesRefMapper {
    long countByExample(TCustomerSalesRefExample example);

    int deleteByExample(TCustomerSalesRefExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerSalesRef record);

    int insertSelective(TCustomerSalesRef record);

    List<TCustomerSalesRef> selectByExample(TCustomerSalesRefExample example);

    TCustomerSalesRef selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCustomerSalesRef record, @Param("example") TCustomerSalesRefExample example);

    int updateByExample(@Param("record") TCustomerSalesRef record, @Param("example") TCustomerSalesRefExample example);

    int updateByPrimaryKeySelective(TCustomerSalesRef record);

    int updateByPrimaryKey(TCustomerSalesRef record);
}