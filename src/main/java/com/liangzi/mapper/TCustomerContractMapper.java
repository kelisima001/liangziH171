package com.liangzi.mapper;

import com.liangzi.pojo.TCustomerContract;
import com.liangzi.pojo.TCustomerContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerContractMapper {
    long countByExample(TCustomerContractExample example);

    int deleteByExample(TCustomerContractExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerContract record);

    int insertSelective(TCustomerContract record);

    List<TCustomerContract> selectByExample(TCustomerContractExample example);

    TCustomerContract selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCustomerContract record, @Param("example") TCustomerContractExample example);

    int updateByExample(@Param("record") TCustomerContract record, @Param("example") TCustomerContractExample example);

    int updateByPrimaryKeySelective(TCustomerContract record);

    int updateByPrimaryKey(TCustomerContract record);
}