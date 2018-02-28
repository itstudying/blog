package com.ljq.blog.po;

import java.util.ArrayList;
import java.util.List;

public class BlogTBlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogTBlogExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClassifyIsNull() {
            addCriterion("classify is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIsNotNull() {
            addCriterion("classify is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyEqualTo(String value) {
            addCriterion("classify =", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotEqualTo(String value) {
            addCriterion("classify <>", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThan(String value) {
            addCriterion("classify >", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("classify >=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThan(String value) {
            addCriterion("classify <", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThanOrEqualTo(String value) {
            addCriterion("classify <=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLike(String value) {
            addCriterion("classify like", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotLike(String value) {
            addCriterion("classify not like", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyIn(List<String> values) {
            addCriterion("classify in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotIn(List<String> values) {
            addCriterion("classify not in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyBetween(String value1, String value2) {
            addCriterion("classify between", value1, value2, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotBetween(String value1, String value2) {
            addCriterion("classify not between", value1, value2, "classify");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPubtimeIsNull() {
            addCriterion("pubtime is null");
            return (Criteria) this;
        }

        public Criteria andPubtimeIsNotNull() {
            addCriterion("pubtime is not null");
            return (Criteria) this;
        }

        public Criteria andPubtimeEqualTo(String value) {
            addCriterion("pubtime =", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeNotEqualTo(String value) {
            addCriterion("pubtime <>", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeGreaterThan(String value) {
            addCriterion("pubtime >", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeGreaterThanOrEqualTo(String value) {
            addCriterion("pubtime >=", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeLessThan(String value) {
            addCriterion("pubtime <", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeLessThanOrEqualTo(String value) {
            addCriterion("pubtime <=", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeLike(String value) {
            addCriterion("pubtime like", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeNotLike(String value) {
            addCriterion("pubtime not like", value, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeIn(List<String> values) {
            addCriterion("pubtime in", values, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeNotIn(List<String> values) {
            addCriterion("pubtime not in", values, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeBetween(String value1, String value2) {
            addCriterion("pubtime between", value1, value2, "pubtime");
            return (Criteria) this;
        }

        public Criteria andPubtimeNotBetween(String value1, String value2) {
            addCriterion("pubtime not between", value1, value2, "pubtime");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("intro is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("intro is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("intro =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("intro <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("intro >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("intro >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("intro <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("intro <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("intro like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("intro not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("intro in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("intro not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("intro between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("intro not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroimgIsNull() {
            addCriterion("introimg is null");
            return (Criteria) this;
        }

        public Criteria andIntroimgIsNotNull() {
            addCriterion("introimg is not null");
            return (Criteria) this;
        }

        public Criteria andIntroimgEqualTo(String value) {
            addCriterion("introimg =", value, "introimg");
            return (Criteria) this;
        }

        public Criteria andIntroimgNotEqualTo(String value) {
            addCriterion("introimg <>", value, "introimg");
            return (Criteria) this;
        }

        public Criteria andIntroimgGreaterThan(String value) {
            addCriterion("introimg >", value, "introimg");
            return (Criteria) this;
        }

        public Criteria andIntroimgGreaterThanOrEqualTo(String value) {
            addCriterion("introimg >=", value, "introimg");
            return (Criteria) this;
        }

        public Criteria andIntroimgLessThan(String value) {
            addCriterion("introimg <", value, "introimg");
            return (Criteria) this;
        }

        public Criteria andIntroimgLessThanOrEqualTo(String value) {
            addCriterion("introimg <=", value, "introimg");
            return (Criteria) this;
        }

        public Criteria andIntroimgLike(String value) {
            addCriterion("introimg like", value, "introimg");
            return (Criteria) this;
        }

        public Criteria andIntroimgNotLike(String value) {
            addCriterion("introimg not like", value, "introimg");
            return (Criteria) this;
        }

        public Criteria andIntroimgIn(List<String> values) {
            addCriterion("introimg in", values, "introimg");
            return (Criteria) this;
        }

        public Criteria andIntroimgNotIn(List<String> values) {
            addCriterion("introimg not in", values, "introimg");
            return (Criteria) this;
        }

        public Criteria andIntroimgBetween(String value1, String value2) {
            addCriterion("introimg between", value1, value2, "introimg");
            return (Criteria) this;
        }

        public Criteria andIntroimgNotBetween(String value1, String value2) {
            addCriterion("introimg not between", value1, value2, "introimg");
            return (Criteria) this;
        }

        public Criteria andWordscountIsNull() {
            addCriterion("wordscount is null");
            return (Criteria) this;
        }

        public Criteria andWordscountIsNotNull() {
            addCriterion("wordscount is not null");
            return (Criteria) this;
        }

        public Criteria andWordscountEqualTo(Integer value) {
            addCriterion("wordscount =", value, "wordscount");
            return (Criteria) this;
        }

        public Criteria andWordscountNotEqualTo(Integer value) {
            addCriterion("wordscount <>", value, "wordscount");
            return (Criteria) this;
        }

        public Criteria andWordscountGreaterThan(Integer value) {
            addCriterion("wordscount >", value, "wordscount");
            return (Criteria) this;
        }

        public Criteria andWordscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("wordscount >=", value, "wordscount");
            return (Criteria) this;
        }

        public Criteria andWordscountLessThan(Integer value) {
            addCriterion("wordscount <", value, "wordscount");
            return (Criteria) this;
        }

        public Criteria andWordscountLessThanOrEqualTo(Integer value) {
            addCriterion("wordscount <=", value, "wordscount");
            return (Criteria) this;
        }

        public Criteria andWordscountIn(List<Integer> values) {
            addCriterion("wordscount in", values, "wordscount");
            return (Criteria) this;
        }

        public Criteria andWordscountNotIn(List<Integer> values) {
            addCriterion("wordscount not in", values, "wordscount");
            return (Criteria) this;
        }

        public Criteria andWordscountBetween(Integer value1, Integer value2) {
            addCriterion("wordscount between", value1, value2, "wordscount");
            return (Criteria) this;
        }

        public Criteria andWordscountNotBetween(Integer value1, Integer value2) {
            addCriterion("wordscount not between", value1, value2, "wordscount");
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