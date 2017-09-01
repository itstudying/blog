package com.ljq.blog.mapper;

import com.ljq.blog.po.BlogTManager;
import com.ljq.blog.po.BlogTManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTManagerMapper {
    int countByExample(BlogTManagerExample example);

    int deleteByExample(BlogTManagerExample example);

    int deleteByPrimaryKey(String no);

    int insert(BlogTManager record);

    int insertSelective(BlogTManager record);

    List<BlogTManager> selectByExample(BlogTManagerExample example);

    BlogTManager selectByPrimaryKey(String no);

    int updateByExampleSelective(@Param("record") BlogTManager record, @Param("example") BlogTManagerExample example);

    int updateByExample(@Param("record") BlogTManager record, @Param("example") BlogTManagerExample example);

    int updateByPrimaryKeySelective(BlogTManager record);

    int updateByPrimaryKey(BlogTManager record);
}