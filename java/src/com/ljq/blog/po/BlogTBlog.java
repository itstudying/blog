package com.ljq.blog.po;

public class BlogTBlog {
    private String id;

    private String classify;

    private String title;

    private String pubtime;

    private String intro;

    private String introimg;

    private Integer wordscount;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime == null ? null : pubtime.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getIntroimg() {
        return introimg;
    }

    public void setIntroimg(String introimg) {
        this.introimg = introimg == null ? null : introimg.trim();
    }

    public Integer getWordscount() {
        return wordscount;
    }

    public void setWordscount(Integer wordscount) {
        this.wordscount = wordscount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}