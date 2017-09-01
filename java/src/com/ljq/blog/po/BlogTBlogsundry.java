package com.ljq.blog.po;

public class BlogTBlogsundry {
    private Integer id;

    private String blogid;

    private String description;

    private String keywords;

    private String love;

    private String articleviews;

    private Byte isshow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlogid() {
        return blogid;
    }

    public void setBlogid(String blogid) {
        this.blogid = blogid == null ? null : blogid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love == null ? null : love.trim();
    }

    public String getArticleviews() {
        return articleviews;
    }

    public void setArticleviews(String articleviews) {
        this.articleviews = articleviews == null ? null : articleviews.trim();
    }

    public Byte getIsshow() {
        return isshow;
    }

    public void setIsshow(Byte isshow) {
        this.isshow = isshow;
    }
}