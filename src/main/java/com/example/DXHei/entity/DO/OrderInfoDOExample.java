package com.example.DXHei.entity.DO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoDOExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIsNull() {
            addCriterion("promotion_id is null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIsNotNull() {
            addCriterion("promotion_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdEqualTo(Long value) {
            addCriterion("promotion_id =", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotEqualTo(Long value) {
            addCriterion("promotion_id <>", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdGreaterThan(Long value) {
            addCriterion("promotion_id >", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("promotion_id >=", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdLessThan(Long value) {
            addCriterion("promotion_id <", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdLessThanOrEqualTo(Long value) {
            addCriterion("promotion_id <=", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIn(List<Long> values) {
            addCriterion("promotion_id in", values, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotIn(List<Long> values) {
            addCriterion("promotion_id not in", values, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdBetween(Long value1, Long value2) {
            addCriterion("promotion_id between", value1, value2, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotBetween(Long value1, Long value2) {
            addCriterion("promotion_id not between", value1, value2, "promotionId");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(Integer value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(Integer value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(Integer value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(Integer value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(Integer value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<Integer> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<Integer> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(Integer value1, Integer value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalIsNull() {
            addCriterion("order_total is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalIsNotNull() {
            addCriterion("order_total is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalEqualTo(Integer value) {
            addCriterion("order_total =", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalNotEqualTo(Integer value) {
            addCriterion("order_total <>", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalGreaterThan(Integer value) {
            addCriterion("order_total >", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_total >=", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalLessThan(Integer value) {
            addCriterion("order_total <", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalLessThanOrEqualTo(Integer value) {
            addCriterion("order_total <=", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalIn(List<Integer> values) {
            addCriterion("order_total in", values, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalNotIn(List<Integer> values) {
            addCriterion("order_total not in", values, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetween(Integer value1, Integer value2) {
            addCriterion("order_total between", value1, value2, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("order_total not between", value1, value2, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
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