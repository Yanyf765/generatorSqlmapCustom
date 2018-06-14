package com.hangzhi.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Short value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Short value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Short value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Short value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Short value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Short value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Short> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Short> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Short value1, Short value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Short value1, Short value2) {
            addCriterion("grade not between", value1, value2, "grade");
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

        public Criteria andWebBrowserPassBeginTimeIsNull() {
            addCriterion("web_browser_pass_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeIsNotNull() {
            addCriterion("web_browser_pass_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeEqualTo(String value) {
            addCriterion("web_browser_pass_begin_time =", value, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeNotEqualTo(String value) {
            addCriterion("web_browser_pass_begin_time <>", value, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeGreaterThan(String value) {
            addCriterion("web_browser_pass_begin_time >", value, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("web_browser_pass_begin_time >=", value, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeLessThan(String value) {
            addCriterion("web_browser_pass_begin_time <", value, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeLessThanOrEqualTo(String value) {
            addCriterion("web_browser_pass_begin_time <=", value, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeLike(String value) {
            addCriterion("web_browser_pass_begin_time like", value, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeNotLike(String value) {
            addCriterion("web_browser_pass_begin_time not like", value, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeIn(List<String> values) {
            addCriterion("web_browser_pass_begin_time in", values, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeNotIn(List<String> values) {
            addCriterion("web_browser_pass_begin_time not in", values, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeBetween(String value1, String value2) {
            addCriterion("web_browser_pass_begin_time between", value1, value2, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassBeginTimeNotBetween(String value1, String value2) {
            addCriterion("web_browser_pass_begin_time not between", value1, value2, "webBrowserPassBeginTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeIsNull() {
            addCriterion("web_browser_pass_end_time is null");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeIsNotNull() {
            addCriterion("web_browser_pass_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeEqualTo(String value) {
            addCriterion("web_browser_pass_end_time =", value, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeNotEqualTo(String value) {
            addCriterion("web_browser_pass_end_time <>", value, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeGreaterThan(String value) {
            addCriterion("web_browser_pass_end_time >", value, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("web_browser_pass_end_time >=", value, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeLessThan(String value) {
            addCriterion("web_browser_pass_end_time <", value, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeLessThanOrEqualTo(String value) {
            addCriterion("web_browser_pass_end_time <=", value, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeLike(String value) {
            addCriterion("web_browser_pass_end_time like", value, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeNotLike(String value) {
            addCriterion("web_browser_pass_end_time not like", value, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeIn(List<String> values) {
            addCriterion("web_browser_pass_end_time in", values, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeNotIn(List<String> values) {
            addCriterion("web_browser_pass_end_time not in", values, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeBetween(String value1, String value2) {
            addCriterion("web_browser_pass_end_time between", value1, value2, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andWebBrowserPassEndTimeNotBetween(String value1, String value2) {
            addCriterion("web_browser_pass_end_time not between", value1, value2, "webBrowserPassEndTime");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileIsNull() {
            addCriterion("if_can_download_file is null");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileIsNotNull() {
            addCriterion("if_can_download_file is not null");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileEqualTo(Byte value) {
            addCriterion("if_can_download_file =", value, "ifCanDownloadFile");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileNotEqualTo(Byte value) {
            addCriterion("if_can_download_file <>", value, "ifCanDownloadFile");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileGreaterThan(Byte value) {
            addCriterion("if_can_download_file >", value, "ifCanDownloadFile");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileGreaterThanOrEqualTo(Byte value) {
            addCriterion("if_can_download_file >=", value, "ifCanDownloadFile");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileLessThan(Byte value) {
            addCriterion("if_can_download_file <", value, "ifCanDownloadFile");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileLessThanOrEqualTo(Byte value) {
            addCriterion("if_can_download_file <=", value, "ifCanDownloadFile");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileIn(List<Byte> values) {
            addCriterion("if_can_download_file in", values, "ifCanDownloadFile");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileNotIn(List<Byte> values) {
            addCriterion("if_can_download_file not in", values, "ifCanDownloadFile");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileBetween(Byte value1, Byte value2) {
            addCriterion("if_can_download_file between", value1, value2, "ifCanDownloadFile");
            return (Criteria) this;
        }

        public Criteria andIfCanDownloadFileNotBetween(Byte value1, Byte value2) {
            addCriterion("if_can_download_file not between", value1, value2, "ifCanDownloadFile");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientIsNull() {
            addCriterion("is_allowed_to_upgrade_ccs_client is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientIsNotNull() {
            addCriterion("is_allowed_to_upgrade_ccs_client is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientEqualTo(Byte value) {
            addCriterion("is_allowed_to_upgrade_ccs_client =", value, "isAllowedToUpgradeCcsClient");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientNotEqualTo(Byte value) {
            addCriterion("is_allowed_to_upgrade_ccs_client <>", value, "isAllowedToUpgradeCcsClient");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientGreaterThan(Byte value) {
            addCriterion("is_allowed_to_upgrade_ccs_client >", value, "isAllowedToUpgradeCcsClient");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_allowed_to_upgrade_ccs_client >=", value, "isAllowedToUpgradeCcsClient");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientLessThan(Byte value) {
            addCriterion("is_allowed_to_upgrade_ccs_client <", value, "isAllowedToUpgradeCcsClient");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientLessThanOrEqualTo(Byte value) {
            addCriterion("is_allowed_to_upgrade_ccs_client <=", value, "isAllowedToUpgradeCcsClient");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientIn(List<Byte> values) {
            addCriterion("is_allowed_to_upgrade_ccs_client in", values, "isAllowedToUpgradeCcsClient");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientNotIn(List<Byte> values) {
            addCriterion("is_allowed_to_upgrade_ccs_client not in", values, "isAllowedToUpgradeCcsClient");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientBetween(Byte value1, Byte value2) {
            addCriterion("is_allowed_to_upgrade_ccs_client between", value1, value2, "isAllowedToUpgradeCcsClient");
            return (Criteria) this;
        }

        public Criteria andIsAllowedToUpgradeCcsClientNotBetween(Byte value1, Byte value2) {
            addCriterion("is_allowed_to_upgrade_ccs_client not between", value1, value2, "isAllowedToUpgradeCcsClient");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Byte value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Byte value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Byte value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Byte value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Byte value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Byte> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Byte> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Byte value1, Byte value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andIsUseNettimeIsNull() {
            addCriterion("is_use_nettime is null");
            return (Criteria) this;
        }

        public Criteria andIsUseNettimeIsNotNull() {
            addCriterion("is_use_nettime is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseNettimeEqualTo(Byte value) {
            addCriterion("is_use_nettime =", value, "isUseNettime");
            return (Criteria) this;
        }

        public Criteria andIsUseNettimeNotEqualTo(Byte value) {
            addCriterion("is_use_nettime <>", value, "isUseNettime");
            return (Criteria) this;
        }

        public Criteria andIsUseNettimeGreaterThan(Byte value) {
            addCriterion("is_use_nettime >", value, "isUseNettime");
            return (Criteria) this;
        }

        public Criteria andIsUseNettimeGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_use_nettime >=", value, "isUseNettime");
            return (Criteria) this;
        }

        public Criteria andIsUseNettimeLessThan(Byte value) {
            addCriterion("is_use_nettime <", value, "isUseNettime");
            return (Criteria) this;
        }

        public Criteria andIsUseNettimeLessThanOrEqualTo(Byte value) {
            addCriterion("is_use_nettime <=", value, "isUseNettime");
            return (Criteria) this;
        }

        public Criteria andIsUseNettimeIn(List<Byte> values) {
            addCriterion("is_use_nettime in", values, "isUseNettime");
            return (Criteria) this;
        }

        public Criteria andIsUseNettimeNotIn(List<Byte> values) {
            addCriterion("is_use_nettime not in", values, "isUseNettime");
            return (Criteria) this;
        }

        public Criteria andIsUseNettimeBetween(Byte value1, Byte value2) {
            addCriterion("is_use_nettime between", value1, value2, "isUseNettime");
            return (Criteria) this;
        }

        public Criteria andIsUseNettimeNotBetween(Byte value1, Byte value2) {
            addCriterion("is_use_nettime not between", value1, value2, "isUseNettime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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