package com.liangzi.mapper;

import com.liangzi.pojo.TCustomerPreOrder;
import com.liangzi.pojo.TCustomerPreOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerPreOrderMapper {
    long countByExample(TCustomerPreOrderExample example);

    int deleteByExample(TCustomerPreOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerPreOrder record);

    int insertSelective(TCustomerPreOrder record);

    List<TCustomerPreOrder> selectByExample(TCustomerPreOrderExample example);

    TCustomerPreOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCustomerPreOrder record, @Param("example") TCustomerPreOrderExample example);

    int updateByExample(@Param("record") TCustomerPreOrder record, @Param("example") TCustomerPreOrderExample example);

    int updateByPrimaryKeySelective(TCustomerPreOrder record);

    int updateByPrimaryKey(TCustomerPreOrder record);
}