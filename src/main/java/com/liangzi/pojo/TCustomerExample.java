package com.liangzi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCustomerExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andResourceIsNull() {
            addCriterion("resource is null");
            return (Criteria) this;
        }

        public Criteria andResourceIsNotNull() {
            addCriterion("resource is not null");
            return (Criteria) this;
        }

        public Criteria andResourceEqualTo(Byte value) {
            addCriterion("resource =", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotEqualTo(Byte value) {
            addCriterion("resource <>", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThan(Byte value) {
            addCriterion("resource >", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("resource >=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThan(Byte value) {
            addCriterion("resource <", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThanOrEqualTo(Byte value) {
            addCriterion("resource <=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceIn(List<Byte> values) {
            addCriterion("resource in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotIn(List<Byte> values) {
            addCriterion("resource not in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceBetween(Byte value1, Byte value2) {
            addCriterion("resource between", value1, value2, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotBetween(Byte value1, Byte value2) {
            addCriterion("resource not between", value1, value2, "resource");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdIsNull() {
            addCriterion("ori_sales_id is null");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdIsNotNull() {
            addCriterion("ori_sales_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdEqualTo(Long value) {
            addCriterion("ori_sales_id =", value, "oriSalesId");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdNotEqualTo(Long value) {
            addCriterion("ori_sales_id <>", value, "oriSalesId");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdGreaterThan(Long value) {
            addCriterion("ori_sales_id >", value, "oriSalesId");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ori_sales_id >=", value, "oriSalesId");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdLessThan(Long value) {
            addCriterion("ori_sales_id <", value, "oriSalesId");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdLessThanOrEqualTo(Long value) {
            addCriterion("ori_sales_id <=", value, "oriSalesId");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdIn(List<Long> values) {
            addCriterion("ori_sales_id in", values, "oriSalesId");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdNotIn(List<Long> values) {
            addCriterion("ori_sales_id not in", values, "oriSalesId");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdBetween(Long value1, Long value2) {
            addCriterion("ori_sales_id between", value1, value2, "oriSalesId");
            return (Criteria) this;
        }

        public Criteria andOriSalesIdNotBetween(Long value1, Long value2) {
            addCriterion("ori_sales_id not between", value1, value2, "oriSalesId");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameIsNull() {
            addCriterion("ori_sales_name is null");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameIsNotNull() {
            addCriterion("ori_sales_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameEqualTo(String value) {
            addCriterion("ori_sales_name =", value, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameNotEqualTo(String value) {
            addCriterion("ori_sales_name <>", value, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameGreaterThan(String value) {
            addCriterion("ori_sales_name >", value, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameGreaterThanOrEqualTo(String value) {
            addCriterion("ori_sales_name >=", value, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameLessThan(String value) {
            addCriterion("ori_sales_name <", value, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameLessThanOrEqualTo(String value) {
            addCriterion("ori_sales_name <=", value, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameLike(String value) {
            addCriterion("ori_sales_name like", value, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameNotLike(String value) {
            addCriterion("ori_sales_name not like", value, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameIn(List<String> values) {
            addCriterion("ori_sales_name in", values, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameNotIn(List<String> values) {
            addCriterion("ori_sales_name not in", values, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameBetween(String value1, String value2) {
            addCriterion("ori_sales_name between", value1, value2, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andOriSalesNameNotBetween(String value1, String value2) {
            addCriterion("ori_sales_name not between", value1, value2, "oriSalesName");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTaxNumIsNull() {
            addCriterion("tax_num is null");
            return (Criteria) this;
        }

        public Criteria andTaxNumIsNotNull() {
            addCriterion("tax_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNumEqualTo(String value) {
            addCriterion("tax_num =", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumNotEqualTo(String value) {
            addCriterion("tax_num <>", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumGreaterThan(String value) {
            addCriterion("tax_num >", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumGreaterThanOrEqualTo(String value) {
            addCriterion("tax_num >=", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumLessThan(String value) {
            addCriterion("tax_num <", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumLessThanOrEqualTo(String value) {
            addCriterion("tax_num <=", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumLike(String value) {
            addCriterion("tax_num like", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumNotLike(String value) {
            addCriterion("tax_num not like", value, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumIn(List<String> values) {
            addCriterion("tax_num in", values, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumNotIn(List<String> values) {
            addCriterion("tax_num not in", values, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumBetween(String value1, String value2) {
            addCriterion("tax_num between", value1, value2, "taxNum");
            return (Criteria) this;
        }

        public Criteria andTaxNumNotBetween(String value1, String value2) {
            addCriterion("tax_num not between", value1, value2, "taxNum");
            return (Criteria) this;
        }

        public Criteria andIdNumIsNull() {
            addCriterion("id_num is null");
            return (Criteria) this;
        }

        public Criteria andIdNumIsNotNull() {
            addCriterion("id_num is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumEqualTo(String value) {
            addCriterion("id_num =", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotEqualTo(String value) {
            addCriterion("id_num <>", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumGreaterThan(String value) {
            addCriterion("id_num >", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumGreaterThanOrEqualTo(String value) {
            addCriterion("id_num >=", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLessThan(String value) {
            addCriterion("id_num <", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLessThanOrEqualTo(String value) {
            addCriterion("id_num <=", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumLike(String value) {
            addCriterion("id_num like", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotLike(String value) {
            addCriterion("id_num not like", value, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumIn(List<String> values) {
            addCriterion("id_num in", values, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotIn(List<String> values) {
            addCriterion("id_num not in", values, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumBetween(String value1, String value2) {
            addCriterion("id_num between", value1, value2, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdNumNotBetween(String value1, String value2) {
            addCriterion("id_num not between", value1, value2, "idNum");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontIsNull() {
            addCriterion("id_card_front is null");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontIsNotNull() {
            addCriterion("id_card_front is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontEqualTo(String value) {
            addCriterion("id_card_front =", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotEqualTo(String value) {
            addCriterion("id_card_front <>", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontGreaterThan(String value) {
            addCriterion("id_card_front >", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_front >=", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontLessThan(String value) {
            addCriterion("id_card_front <", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontLessThanOrEqualTo(String value) {
            addCriterion("id_card_front <=", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontLike(String value) {
            addCriterion("id_card_front like", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotLike(String value) {
            addCriterion("id_card_front not like", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontIn(List<String> values) {
            addCriterion("id_card_front in", values, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotIn(List<String> values) {
            addCriterion("id_card_front not in", values, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontBetween(String value1, String value2) {
            addCriterion("id_card_front between", value1, value2, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotBetween(String value1, String value2) {
            addCriterion("id_card_front not between", value1, value2, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardBackIsNull() {
            addCriterion("id_card_back is null");
            return (Criteria) this;
        }

        public Criteria andIdCardBackIsNotNull() {
            addCriterion("id_card_back is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardBackEqualTo(String value) {
            addCriterion("id_card_back =", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackNotEqualTo(String value) {
            addCriterion("id_card_back <>", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackGreaterThan(String value) {
            addCriterion("id_card_back >", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_back >=", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackLessThan(String value) {
            addCriterion("id_card_back <", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackLessThanOrEqualTo(String value) {
            addCriterion("id_card_back <=", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackLike(String value) {
            addCriterion("id_card_back like", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackNotLike(String value) {
            addCriterion("id_card_back not like", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackIn(List<String> values) {
            addCriterion("id_card_back in", values, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackNotIn(List<String> values) {
            addCriterion("id_card_back not in", values, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackBetween(String value1, String value2) {
            addCriterion("id_card_back between", value1, value2, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackNotBetween(String value1, String value2) {
            addCriterion("id_card_back not between", value1, value2, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNumIsNull() {
            addCriterion("bank_num is null");
            return (Criteria) this;
        }

        public Criteria andBankNumIsNotNull() {
            addCriterion("bank_num is not null");
            return (Criteria) this;
        }

        public Criteria andBankNumEqualTo(String value) {
            addCriterion("bank_num =", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumNotEqualTo(String value) {
            addCriterion("bank_num <>", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumGreaterThan(String value) {
            addCriterion("bank_num >", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumGreaterThanOrEqualTo(String value) {
            addCriterion("bank_num >=", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumLessThan(String value) {
            addCriterion("bank_num <", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumLessThanOrEqualTo(String value) {
            addCriterion("bank_num <=", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumLike(String value) {
            addCriterion("bank_num like", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumNotLike(String value) {
            addCriterion("bank_num not like", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumIn(List<String> values) {
            addCriterion("bank_num in", values, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumNotIn(List<String> values) {
            addCriterion("bank_num not in", values, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumBetween(String value1, String value2) {
            addCriterion("bank_num between", value1, value2, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumNotBetween(String value1, String value2) {
            addCriterion("bank_num not between", value1, value2, "bankNum");
            return (Criteria) this;
        }

        public Criteria andMainBussinessIsNull() {
            addCriterion("main_bussiness is null");
            return (Criteria) this;
        }

        public Criteria andMainBussinessIsNotNull() {
            addCriterion("main_bussiness is not null");
            return (Criteria) this;
        }

        public Criteria andMainBussinessEqualTo(String value) {
            addCriterion("main_bussiness =", value, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andMainBussinessNotEqualTo(String value) {
            addCriterion("main_bussiness <>", value, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andMainBussinessGreaterThan(String value) {
            addCriterion("main_bussiness >", value, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andMainBussinessGreaterThanOrEqualTo(String value) {
            addCriterion("main_bussiness >=", value, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andMainBussinessLessThan(String value) {
            addCriterion("main_bussiness <", value, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andMainBussinessLessThanOrEqualTo(String value) {
            addCriterion("main_bussiness <=", value, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andMainBussinessLike(String value) {
            addCriterion("main_bussiness like", value, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andMainBussinessNotLike(String value) {
            addCriterion("main_bussiness not like", value, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andMainBussinessIn(List<String> values) {
            addCriterion("main_bussiness in", values, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andMainBussinessNotIn(List<String> values) {
            addCriterion("main_bussiness not in", values, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andMainBussinessBetween(String value1, String value2) {
            addCriterion("main_bussiness between", value1, value2, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andMainBussinessNotBetween(String value1, String value2) {
            addCriterion("main_bussiness not between", value1, value2, "mainBussiness");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andIsAssignedIsNull() {
            addCriterion("is_assigned is null");
            return (Criteria) this;
        }

        public Criteria andIsAssignedIsNotNull() {
            addCriterion("is_assigned is not null");
            return (Criteria) this;
        }

        public Criteria andIsAssignedEqualTo(Byte value) {
            addCriterion("is_assigned =", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedNotEqualTo(Byte value) {
            addCriterion("is_assigned <>", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedGreaterThan(Byte value) {
            addCriterion("is_assigned >", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_assigned >=", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedLessThan(Byte value) {
            addCriterion("is_assigned <", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedLessThanOrEqualTo(Byte value) {
            addCriterion("is_assigned <=", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedIn(List<Byte> values) {
            addCriterion("is_assigned in", values, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedNotIn(List<Byte> values) {
            addCriterion("is_assigned not in", values, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedBetween(Byte value1, Byte value2) {
            addCriterion("is_assigned between", value1, value2, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_assigned not between", value1, value2, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNull() {
            addCriterion("is_share is null");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNotNull() {
            addCriterion("is_share is not null");
            return (Criteria) this;
        }

        public Criteria andIsShareEqualTo(Byte value) {
            addCriterion("is_share =", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotEqualTo(Byte value) {
            addCriterion("is_share <>", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThan(Byte value) {
            addCriterion("is_share >", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_share >=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThan(Byte value) {
            addCriterion("is_share <", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThanOrEqualTo(Byte value) {
            addCriterion("is_share <=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareIn(List<Byte> values) {
            addCriterion("is_share in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotIn(List<Byte> values) {
            addCriterion("is_share not in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareBetween(Byte value1, Byte value2) {
            addCriterion("is_share between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotBetween(Byte value1, Byte value2) {
            addCriterion("is_share not between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
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

        public Criteria andUpdatorIdIsNull() {
            addCriterion("updator_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdIsNotNull() {
            addCriterion("updator_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdEqualTo(Long value) {
            addCriterion("updator_id =", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdNotEqualTo(Long value) {
            addCriterion("updator_id <>", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdGreaterThan(Long value) {
            addCriterion("updator_id >", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("updator_id >=", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdLessThan(Long value) {
            addCriterion("updator_id <", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdLessThanOrEqualTo(Long value) {
            addCriterion("updator_id <=", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdIn(List<Long> values) {
            addCriterion("updator_id in", values, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdNotIn(List<Long> values) {
            addCriterion("updator_id not in", values, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdBetween(Long value1, Long value2) {
            addCriterion("updator_id between", value1, value2, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdNotBetween(Long value1, Long value2) {
            addCriterion("updator_id not between", value1, value2, "updatorId");
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