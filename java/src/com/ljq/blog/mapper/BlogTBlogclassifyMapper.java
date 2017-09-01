package com.ljq.blog.mapper;

import com.ljq.blog.po.BlogTBlogclassify;
import com.ljq.blog.po.BlogTBlogclassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTBlogclassifyMapper {
    int countByExample(BlogTBlogclassifyExample example);

    int deleteByExample(BlogTBlogclassifyExample example);

    int deleteByPrimaryKey(String id);

    int insert(BlogTBlogclassify record);

    int insertSelective(BlogTBlogclassify record);

    List<BlogTBlogclassify> selectByExample(BlogTBlogclassifyExample example);

    BlogTBlogclassify selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BlogTBlogclassify record, @Param("example") BlogTBlogclassifyExample example);

    int updateByExample(@Param("record") BlogTBlogclassify record, @Param("example") BlogTBlogclassifyExample example);

    int updateByPrimaryKeySelective(BlogTBlogclassify record);

    int updateByPrimaryKey(BlogTBlogclassify record);
}