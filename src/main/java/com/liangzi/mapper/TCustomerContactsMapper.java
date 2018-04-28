package com.liangzi.mapper;

import com.liangzi.pojo.TCustomerContacts;
import com.liangzi.pojo.TCustomerContactsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerContactsMapper {
    long countByExample(TCustomerContactsExample example);

    int deleteByExample(TCustomerContactsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerContacts record);

    int insertSelective(TCustomerContacts record);

    List<TCustomerContacts> selectByExample(TCustomerContactsExample example);

    TCustomerContacts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCustomerContacts record, @Param("example") TCustomerContactsExample example);

    int updateByExample(@Param("record") TCustomerContacts record, @Param("example") TCustomerContactsExample example);

    int updateByPrimaryKeySelective(TCustomerContacts record);

    int updateByPrimaryKey(TCustomerContacts record);
}