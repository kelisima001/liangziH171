package com.liangzi.mapper;

import com.liangzi.pojo.TCustomerOrder;
import com.liangzi.pojo.TCustomerOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerOrderMapper {
    long countByExample(TCustomerOrderExample example);

    int deleteByExample(TCustomerOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerOrder record);

    int insertSelective(TCustomerOrder record);

    List<TCustomerOrder> selectByExample(TCustomerOrderExample example);

    TCustomerOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCustomerOrder record, @Param("example") TCustomerOrderExample example);

    int updateByExample(@Param("record") TCustomerOrder record, @Param("example") TCustomerOrderExample example);

    int updateByPrimaryKeySelective(TCustomerOrder record);

    int updateByPrimaryKey(TCustomerOrder record);
}