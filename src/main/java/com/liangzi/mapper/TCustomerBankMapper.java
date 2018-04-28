package com.liangzi.mapper;

import com.liangzi.pojo.TCustomerBank;
import com.liangzi.pojo.TCustomerBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerBankMapper {
    long countByExample(TCustomerBankExample example);

    int deleteByExample(TCustomerBankExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerBank record);

    int insertSelective(TCustomerBank record);

    List<TCustomerBank> selectByExample(TCustomerBankExample example);

    TCustomerBank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCustomerBank record, @Param("example") TCustomerBankExample example);

    int updateByExample(@Param("record") TCustomerBank record, @Param("example") TCustomerBankExample example);

    int updateByPrimaryKeySelective(TCustomerBank record);

    int updateByPrimaryKey(TCustomerBank record);
}