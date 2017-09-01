package com.ljq.blog.mapper;

import com.ljq.blog.po.BlogTBlogsundry;
import com.ljq.blog.po.BlogTBlogsundryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTBlogsundryMapper {
    int countByExample(BlogTBlogsundryExample example);

    int deleteByExample(BlogTBlogsundryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogTBlogsundry record);

    int insertSelective(BlogTBlogsundry record);

    List<BlogTBlogsundry> selectByExample(BlogTBlogsundryExample example);

    BlogTBlogsundry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogTBlogsundry record, @Param("example") BlogTBlogsundryExample example);

    int updateByExample(@Param("record") BlogTBlogsundry record, @Param("example") BlogTBlogsundryExample example);

    int updateByPrimaryKeySelective(BlogTBlogsundry record);

    int updateByPrimaryKey(BlogTBlogsundry record);
}