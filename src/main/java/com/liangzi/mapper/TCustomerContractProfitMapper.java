package com.liangzi.mapper;

import com.liangzi.pojo.TCustomerContractProfit;
import com.liangzi.pojo.TCustomerContractProfitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerContractProfitMapper {
    long countByExample(TCustomerContractProfitExample example);

    int deleteByExample(TCustomerContractProfitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerContractProfit record);

    int insertSelective(TCustomerContractProfit record);

    List<TCustomerContractProfit> selectByExample(TCustomerContractProfitExample example);

    TCustomerContractProfit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCustomerContractProfit record, @Param("example") TCustomerContractProfitExample example);

    int updateByExample(@Param("record") TCustomerContractProfit record, @Param("example") TCustomerContractProfitExample example);

    int updateByPrimaryKeySelective(TCustomerContractProfit record);

    int updateByPrimaryKey(TCustomerContractProfit record);
}