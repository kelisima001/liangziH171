package com.liangzi.mapper;

import com.liangzi.pojo.TSystemBlog;
import com.liangzi.pojo.TSystemBlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemBlogMapper {
    long countByExample(TSystemBlogExample example);

    int deleteByExample(TSystemBlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSystemBlog record);

    int insertSelective(TSystemBlog record);

    List<TSystemBlog> selectByExampleWithBLOBs(TSystemBlogExample example);

    List<TSystemBlog> selectByExample(TSystemBlogExample example);

    TSystemBlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSystemBlog record, @Param("example") TSystemBlogExample example);

    int updateByExampleWithBLOBs(@Param("record") TSystemBlog record, @Param("example") TSystemBlogExample example);

    int updateByExample(@Param("record") TSystemBlog record, @Param("example") TSystemBlogExample example);

    int updateByPrimaryKeySelective(TSystemBlog record);

    int updateByPrimaryKeyWithBLOBs(TSystemBlog record);

    int updateByPrimaryKey(TSystemBlog record);
}