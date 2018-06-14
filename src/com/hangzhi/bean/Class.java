package com.hangzhi.bean;

import java.util.Date;

public class Class {
    private Integer id;

    private Integer schoolId;

    private Short grade;

    private String name;

    private String webBrowserPassBeginTime;

    private String webBrowserPassEndTime;

    private Byte ifCanDownloadFile;

    private Byte isAllowedToUpgradeCcsClient;

    private Byte level;

    private Date createTime;

    private Byte isUseNettime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Short getGrade() {
        return grade;
    }

    public void setGrade(Short grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getWebBrowserPassBeginTime() {
        return webBrowserPassBeginTime;
    }

    public void setWebBrowserPassBeginTime(String webBrowserPassBeginTime) {
        this.webBrowserPassBeginTime = webBrowserPassBeginTime == null ? null : webBrowserPassBeginTime.trim();
    }

    public String getWebBrowserPassEndTime() {
        return webBrowserPassEndTime;
    }

    public void setWebBrowserPassEndTime(String webBrowserPassEndTime) {
        this.webBrowserPassEndTime = webBrowserPassEndTime == null ? null : webBrowserPassEndTime.trim();
    }

    public Byte getIfCanDownloadFile() {
        return ifCanDownloadFile;
    }

    public void setIfCanDownloadFile(Byte ifCanDownloadFile) {
        this.ifCanDownloadFile = ifCanDownloadFile;
    }

    public Byte getIsAllowedToUpgradeCcsClient() {
        return isAllowedToUpgradeCcsClient;
    }

    public void setIsAllowedToUpgradeCcsClient(Byte isAllowedToUpgradeCcsClient) {
        this.isAllowedToUpgradeCcsClient = isAllowedToUpgradeCcsClient;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getIsUseNettime() {
        return isUseNettime;
    }

    public void setIsUseNettime(Byte isUseNettime) {
        this.isUseNettime = isUseNettime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}