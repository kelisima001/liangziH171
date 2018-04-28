package com.liangzi.mapper;

import com.liangzi.pojo.TOrg;
import com.liangzi.pojo.TOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrgMapper {
    long countByExample(TOrgExample example);

    int deleteByExample(TOrgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TOrg record);

    int insertSelective(TOrg record);

    List<TOrg> selectByExample(TOrgExample example);

    TOrg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TOrg record, @Param("example") TOrgExample example);

    int updateByExample(@Param("record") TOrg record, @Param("example") TOrgExample example);

    int updateByPrimaryKeySelective(TOrg record);

    int updateByPrimaryKey(TOrg record);
}