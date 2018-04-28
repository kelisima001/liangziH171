package com.liangzi.mapper;

import com.liangzi.pojo.TCustomerId;
import com.liangzi.pojo.TCustomerIdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerIdMapper {
    long countByExample(TCustomerIdExample example);

    int deleteByExample(TCustomerIdExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerId record);

    int insertSelective(TCustomerId record);

    List<TCustomerId> selectByExample(TCustomerIdExample example);

    TCustomerId selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCustomerId record, @Param("example") TCustomerIdExample example);

    int updateByExample(@Param("record") TCustomerId record, @Param("example") TCustomerIdExample example);

    int updateByPrimaryKeySelective(TCustomerId record);

    int updateByPrimaryKey(TCustomerId record);
}