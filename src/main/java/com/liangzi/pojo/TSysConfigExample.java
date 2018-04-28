package com.liangzi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSysConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSysConfigExample() {
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

        public Criteria andCfgIdIsNull() {
            addCriterion("cfg_id is null");
            return (Criteria) this;
        }

        public Criteria andCfgIdIsNotNull() {
            addCriterion("cfg_id is not null");
            return (Criteria) this;
        }

        public Criteria andCfgIdEqualTo(Long value) {
            addCriterion("cfg_id =", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdNotEqualTo(Long value) {
            addCriterion("cfg_id <>", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdGreaterThan(Long value) {
            addCriterion("cfg_id >", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cfg_id >=", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdLessThan(Long value) {
            addCriterion("cfg_id <", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdLessThanOrEqualTo(Long value) {
            addCriterion("cfg_id <=", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdIn(List<Long> values) {
            addCriterion("cfg_id in", values, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdNotIn(List<Long> values) {
            addCriterion("cfg_id not in", values, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdBetween(Long value1, Long value2) {
            addCriterion("cfg_id between", value1, value2, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdNotBetween(Long value1, Long value2) {
            addCriterion("cfg_id not between", value1, value2, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgCateIsNull() {
            addCriterion("cfg_cate is null");
            return (Criteria) this;
        }

        public Criteria andCfgCateIsNotNull() {
            addCriterion("cfg_cate is not null");
            return (Criteria) this;
        }

        public Criteria andCfgCateEqualTo(Long value) {
            addCriterion("cfg_cate =", value, "cfgCate");
            return (Criteria) this;
        }

        public Criteria andCfgCateNotEqualTo(Long value) {
            addCriterion("cfg_cate <>", value, "cfgCate");
            return (Criteria) this;
        }

        public Criteria andCfgCateGreaterThan(Long value) {
            addCriterion("cfg_cate >", value, "cfgCate");
            return (Criteria) this;
        }

        public Criteria andCfgCateGreaterThanOrEqualTo(Long value) {
            addCriterion("cfg_cate >=", value, "cfgCate");
            return (Criteria) this;
        }

        public Criteria andCfgCateLessThan(Long value) {
            addCriterion("cfg_cate <", value, "cfgCate");
            return (Criteria) this;
        }

        public Criteria andCfgCateLessThanOrEqualTo(Long value) {
            addCriterion("cfg_cate <=", value, "cfgCate");
            return (Criteria) this;
        }

        public Criteria andCfgCateIn(List<Long> values) {
            addCriterion("cfg_cate in", values, "cfgCate");
            return (Criteria) this;
        }

        public Criteria andCfgCateNotIn(List<Long> values) {
            addCriterion("cfg_cate not in", values, "cfgCate");
            return (Criteria) this;
        }

        public Criteria andCfgCateBetween(Long value1, Long value2) {
            addCriterion("cfg_cate between", value1, value2, "cfgCate");
            return (Criteria) this;
        }

        public Criteria andCfgCateNotBetween(Long value1, Long value2) {
            addCriterion("cfg_cate not between", value1, value2, "cfgCate");
            return (Criteria) this;
        }

        public Criteria andCfgCodeIsNull() {
            addCriterion("cfg_code is null");
            return (Criteria) this;
        }

        public Criteria andCfgCodeIsNotNull() {
            addCriterion("cfg_code is not null");
            return (Criteria) this;
        }

        public Criteria andCfgCodeEqualTo(String value) {
            addCriterion("cfg_code =", value, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgCodeNotEqualTo(String value) {
            addCriterion("cfg_code <>", value, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgCodeGreaterThan(String value) {
            addCriterion("cfg_code >", value, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cfg_code >=", value, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgCodeLessThan(String value) {
            addCriterion("cfg_code <", value, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgCodeLessThanOrEqualTo(String value) {
            addCriterion("cfg_code <=", value, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgCodeLike(String value) {
            addCriterion("cfg_code like", value, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgCodeNotLike(String value) {
            addCriterion("cfg_code not like", value, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgCodeIn(List<String> values) {
            addCriterion("cfg_code in", values, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgCodeNotIn(List<String> values) {
            addCriterion("cfg_code not in", values, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgCodeBetween(String value1, String value2) {
            addCriterion("cfg_code between", value1, value2, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgCodeNotBetween(String value1, String value2) {
            addCriterion("cfg_code not between", value1, value2, "cfgCode");
            return (Criteria) this;
        }

        public Criteria andCfgNameIsNull() {
            addCriterion("cfg_name is null");
            return (Criteria) this;
        }

        public Criteria andCfgNameIsNotNull() {
            addCriterion("cfg_name is not null");
            return (Criteria) this;
        }

        public Criteria andCfgNameEqualTo(String value) {
            addCriterion("cfg_name =", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameNotEqualTo(String value) {
            addCriterion("cfg_name <>", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameGreaterThan(String value) {
            addCriterion("cfg_name >", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameGreaterThanOrEqualTo(String value) {
            addCriterion("cfg_name >=", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameLessThan(String value) {
            addCriterion("cfg_name <", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameLessThanOrEqualTo(String value) {
            addCriterion("cfg_name <=", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameLike(String value) {
            addCriterion("cfg_name like", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameNotLike(String value) {
            addCriterion("cfg_name not like", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameIn(List<String> values) {
            addCriterion("cfg_name in", values, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameNotIn(List<String> values) {
            addCriterion("cfg_name not in", values, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameBetween(String value1, String value2) {
            addCriterion("cfg_name between", value1, value2, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameNotBetween(String value1, String value2) {
            addCriterion("cfg_name not between", value1, value2, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgValueIsNull() {
            addCriterion("cfg_value is null");
            return (Criteria) this;
        }

        public Criteria andCfgValueIsNotNull() {
            addCriterion("cfg_value is not null");
            return (Criteria) this;
        }

        public Criteria andCfgValueEqualTo(String value) {
            addCriterion("cfg_value =", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotEqualTo(String value) {
            addCriterion("cfg_value <>", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueGreaterThan(String value) {
            addCriterion("cfg_value >", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueGreaterThanOrEqualTo(String value) {
            addCriterion("cfg_value >=", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueLessThan(String value) {
            addCriterion("cfg_value <", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueLessThanOrEqualTo(String value) {
            addCriterion("cfg_value <=", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueLike(String value) {
            addCriterion("cfg_value like", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotLike(String value) {
            addCriterion("cfg_value not like", value, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueIn(List<String> values) {
            addCriterion("cfg_value in", values, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotIn(List<String> values) {
            addCriterion("cfg_value not in", values, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueBetween(String value1, String value2) {
            addCriterion("cfg_value between", value1, value2, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCfgValueNotBetween(String value1, String value2) {
            addCriterion("cfg_value not between", value1, value2, "cfgValue");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Byte value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Byte value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Byte value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Byte value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Byte value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Byte> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Byte> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Byte value1, Byte value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Byte value1, Byte value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
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