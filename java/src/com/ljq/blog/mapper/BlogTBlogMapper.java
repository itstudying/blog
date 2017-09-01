package com.ljq.blog.mapper;

import com.ljq.blog.po.BlogTBlog;
import com.ljq.blog.po.BlogTBlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTBlogMapper {
    int countByExample(BlogTBlogExample example);

    int deleteByExample(BlogTBlogExample example);

    int deleteByPrimaryKey(String id);

    int insert(BlogTBlog record);

    int insertSelective(BlogTBlog record);

    List<BlogTBlog> selectByExampleWithBLOBs(BlogTBlogExample example);

    List<BlogTBlog> selectByExample(BlogTBlogExample example);

    BlogTBlog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BlogTBlog record, @Param("example") BlogTBlogExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogTBlog record, @Param("example") BlogTBlogExample example);

    int updateByExample(@Param("record") BlogTBlog record, @Param("example") BlogTBlogExample example);

    int updateByPrimaryKeySelective(BlogTBlog record);

    int updateByPrimaryKeyWithBLOBs(BlogTBlog record);

    int updateByPrimaryKey(BlogTBlog record);
}