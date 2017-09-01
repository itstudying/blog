package com.ljq.blog.po;

import java.util.ArrayList;
import java.util.List;

public class BlogTBlogsundryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogTBlogsundryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBlogidIsNull() {
            addCriterion("blogid is null");
            return (Criteria) this;
        }

        public Criteria andBlogidIsNotNull() {
            addCriterion("blogid is not null");
            return (Criteria) this;
        }

        public Criteria andBlogidEqualTo(String value) {
            addCriterion("blogid =", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotEqualTo(String value) {
            addCriterion("blogid <>", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidGreaterThan(String value) {
            addCriterion("blogid >", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidGreaterThanOrEqualTo(String value) {
            addCriterion("blogid >=", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidLessThan(String value) {
            addCriterion("blogid <", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidLessThanOrEqualTo(String value) {
            addCriterion("blogid <=", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidLike(String value) {
            addCriterion("blogid like", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotLike(String value) {
            addCriterion("blogid not like", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidIn(List<String> values) {
            addCriterion("blogid in", values, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotIn(List<String> values) {
            addCriterion("blogid not in", values, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidBetween(String value1, String value2) {
            addCriterion("blogid between", value1, value2, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotBetween(String value1, String value2) {
            addCriterion("blogid not between", value1, value2, "blogid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andLoveIsNull() {
            addCriterion("love is null");
            return (Criteria) this;
        }

        public Criteria andLoveIsNotNull() {
            addCriterion("love is not null");
            return (Criteria) this;
        }

        public Criteria andLoveEqualTo(String value) {
            addCriterion("love =", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveNotEqualTo(String value) {
            addCriterion("love <>", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveGreaterThan(String value) {
            addCriterion("love >", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveGreaterThanOrEqualTo(String value) {
            addCriterion("love >=", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveLessThan(String value) {
            addCriterion("love <", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveLessThanOrEqualTo(String value) {
            addCriterion("love <=", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveLike(String value) {
            addCriterion("love like", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveNotLike(String value) {
            addCriterion("love not like", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveIn(List<String> values) {
            addCriterion("love in", values, "love");
            return (Criteria) this;
        }

        public Criteria andLoveNotIn(List<String> values) {
            addCriterion("love not in", values, "love");
            return (Criteria) this;
        }

        public Criteria andLoveBetween(String value1, String value2) {
            addCriterion("love between", value1, value2, "love");
            return (Criteria) this;
        }

        public Criteria andLoveNotBetween(String value1, String value2) {
            addCriterion("love not between", value1, value2, "love");
            return (Criteria) this;
        }

        public Criteria andArticleviewsIsNull() {
            addCriterion("articleviews is null");
            return (Criteria) this;
        }

        public Criteria andArticleviewsIsNotNull() {
            addCriterion("articleviews is not null");
            return (Criteria) this;
        }

        public Criteria andArticleviewsEqualTo(String value) {
            addCriterion("articleviews =", value, "articleviews");
            return (Criteria) this;
        }

        public Criteria andArticleviewsNotEqualTo(String value) {
            addCriterion("articleviews <>", value, "articleviews");
            return (Criteria) this;
        }

        public Criteria andArticleviewsGreaterThan(String value) {
            addCriterion("articleviews >", value, "articleviews");
            return (Criteria) this;
        }

        public Criteria andArticleviewsGreaterThanOrEqualTo(String value) {
            addCriterion("articleviews >=", value, "articleviews");
            return (Criteria) this;
        }

        public Criteria andArticleviewsLessThan(String value) {
            addCriterion("articleviews <", value, "articleviews");
            return (Criteria) this;
        }

        public Criteria andArticleviewsLessThanOrEqualTo(String value) {
            addCriterion("articleviews <=", value, "articleviews");
            return (Criteria) this;
        }

        public Criteria andArticleviewsLike(String value) {
            addCriterion("articleviews like", value, "articleviews");
            return (Criteria) this;
        }

        public Criteria andArticleviewsNotLike(String value) {
            addCriterion("articleviews not like", value, "articleviews");
            return (Criteria) this;
        }

        public Criteria andArticleviewsIn(List<String> values) {
            addCriterion("articleviews in", values, "articleviews");
            return (Criteria) this;
        }

        public Criteria andArticleviewsNotIn(List<String> values) {
            addCriterion("articleviews not in", values, "articleviews");
            return (Criteria) this;
        }

        public Criteria andArticleviewsBetween(String value1, String value2) {
            addCriterion("articleviews between", value1, value2, "articleviews");
            return (Criteria) this;
        }

        public Criteria andArticleviewsNotBetween(String value1, String value2) {
            addCriterion("articleviews not between", value1, value2, "articleviews");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("isshow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("isshow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Byte value) {
            addCriterion("isshow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Byte value) {
            addCriterion("isshow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Byte value) {
            addCriterion("isshow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("isshow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Byte value) {
            addCriterion("isshow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Byte value) {
            addCriterion("isshow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Byte> values) {
            addCriterion("isshow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Byte> values) {
            addCriterion("isshow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Byte value1, Byte value2) {
            addCriterion("isshow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Byte value1, Byte value2) {
            addCriterion("isshow not between", value1, value2, "isshow");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}