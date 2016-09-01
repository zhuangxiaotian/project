package topdeep.common.entity.db;

import common.entity.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemExceptionLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public SystemExceptionLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeIsNull() {
            addCriterion("EXCEPTION_FUNC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeIsNotNull() {
            addCriterion("EXCEPTION_FUNC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeEqualTo(String value) {
            addCriterion("EXCEPTION_FUNC_CODE =", value, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeNotEqualTo(String value) {
            addCriterion("EXCEPTION_FUNC_CODE <>", value, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeGreaterThan(String value) {
            addCriterion("EXCEPTION_FUNC_CODE >", value, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_FUNC_CODE >=", value, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeLessThan(String value) {
            addCriterion("EXCEPTION_FUNC_CODE <", value, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_FUNC_CODE <=", value, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeLike(String value) {
            addCriterion("EXCEPTION_FUNC_CODE like", value, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeNotLike(String value) {
            addCriterion("EXCEPTION_FUNC_CODE not like", value, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeIn(List<String> values) {
            addCriterion("EXCEPTION_FUNC_CODE in", values, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeNotIn(List<String> values) {
            addCriterion("EXCEPTION_FUNC_CODE not in", values, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeBetween(String value1, String value2) {
            addCriterion("EXCEPTION_FUNC_CODE between", value1, value2, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionFuncCodeNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_FUNC_CODE not between", value1, value2, "exceptionFuncCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeIsNull() {
            addCriterion("EXCEPTION_RESULT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeIsNotNull() {
            addCriterion("EXCEPTION_RESULT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeEqualTo(String value) {
            addCriterion("EXCEPTION_RESULT_CODE =", value, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeNotEqualTo(String value) {
            addCriterion("EXCEPTION_RESULT_CODE <>", value, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeGreaterThan(String value) {
            addCriterion("EXCEPTION_RESULT_CODE >", value, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_RESULT_CODE >=", value, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeLessThan(String value) {
            addCriterion("EXCEPTION_RESULT_CODE <", value, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_RESULT_CODE <=", value, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeLike(String value) {
            addCriterion("EXCEPTION_RESULT_CODE like", value, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeNotLike(String value) {
            addCriterion("EXCEPTION_RESULT_CODE not like", value, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeIn(List<String> values) {
            addCriterion("EXCEPTION_RESULT_CODE in", values, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeNotIn(List<String> values) {
            addCriterion("EXCEPTION_RESULT_CODE not in", values, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeBetween(String value1, String value2) {
            addCriterion("EXCEPTION_RESULT_CODE between", value1, value2, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultCodeNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_RESULT_CODE not between", value1, value2, "exceptionResultCode");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgIsNull() {
            addCriterion("EXCEPTION_RESULT_MSG is null");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgIsNotNull() {
            addCriterion("EXCEPTION_RESULT_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgEqualTo(String value) {
            addCriterion("EXCEPTION_RESULT_MSG =", value, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgNotEqualTo(String value) {
            addCriterion("EXCEPTION_RESULT_MSG <>", value, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgGreaterThan(String value) {
            addCriterion("EXCEPTION_RESULT_MSG >", value, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_RESULT_MSG >=", value, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgLessThan(String value) {
            addCriterion("EXCEPTION_RESULT_MSG <", value, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_RESULT_MSG <=", value, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgLike(String value) {
            addCriterion("EXCEPTION_RESULT_MSG like", value, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgNotLike(String value) {
            addCriterion("EXCEPTION_RESULT_MSG not like", value, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgIn(List<String> values) {
            addCriterion("EXCEPTION_RESULT_MSG in", values, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgNotIn(List<String> values) {
            addCriterion("EXCEPTION_RESULT_MSG not in", values, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgBetween(String value1, String value2) {
            addCriterion("EXCEPTION_RESULT_MSG between", value1, value2, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionResultMsgNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_RESULT_MSG not between", value1, value2, "exceptionResultMsg");
            return (Criteria) this;
        }

        public Criteria andFromSrcIsNull() {
            addCriterion("FROM_SRC is null");
            return (Criteria) this;
        }

        public Criteria andFromSrcIsNotNull() {
            addCriterion("FROM_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andFromSrcEqualTo(String value) {
            addCriterion("FROM_SRC =", value, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andFromSrcNotEqualTo(String value) {
            addCriterion("FROM_SRC <>", value, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andFromSrcGreaterThan(String value) {
            addCriterion("FROM_SRC >", value, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andFromSrcGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_SRC >=", value, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andFromSrcLessThan(String value) {
            addCriterion("FROM_SRC <", value, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andFromSrcLessThanOrEqualTo(String value) {
            addCriterion("FROM_SRC <=", value, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andFromSrcLike(String value) {
            addCriterion("FROM_SRC like", value, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andFromSrcNotLike(String value) {
            addCriterion("FROM_SRC not like", value, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andFromSrcIn(List<String> values) {
            addCriterion("FROM_SRC in", values, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andFromSrcNotIn(List<String> values) {
            addCriterion("FROM_SRC not in", values, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andFromSrcBetween(String value1, String value2) {
            addCriterion("FROM_SRC between", value1, value2, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andFromSrcNotBetween(String value1, String value2) {
            addCriterion("FROM_SRC not between", value1, value2, "fromSrc");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoIsNull() {
            addCriterion("EXCEPTION_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoIsNotNull() {
            addCriterion("EXCEPTION_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoEqualTo(String value) {
            addCriterion("EXCEPTION_MEMO =", value, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoNotEqualTo(String value) {
            addCriterion("EXCEPTION_MEMO <>", value, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoGreaterThan(String value) {
            addCriterion("EXCEPTION_MEMO >", value, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_MEMO >=", value, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoLessThan(String value) {
            addCriterion("EXCEPTION_MEMO <", value, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_MEMO <=", value, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoLike(String value) {
            addCriterion("EXCEPTION_MEMO like", value, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoNotLike(String value) {
            addCriterion("EXCEPTION_MEMO not like", value, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoIn(List<String> values) {
            addCriterion("EXCEPTION_MEMO in", values, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoNotIn(List<String> values) {
            addCriterion("EXCEPTION_MEMO not in", values, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoBetween(String value1, String value2) {
            addCriterion("EXCEPTION_MEMO between", value1, value2, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andExceptionMemoNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_MEMO not between", value1, value2, "exceptionMemo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRowVersionIsNull() {
            addCriterion("ROW_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andRowVersionIsNotNull() {
            addCriterion("ROW_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andRowVersionEqualTo(Integer value) {
            addCriterion("ROW_VERSION =", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotEqualTo(Integer value) {
            addCriterion("ROW_VERSION <>", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionGreaterThan(Integer value) {
            addCriterion("ROW_VERSION >", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROW_VERSION >=", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionLessThan(Integer value) {
            addCriterion("ROW_VERSION <", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionLessThanOrEqualTo(Integer value) {
            addCriterion("ROW_VERSION <=", value, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionIn(List<Integer> values) {
            addCriterion("ROW_VERSION in", values, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotIn(List<Integer> values) {
            addCriterion("ROW_VERSION not in", values, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionBetween(Integer value1, Integer value2) {
            addCriterion("ROW_VERSION between", value1, value2, "rowVersion");
            return (Criteria) this;
        }

        public Criteria andRowVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("ROW_VERSION not between", value1, value2, "rowVersion");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_system_exception_log
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_system_exception_log
     *
     * @mbggenerated
     */
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