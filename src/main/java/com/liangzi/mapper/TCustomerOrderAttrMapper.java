package com.liangzi.mapper;

import com.liangzi.pojo.TCustomerOrderAttr;
import com.liangzi.pojo.TCustomerOrderAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerOrderAttrMapper {
    long countByExample(TCustomerOrderAttrExample example);

    int deleteByExample(TCustomerOrderAttrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerOrderAttr record);

    int insertSelective(TCustomerOrderAttr record);

    List<TCustomerOrderAttr> selectByExample(TCustomerOrderAttrExample example);

    TCustomerOrderAttr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCustomerOrderAttr record, @Param("example") TCustomerOrderAttrExample example);

    int updateByExample(@Param("record") TCustomerOrderAttr record, @Param("example") TCustomerOrderAttrExample example);

    int updateByPrimaryKeySelective(TCustomerOrderAttr record);

    int updateByPrimaryKey(TCustomerOrderAttr record);
}