package zjhr.com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andExpdateEqualTo(Date value) {
            addCriterionForJDBCDate("expDate =", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expDate <>", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("expDate >", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expDate >=", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateLessThan(Date value) {
            addCriterionForJDBCDate("expDate <", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expDate <=", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateIn(List<Date> values) {
            addCriterionForJDBCDate("expDate in", values, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expDate not in", values, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expDate between", value1, value2, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expDate not between", value1, value2, "expdate");
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

        public Criteria andAccountdateEqualTo(Date value) {
            addCriterionForJDBCDate("accountDate =", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("accountDate <>", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateGreaterThan(Date value) {
            addCriterionForJDBCDate("accountDate >", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accountDate >=", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateLessThan(Date value) {
            addCriterionForJDBCDate("accountDate <", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accountDate <=", value, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateIn(List<Date> values) {
            addCriterionForJDBCDate("accountDate in", values, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("accountDate not in", values, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accountDate between", value1, value2, "accountdate");
            return (Criteria) this;
        }

        public Criteria andAccountdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accountDate not between", value1, value2, "accountdate");
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

        public Criteria andAccountcommentIsNull() {
            addCriterion("accountComment is null");
            return (Criteria) this;
        }

        public Criteria andAccountcommentIsNotNull() {
            addCriterion("accountComment is not null");
            return (Criteria) this;
        }

        public Criteria andAccountcommentEqualTo(String value) {
            addCriterion("accountComment =", value, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andAccountcommentNotEqualTo(String value) {
            addCriterion("accountComment <>", value, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andAccountcommentGreaterThan(String value) {
            addCriterion("accountComment >", value, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andAccountcommentGreaterThanOrEqualTo(String value) {
            addCriterion("accountComment >=", value, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andAccountcommentLessThan(String value) {
            addCriterion("accountComment <", value, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andAccountcommentLessThanOrEqualTo(String value) {
            addCriterion("accountComment <=", value, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andAccountcommentLike(String value) {
            addCriterion("accountComment like", value, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andAccountcommentNotLike(String value) {
            addCriterion("accountComment not like", value, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andAccountcommentIn(List<String> values) {
            addCriterion("accountComment in", values, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andAccountcommentNotIn(List<String> values) {
            addCriterion("accountComment not in", values, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andAccountcommentBetween(String value1, String value2) {
            addCriterion("accountComment between", value1, value2, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andAccountcommentNotBetween(String value1, String value2) {
            addCriterion("accountComment not between", value1, value2, "accountcomment");
            return (Criteria) this;
        }

        public Criteria andBxmoneyIsNull() {
            addCriterion("bxMoney is null");
            return (Criteria) this;
        }

        public Criteria andBxmoneyIsNotNull() {
            addCriterion("bxMoney is not null");
            return (Criteria) this;
        }

        public Criteria andBxmoneyEqualTo(String value) {
            addCriterion("bxMoney =", value, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxmoneyNotEqualTo(String value) {
            addCriterion("bxMoney <>", value, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxmoneyGreaterThan(String value) {
            addCriterion("bxMoney >", value, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("bxMoney >=", value, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxmoneyLessThan(String value) {
            addCriterion("bxMoney <", value, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxmoneyLessThanOrEqualTo(String value) {
            addCriterion("bxMoney <=", value, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxmoneyLike(String value) {
            addCriterion("bxMoney like", value, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxmoneyNotLike(String value) {
            addCriterion("bxMoney not like", value, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxmoneyIn(List<String> values) {
            addCriterion("bxMoney in", values, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxmoneyNotIn(List<String> values) {
            addCriterion("bxMoney not in", values, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxmoneyBetween(String value1, String value2) {
            addCriterion("bxMoney between", value1, value2, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxmoneyNotBetween(String value1, String value2) {
            addCriterion("bxMoney not between", value1, value2, "bxmoney");
            return (Criteria) this;
        }

        public Criteria andBxjobIsNull() {
            addCriterion("bxJob is null");
            return (Criteria) this;
        }

        public Criteria andBxjobIsNotNull() {
            addCriterion("bxJob is not null");
            return (Criteria) this;
        }

        public Criteria andBxjobEqualTo(String value) {
            addCriterion("bxJob =", value, "bxjob");
            return (Criteria) this;
        }

        public Criteria andBxjobNotEqualTo(String value) {
            addCriterion("bxJob <>", value, "bxjob");
            return (Criteria) this;
        }

        public Criteria andBxjobGreaterThan(String value) {
            addCriterion("bxJob >", value, "bxjob");
            return (Criteria) this;
        }

        public Criteria andBxjobGreaterThanOrEqualTo(String value) {
            addCriterion("bxJob >=", value, "bxjob");
            return (Criteria) this;
        }

        public Criteria andBxjobLessThan(String value) {
            addCriterion("bxJob <", value, "bxjob");
            return (Criteria) this;
        }

        public Criteria andBxjobLessThanOrEqualTo(String value) {
            addCriterion("bxJob <=", value, "bxjob");
            return (Criteria) this;
        }

        public Criteria andBxjobLike(String value) {
            addCriterion("bxJob like", value, "bxjob");
            return (Criteria) this;
        }

        public Criteria andBxjobNotLike(String value) {
            addCriterion("bxJob not like", value, "bxjob");
            return (Criteria) this;
        }

        public Criteria andBxjobIn(List<String> values) {
            addCriterion("bxJob in", values, "bxjob");
            return (Criteria) this;
        }

        public Criteria andBxjobNotIn(List<String> values) {
            addCriterion("bxJob not in", values, "bxjob");
            return (Criteria) this;
        }

        public Criteria andBxjobBetween(String value1, String value2) {
            addCriterion("bxJob between", value1, value2, "bxjob");
            return (Criteria) this;
        }

        public Criteria andBxjobNotBetween(String value1, String value2) {
            addCriterion("bxJob not between", value1, value2, "bxjob");
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