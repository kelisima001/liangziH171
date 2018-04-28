package com.liangzi.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TCustomerContract implements Serializable {
    private Long id;

    private Long customerId;

    private Long orderId;

    private String contractNum;

    private Byte type;

    private Date startTime;

    private Date endTime;

    private BigDecimal collectedAmount;

    private BigDecimal amount;

    private BigDecimal expectedRevenue;

    private Byte isInvoice;

    private Byte isTax;

    private Byte isRenewal;

    private Long contractId;

    private String comment;

    private Long salesId;

    private String salesName;

    private Byte status;

    private Long auditorId;

    private Date auditTime;

    private String auditorName;

    private Long creatorId;

    private Date createTime;

    private Long updatorId;

    private Date updateTime;

    private Byte isValid;

    private Byte amountUnit;

    private String exchangeRate;

    private String annualEarnings;

    private Byte collectedUnit;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum == null ? null : contractNum.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getCollectedAmount() {
        return collectedAmount;
    }

    public void setCollectedAmount(BigDecimal collectedAmount) {
        this.collectedAmount = collectedAmount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getExpectedRevenue() {
        return expectedRevenue;
    }

    public void setExpectedRevenue(BigDecimal expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }

    public Byte getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Byte isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Byte getIsTax() {
        return isTax;
    }

    public void setIsTax(Byte isTax) {
        this.isTax = isTax;
    }

    public Byte getIsRenewal() {
        return isRenewal;
    }

    public void setIsRenewal(Byte isRenewal) {
        this.isRenewal = isRenewal;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Long getSalesId() {
        return salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName == null ? null : salesName.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName == null ? null : auditorName.trim();
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdatorId() {
        return updatorId;
    }

    public void setUpdatorId(Long updatorId) {
        this.updatorId = updatorId;
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

    public Byte getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(Byte amountUnit) {
        this.amountUnit = amountUnit;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate == null ? null : exchangeRate.trim();
    }

    public String getAnnualEarnings() {
        return annualEarnings;
    }

    public void setAnnualEarnings(String annualEarnings) {
        this.annualEarnings = annualEarnings == null ? null : annualEarnings.trim();
    }

    public Byte getCollectedUnit() {
        return collectedUnit;
    }

    public void setCollectedUnit(Byte collectedUnit) {
        this.collectedUnit = collectedUnit;
    }
}