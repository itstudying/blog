package com.ljq.blog.mapper;

import com.ljq.blog.po.BlogTBlogfile;
import com.ljq.blog.po.BlogTBlogfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTBlogfileMapper {
    int countByExample(BlogTBlogfileExample example);

    int deleteByExample(BlogTBlogfileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogTBlogfile record);

    int insertSelective(BlogTBlogfile record);

    List<BlogTBlogfile> selectByExample(BlogTBlogfileExample example);

    BlogTBlogfile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogTBlogfile record, @Param("example") BlogTBlogfileExample example);

    int updateByExample(@Param("record") BlogTBlogfile record, @Param("example") BlogTBlogfileExample example);

    int updateByPrimaryKeySelective(BlogTBlogfile record);

    int updateByPrimaryKey(BlogTBlogfile record);
}