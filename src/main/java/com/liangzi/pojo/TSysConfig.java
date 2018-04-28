package com.liangzi.pojo;

import java.io.Serializable;
import java.util.Date;

public class TSysConfig implements Serializable {
    private Long cfgId;

    private Long cfgCate;

    private String cfgCode;

    private String cfgName;

    private String cfgValue;

    private Date createTime;

    private Date updateTime;

    private Byte isValid;

    private static final long serialVersionUID = 1L;

    public Long getCfgId() {
        return cfgId;
    }

    public void setCfgId(Long cfgId) {
        this.cfgId = cfgId;
    }

    public Long getCfgCate() {
        return cfgCate;
    }

    public void setCfgCate(Long cfgCate) {
        this.cfgCate = cfgCate;
    }

    public String getCfgCode() {
        return cfgCode;
    }

    public void setCfgCode(String cfgCode) {
        this.cfgCode = cfgCode == null ? null : cfgCode.trim();
    }

    public String getCfgName() {
        return cfgName;
    }

    public void setCfgName(String cfgName) {
        this.cfgName = cfgName == null ? null : cfgName.trim();
    }

    public String getCfgValue() {
        return cfgValue;
    }

    public void setCfgValue(String cfgValue) {
        this.cfgValue = cfgValue == null ? null : cfgValue.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }
}