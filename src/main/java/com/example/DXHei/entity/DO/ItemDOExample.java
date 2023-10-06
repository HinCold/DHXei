package com.example.DXHei.entity.DO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItemDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemDOExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andActsNameIsNull() {
            addCriterion("acts_name is null");
            return (Criteria) this;
        }

        public Criteria andActsNameIsNotNull() {
            addCriterion("acts_name is not null");
            return (Criteria) this;
        }

        public Criteria andActsNameEqualTo(String value) {
            addCriterion("acts_name =", value, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsNameNotEqualTo(String value) {
            addCriterion("acts_name <>", value, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsNameGreaterThan(String value) {
            addCriterion("acts_name >", value, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsNameGreaterThanOrEqualTo(String value) {
            addCriterion("acts_name >=", value, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsNameLessThan(String value) {
            addCriterion("acts_name <", value, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsNameLessThanOrEqualTo(String value) {
            addCriterion("acts_name <=", value, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsNameLike(String value) {
            addCriterion("acts_name like", value, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsNameNotLike(String value) {
            addCriterion("acts_name not like", value, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsNameIn(List<String> values) {
            addCriterion("acts_name in", values, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsNameNotIn(List<String> values) {
            addCriterion("acts_name not in", values, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsNameBetween(String value1, String value2) {
            addCriterion("acts_name between", value1, value2, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsNameNotBetween(String value1, String value2) {
            addCriterion("acts_name not between", value1, value2, "actsName");
            return (Criteria) this;
        }

        public Criteria andActsTitleIsNull() {
            addCriterion("acts_title is null");
            return (Criteria) this;
        }

        public Criteria andActsTitleIsNotNull() {
            addCriterion("acts_title is not null");
            return (Criteria) this;
        }

        public Criteria andActsTitleEqualTo(String value) {
            addCriterion("acts_title =", value, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsTitleNotEqualTo(String value) {
            addCriterion("acts_title <>", value, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsTitleGreaterThan(String value) {
            addCriterion("acts_title >", value, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("acts_title >=", value, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsTitleLessThan(String value) {
            addCriterion("acts_title <", value, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsTitleLessThanOrEqualTo(String value) {
            addCriterion("acts_title <=", value, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsTitleLike(String value) {
            addCriterion("acts_title like", value, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsTitleNotLike(String value) {
            addCriterion("acts_title not like", value, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsTitleIn(List<String> values) {
            addCriterion("acts_title in", values, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsTitleNotIn(List<String> values) {
            addCriterion("acts_title not in", values, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsTitleBetween(String value1, String value2) {
            addCriterion("acts_title between", value1, value2, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsTitleNotBetween(String value1, String value2) {
            addCriterion("acts_title not between", value1, value2, "actsTitle");
            return (Criteria) this;
        }

        public Criteria andActsImgIsNull() {
            addCriterion("acts_img is null");
            return (Criteria) this;
        }

        public Criteria andActsImgIsNotNull() {
            addCriterion("acts_img is not null");
            return (Criteria) this;
        }

        public Criteria andActsImgEqualTo(String value) {
            addCriterion("acts_img =", value, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsImgNotEqualTo(String value) {
            addCriterion("acts_img <>", value, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsImgGreaterThan(String value) {
            addCriterion("acts_img >", value, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsImgGreaterThanOrEqualTo(String value) {
            addCriterion("acts_img >=", value, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsImgLessThan(String value) {
            addCriterion("acts_img <", value, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsImgLessThanOrEqualTo(String value) {
            addCriterion("acts_img <=", value, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsImgLike(String value) {
            addCriterion("acts_img like", value, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsImgNotLike(String value) {
            addCriterion("acts_img not like", value, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsImgIn(List<String> values) {
            addCriterion("acts_img in", values, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsImgNotIn(List<String> values) {
            addCriterion("acts_img not in", values, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsImgBetween(String value1, String value2) {
            addCriterion("acts_img between", value1, value2, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsImgNotBetween(String value1, String value2) {
            addCriterion("acts_img not between", value1, value2, "actsImg");
            return (Criteria) this;
        }

        public Criteria andActsPriceIsNull() {
            addCriterion("acts_price is null");
            return (Criteria) this;
        }

        public Criteria andActsPriceIsNotNull() {
            addCriterion("acts_price is not null");
            return (Criteria) this;
        }

        public Criteria andActsPriceEqualTo(BigDecimal value) {
            addCriterion("acts_price =", value, "actsPrice");
            return (Criteria) this;
        }

        public Criteria andActsPriceNotEqualTo(BigDecimal value) {
            addCriterion("acts_price <>", value, "actsPrice");
            return (Criteria) this;
        }

        public Criteria andActsPriceGreaterThan(BigDecimal value) {
            addCriterion("acts_price >", value, "actsPrice");
            return (Criteria) this;
        }

        public Criteria andActsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("acts_price >=", value, "actsPrice");
            return (Criteria) this;
        }

        public Criteria andActsPriceLessThan(BigDecimal value) {
            addCriterion("acts_price <", value, "actsPrice");
            return (Criteria) this;
        }

        public Criteria andActsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("acts_price <=", value, "actsPrice");
            return (Criteria) this;
        }

        public Criteria andActsPriceIn(List<BigDecimal> values) {
            addCriterion("acts_price in", values, "actsPrice");
            return (Criteria) this;
        }

        public Criteria andActsPriceNotIn(List<BigDecimal> values) {
            addCriterion("acts_price not in", values, "actsPrice");
            return (Criteria) this;
        }

        public Criteria andActsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acts_price between", value1, value2, "actsPrice");
            return (Criteria) this;
        }

        public Criteria andActsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acts_price not between", value1, value2, "actsPrice");
            return (Criteria) this;
        }

        public Criteria andActsStockIsNull() {
            addCriterion("acts_stock is null");
            return (Criteria) this;
        }

        public Criteria andActsStockIsNotNull() {
            addCriterion("acts_stock is not null");
            return (Criteria) this;
        }

        public Criteria andActsStockEqualTo(Integer value) {
            addCriterion("acts_stock =", value, "actsStock");
            return (Criteria) this;
        }

        public Criteria andActsStockNotEqualTo(Integer value) {
            addCriterion("acts_stock <>", value, "actsStock");
            return (Criteria) this;
        }

        public Criteria andActsStockGreaterThan(Integer value) {
            addCriterion("acts_stock >", value, "actsStock");
            return (Criteria) this;
        }

        public Criteria andActsStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("acts_stock >=", value, "actsStock");
            return (Criteria) this;
        }

        public Criteria andActsStockLessThan(Integer value) {
            addCriterion("acts_stock <", value, "actsStock");
            return (Criteria) this;
        }

        public Criteria andActsStockLessThanOrEqualTo(Integer value) {
            addCriterion("acts_stock <=", value, "actsStock");
            return (Criteria) this;
        }

        public Criteria andActsStockIn(List<Integer> values) {
            addCriterion("acts_stock in", values, "actsStock");
            return (Criteria) this;
        }

        public Criteria andActsStockNotIn(List<Integer> values) {
            addCriterion("acts_stock not in", values, "actsStock");
            return (Criteria) this;
        }

        public Criteria andActsStockBetween(Integer value1, Integer value2) {
            addCriterion("acts_stock between", value1, value2, "actsStock");
            return (Criteria) this;
        }

        public Criteria andActsStockNotBetween(Integer value1, Integer value2) {
            addCriterion("acts_stock not between", value1, value2, "actsStock");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Integer value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Integer value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Integer value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Integer value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Integer value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Integer> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Integer> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Integer value1, Integer value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("sales not between", value1, value2, "sales");
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