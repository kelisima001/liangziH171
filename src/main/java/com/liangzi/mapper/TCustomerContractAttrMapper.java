package com.liangzi.mapper;

import com.liangzi.pojo.TCustomerContractAttr;
import com.liangzi.pojo.TCustomerContractAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerContractAttrMapper {
    long countByExample(TCustomerContractAttrExample example);

    int deleteByExample(TCustomerContractAttrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerContractAttr record);

    int insertSelective(TCustomerContractAttr record);

    List<TCustomerContractAttr> selectByExample(TCustomerContractAttrExample example);

    TCustomerContractAttr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCustomerContractAttr record, @Param("example") TCustomerContractAttrExample example);

    int updateByExample(@Param("record") TCustomerContractAttr record, @Param("example") TCustomerContractAttrExample example);

    int updateByPrimaryKeySelective(TCustomerContractAttr record);

    int updateByPrimaryKey(TCustomerContractAttr record);
}