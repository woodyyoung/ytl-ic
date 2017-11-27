package com.lty.ic.gw.bean;

import java.util.ArrayList;
import java.util.List;

public class ZHDataBufferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ZHDataBufferExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andRecordtypeIsNull() {
            addCriterion("recordtype is null");
            return (Criteria) this;
        }

        public Criteria andRecordtypeIsNotNull() {
            addCriterion("recordtype is not null");
            return (Criteria) this;
        }

        public Criteria andRecordtypeEqualTo(String value) {
            addCriterion("recordtype =", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNotEqualTo(String value) {
            addCriterion("recordtype <>", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeGreaterThan(String value) {
            addCriterion("recordtype >", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeGreaterThanOrEqualTo(String value) {
            addCriterion("recordtype >=", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeLessThan(String value) {
            addCriterion("recordtype <", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeLessThanOrEqualTo(String value) {
            addCriterion("recordtype <=", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeLike(String value) {
            addCriterion("recordtype like", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNotLike(String value) {
            addCriterion("recordtype not like", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeIn(List<String> values) {
            addCriterion("recordtype in", values, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNotIn(List<String> values) {
            addCriterion("recordtype not in", values, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeBetween(String value1, String value2) {
            addCriterion("recordtype between", value1, value2, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNotBetween(String value1, String value2) {
            addCriterion("recordtype not between", value1, value2, "recordtype");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andDataBufferIsNull() {
            addCriterion("data_buffer is null");
            return (Criteria) this;
        }

        public Criteria andDataBufferIsNotNull() {
            addCriterion("data_buffer is not null");
            return (Criteria) this;
        }

        public Criteria andDataBufferEqualTo(String value) {
            addCriterion("data_buffer =", value, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andDataBufferNotEqualTo(String value) {
            addCriterion("data_buffer <>", value, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andDataBufferGreaterThan(String value) {
            addCriterion("data_buffer >", value, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andDataBufferGreaterThanOrEqualTo(String value) {
            addCriterion("data_buffer >=", value, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andDataBufferLessThan(String value) {
            addCriterion("data_buffer <", value, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andDataBufferLessThanOrEqualTo(String value) {
            addCriterion("data_buffer <=", value, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andDataBufferLike(String value) {
            addCriterion("data_buffer like", value, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andDataBufferNotLike(String value) {
            addCriterion("data_buffer not like", value, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andDataBufferIn(List<String> values) {
            addCriterion("data_buffer in", values, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andDataBufferNotIn(List<String> values) {
            addCriterion("data_buffer not in", values, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andDataBufferBetween(String value1, String value2) {
            addCriterion("data_buffer between", value1, value2, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andDataBufferNotBetween(String value1, String value2) {
            addCriterion("data_buffer not between", value1, value2, "dataBuffer");
            return (Criteria) this;
        }

        public Criteria andErrcodeIsNull() {
            addCriterion("errcode is null");
            return (Criteria) this;
        }

        public Criteria andErrcodeIsNotNull() {
            addCriterion("errcode is not null");
            return (Criteria) this;
        }

        public Criteria andErrcodeEqualTo(Integer value) {
            addCriterion("errcode =", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotEqualTo(Integer value) {
            addCriterion("errcode <>", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeGreaterThan(Integer value) {
            addCriterion("errcode >", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("errcode >=", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLessThan(Integer value) {
            addCriterion("errcode <", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLessThanOrEqualTo(Integer value) {
            addCriterion("errcode <=", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeIn(List<Integer> values) {
            addCriterion("errcode in", values, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotIn(List<Integer> values) {
            addCriterion("errcode not in", values, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeBetween(Integer value1, Integer value2) {
            addCriterion("errcode between", value1, value2, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("errcode not between", value1, value2, "errcode");
            return (Criteria) this;
        }

        public Criteria andInputfilenameIsNull() {
            addCriterion("inputfilename is null");
            return (Criteria) this;
        }

        public Criteria andInputfilenameIsNotNull() {
            addCriterion("inputfilename is not null");
            return (Criteria) this;
        }

        public Criteria andInputfilenameEqualTo(String value) {
            addCriterion("inputfilename =", value, "inputfilename");
            return (Criteria) this;
        }

        public Criteria andInputfilenameNotEqualTo(String value) {
            addCriterion("inputfilename <>", value, "inputfilename");
            return (Criteria) this;
        }

        public Criteria andInputfilenameGreaterThan(String value) {
            addCriterion("inputfilename >", value, "inputfilename");
            return (Criteria) this;
        }

        public Criteria andInputfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("inputfilename >=", value, "inputfilename");
            return (Criteria) this;
        }

        public Criteria andInputfilenameLessThan(String value) {
            addCriterion("inputfilename <", value, "inputfilename");
            return (Criteria) this;
        }

        public Criteria andInputfilenameLessThanOrEqualTo(String value) {
            addCriterion("inputfilename <=", value, "inputfilename");
            return (Criteria) this;
        }

        public Criteria andInputfilenameLike(String value) {
            addCriterion("inputfilename like", value, "inputfilename");
            return (Criteria) this;
        }

        public Criteria andInputfilenameNotLike(String value) {
            addCriterion("inputfilename not like", value, "inputfilename");
            return (Criteria) this;
        }

        public Criteria andInputfilenameIn(List<String> values) {
            addCriterion("inputfilename in", values, "inputfilename");
            return (Criteria) this;
        }

        public Criteria andInputfilenameNotIn(List<String> values) {
            addCriterion("inputfilename not in", values, "inputfilename");
            return (Criteria) this;
        }

        public Criteria andInputfilenameBetween(String value1, String value2) {
            addCriterion("inputfilename between", value1, value2, "inputfilename");
            return (Criteria) this;
        }

        public Criteria andInputfilenameNotBetween(String value1, String value2) {
            addCriterion("inputfilename not between", value1, value2, "inputfilename");
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