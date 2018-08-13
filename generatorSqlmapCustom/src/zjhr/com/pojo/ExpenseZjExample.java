package zjhr.com.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExpenseZjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpenseZjExample() {
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

        public Criteria andBxidIsNull() {
            addCriterion("bxId is null");
            return (Criteria) this;
        }

        public Criteria andBxidIsNotNull() {
            addCriterion("bxId is not null");
            return (Criteria) this;
        }

        public Criteria andBxidEqualTo(String value) {
            addCriterion("bxId =", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidNotEqualTo(String value) {
            addCriterion("bxId <>", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidGreaterThan(String value) {
            addCriterion("bxId >", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidGreaterThanOrEqualTo(String value) {
            addCriterion("bxId >=", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidLessThan(String value) {
            addCriterion("bxId <", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidLessThanOrEqualTo(String value) {
            addCriterion("bxId <=", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidLike(String value) {
            addCriterion("bxId like", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidNotLike(String value) {
            addCriterion("bxId not like", value, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidIn(List<String> values) {
            addCriterion("bxId in", values, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidNotIn(List<String> values) {
            addCriterion("bxId not in", values, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidBetween(String value1, String value2) {
            addCriterion("bxId between", value1, value2, "bxid");
            return (Criteria) this;
        }

        public Criteria andBxidNotBetween(String value1, String value2) {
            addCriterion("bxId not between", value1, value2, "bxid");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("accountId is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("accountId is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(String value) {
            addCriterion("accountId =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(String value) {
            addCriterion("accountId <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(String value) {
            addCriterion("accountId >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(String value) {
            addCriterion("accountId >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(String value) {
            addCriterion("accountId <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(String value) {
            addCriterion("accountId <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLike(String value) {
            addCriterion("accountId like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotLike(String value) {
            addCriterion("accountId not like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<String> values) {
            addCriterion("accountId in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<String> values) {
            addCriterion("accountId not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(String value1, String value2) {
            addCriterion("accountId between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(String value1, String value2) {
            addCriterion("accountId not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("accountName is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("accountName is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("accountName =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("accountName <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("accountName >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("accountName >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("accountName <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("accountName <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("accountName like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("accountName not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("accountName in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("accountName not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("accountName between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("accountName not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andExpdateIsNull() {
            addCriterion("expDate is null");
            return (Criteria) this;
        }

        public Criteria andExpdateIsNotNull() {
            addCriterion("expDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpdateEqualTo(String value) {
            addCriterion("expDate =", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateNotEqualTo(String value) {
            addCriterion("expDate <>", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateGreaterThan(String value) {
            addCriterion("expDate >", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateGreaterThanOrEqualTo(String value) {
            addCriterion("expDate >=", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateLessThan(String value) {
            addCriterion("expDate <", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateLessThanOrEqualTo(String value) {
            addCriterion("expDate <=", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateLike(String value) {
            addCriterion("expDate like", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateNotLike(String value) {
            addCriterion("expDate not like", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateIn(List<String> values) {
            addCriterion("expDate in", values, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateNotIn(List<String> values) {
            addCriterion("expDate not in", values, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateBetween(String value1, String value2) {
            addCriterion("expDate between", value1, value2, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateNotBetween(String value1, String value2) {
            addCriterion("expDate not between", value1, value2, "expdate");
            return (Criteria) this;
        }

        public Criteria andStafftypeIsNull() {
            addCriterion("staffType is null");
            return (Criteria) this;
        }

        public Criteria andStafftypeIsNotNull() {
            addCriterion("staffType is not null");
            return (Criteria) this;
        }

        public Criteria andStafftypeEqualTo(String value) {
            addCriterion("staffType =", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeNotEqualTo(String value) {
            addCriterion("staffType <>", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeGreaterThan(String value) {
            addCriterion("staffType >", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeGreaterThanOrEqualTo(String value) {
            addCriterion("staffType >=", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeLessThan(String value) {
            addCriterion("staffType <", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeLessThanOrEqualTo(String value) {
            addCriterion("staffType <=", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeLike(String value) {
            addCriterion("staffType like", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeNotLike(String value) {
            addCriterion("staffType not like", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeIn(List<String> values) {
            addCriterion("staffType in", values, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeNotIn(List<String> values) {
            addCriterion("staffType not in", values, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeBetween(String value1, String value2) {
            addCriterion("staffType between", value1, value2, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeNotBetween(String value1, String value2) {
            addCriterion("staffType not between", value1, value2, "stafftype");
            return (Criteria) this;
        }

        public Criteria andExpCommentIsNull() {
            addCriterion("exp_comment is null");
            return (Criteria) this;
        }

        public Criteria andExpCommentIsNotNull() {
            addCriterion("exp_comment is not null");
            return (Criteria) this;
        }

        public Criteria andExpCommentEqualTo(String value) {
            addCriterion("exp_comment =", value, "expComment");
            return (Criteria) this;
        }

        public Criteria andExpCommentNotEqualTo(String value) {
            addCriterion("exp_comment <>", value, "expComment");
            return (Criteria) this;
        }

        public Criteria andExpCommentGreaterThan(String value) {
            addCriterion("exp_comment >", value, "expComment");
            return (Criteria) this;
        }

        public Criteria andExpCommentGreaterThanOrEqualTo(String value) {
            addCriterion("exp_comment >=", value, "expComment");
            return (Criteria) this;
        }

        public Criteria andExpCommentLessThan(String value) {
            addCriterion("exp_comment <", value, "expComment");
            return (Criteria) this;
        }

        public Criteria andExpCommentLessThanOrEqualTo(String value) {
            addCriterion("exp_comment <=", value, "expComment");
            return (Criteria) this;
        }

        public Criteria andExpCommentLike(String value) {
            addCriterion("exp_comment like", value, "expComment");
            return (Criteria) this;
        }

        public Criteria andExpCommentNotLike(String value) {
            addCriterion("exp_comment not like", value, "expComment");
            return (Criteria) this;
        }

        public Criteria andExpCommentIn(List<String> values) {
            addCriterion("exp_comment in", values, "expComment");
            return (Criteria) this;
        }

        public Criteria andExpCommentNotIn(List<String> values) {
            addCriterion("exp_comment not in", values, "expComment");
            return (Criteria) this;
        }

        public Criteria andExpCommentBetween(String value1, String value2) {
            addCriterion("exp_comment between", value1, value2, "expComment");
            return (Criteria) this;
        }

        public Criteria andExpCommentNotBetween(String value1, String value2) {
            addCriterion("exp_comment not between", value1, value2, "expComment");
            return (Criteria) this;
        }

        public Criteria andAccountdateIsNull() {
            addCriterion("accountDate is null");
            return (Criteria) this;
        }

        public Criteria andAccountdateIsNotNull() {
            addCriterion("accountDate is not null");
            return (Criteria) this;
        }

        public Criteria andAccountdateEqualTo(String value) {
            addCriterion("accountDate =", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateNotEqualTo(String value) {
            addCriterion("accountDate <>", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateGreaterThan(String value) {
            addCriterion("accountDate >", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateGreaterThanOrEqualTo(String value) {
            addCriterion("accountDate >=", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateLessThan(String value) {
            addCriterion("accountDate <", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateLessThanOrEqualTo(String value) {
            addCriterion("accountDate <=", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateLike(String value) {
            addCriterion("accountDate like", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateNotLike(String value) {
            addCriterion("accountDate not like", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateIn(List<String> values) {
            addCriterion("accountDate in", values, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateNotIn(List<String> values) {
            addCriterion("accountDate not in", values, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateBetween(String value1, String value2) {
            addCriterion("accountDate between", value1, value2, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateNotBetween(String value1, String value2) {
            addCriterion("accountDate not between", value1, value2, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccouttypeIsNull() {
            addCriterion("accoutType is null");
            return (Criteria) this;
        }

        public Criteria andAccouttypeIsNotNull() {
            addCriterion("accoutType is not null");
            return (Criteria) this;
        }

        public Criteria andAccouttypeEqualTo(String value) {
            addCriterion("accoutType =", value, "accouttype");
            return (Criteria) this;
        }

        public Criteria andAccouttypeNotEqualTo(String value) {
            addCriterion("accoutType <>", value, "accouttype");
            return (Criteria) this;
        }

        public Criteria andAccouttypeGreaterThan(String value) {
            addCriterion("accoutType >", value, "accouttype");
            return (Criteria) this;
        }

        public Criteria andAccouttypeGreaterThanOrEqualTo(String value) {
            addCriterion("accoutType >=", value, "accouttype");
            return (Criteria) this;
        }

        public Criteria andAccouttypeLessThan(String value) {
            addCriterion("accoutType <", value, "accouttype");
            return (Criteria) this;
        }

        public Criteria andAccouttypeLessThanOrEqualTo(String value) {
            addCriterion("accoutType <=", value, "accouttype");
            return (Criteria) this;
        }

        public Criteria andAccouttypeLike(String value) {
            addCriterion("accoutType like", value, "accouttype");
            return (Criteria) this;
        }

        public Criteria andAccouttypeNotLike(String value) {
            addCriterion("accoutType not like", value, "accouttype");
            return (Criteria) this;
        }

        public Criteria andAccouttypeIn(List<String> values) {
            addCriterion("accoutType in", values, "accouttype");
            return (Criteria) this;
        }

        public Criteria andAccouttypeNotIn(List<String> values) {
            addCriterion("accoutType not in", values, "accouttype");
            return (Criteria) this;
        }

        public Criteria andAccouttypeBetween(String value1, String value2) {
            addCriterion("accoutType between", value1, value2, "accouttype");
            return (Criteria) this;
        }

        public Criteria andAccouttypeNotBetween(String value1, String value2) {
            addCriterion("accoutType not between", value1, value2, "accouttype");
            return (Criteria) this;
        }

        public Criteria andBxMoneyIsNull() {
            addCriterion("bx_money is null");
            return (Criteria) this;
        }

        public Criteria andBxMoneyIsNotNull() {
            addCriterion("bx_money is not null");
            return (Criteria) this;
        }

        public Criteria andBxMoneyEqualTo(String value) {
            addCriterion("bx_money =", value, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxMoneyNotEqualTo(String value) {
            addCriterion("bx_money <>", value, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxMoneyGreaterThan(String value) {
            addCriterion("bx_money >", value, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("bx_money >=", value, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxMoneyLessThan(String value) {
            addCriterion("bx_money <", value, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxMoneyLessThanOrEqualTo(String value) {
            addCriterion("bx_money <=", value, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxMoneyLike(String value) {
            addCriterion("bx_money like", value, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxMoneyNotLike(String value) {
            addCriterion("bx_money not like", value, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxMoneyIn(List<String> values) {
            addCriterion("bx_money in", values, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxMoneyNotIn(List<String> values) {
            addCriterion("bx_money not in", values, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxMoneyBetween(String value1, String value2) {
            addCriterion("bx_money between", value1, value2, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxMoneyNotBetween(String value1, String value2) {
            addCriterion("bx_money not between", value1, value2, "bxMoney");
            return (Criteria) this;
        }

        public Criteria andBxJobIsNull() {
            addCriterion("bx_job is null");
            return (Criteria) this;
        }

        public Criteria andBxJobIsNotNull() {
            addCriterion("bx_job is not null");
            return (Criteria) this;
        }

        public Criteria andBxJobEqualTo(String value) {
            addCriterion("bx_job =", value, "bxJob");
            return (Criteria) this;
        }

        public Criteria andBxJobNotEqualTo(String value) {
            addCriterion("bx_job <>", value, "bxJob");
            return (Criteria) this;
        }

        public Criteria andBxJobGreaterThan(String value) {
            addCriterion("bx_job >", value, "bxJob");
            return (Criteria) this;
        }

        public Criteria andBxJobGreaterThanOrEqualTo(String value) {
            addCriterion("bx_job >=", value, "bxJob");
            return (Criteria) this;
        }

        public Criteria andBxJobLessThan(String value) {
            addCriterion("bx_job <", value, "bxJob");
            return (Criteria) this;
        }

        public Criteria andBxJobLessThanOrEqualTo(String value) {
            addCriterion("bx_job <=", value, "bxJob");
            return (Criteria) this;
        }

        public Criteria andBxJobLike(String value) {
            addCriterion("bx_job like", value, "bxJob");
            return (Criteria) this;
        }

        public Criteria andBxJobNotLike(String value) {
            addCriterion("bx_job not like", value, "bxJob");
            return (Criteria) this;
        }

        public Criteria andBxJobIn(List<String> values) {
            addCriterion("bx_job in", values, "bxJob");
            return (Criteria) this;
        }

        public Criteria andBxJobNotIn(List<String> values) {
            addCriterion("bx_job not in", values, "bxJob");
            return (Criteria) this;
        }

        public Criteria andBxJobBetween(String value1, String value2) {
            addCriterion("bx_job between", value1, value2, "bxJob");
            return (Criteria) this;
        }

        public Criteria andBxJobNotBetween(String value1, String value2) {
            addCriterion("bx_job not between", value1, value2, "bxJob");
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