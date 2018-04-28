package com.liangzi.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ZOrderList implements Serializable {
    private Long id;

    private String num;

    private String customername;

    private Byte type;

    private Byte status;

    private Long contactid;

    private String contactname;

    private Long productid;

    private String productname;

    private Integer productcount;

    private BigDecimal amount;

    private Date orderdate;

    private Date contractdate;

    private Long salesid;

    private String salesname;

    private String comment;

    private String creatorname;

    private Date createtime;

    private String updatorname;

    private Date updatetime;

    private Byte isvalid;

    private Byte unit;

    private String exchangerate;

    private String annualearnings;

    private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Long getContactid() {
		return contactid;
	}

	public void setContactid(Long contactid) {
		this.contactid = contactid;
	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getProductcount() {
		return productcount;
	}

	public void setProductcount(Integer productcount) {
		this.productcount = productcount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public Date getContractdate() {
		return contractdate;
	}

	public void setContractdate(Date contractdate) {
		this.contractdate = contractdate;
	}

	public Long getSalesid() {
		return salesid;
	}

	public void setSalesid(Long salesid) {
		this.salesid = salesid;
	}

	public String getSalesname() {
		return salesname;
	}

	public void setSalesname(String salesname) {
		this.salesname = salesname;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCreatorname() {
		return creatorname;
	}

	public void setCreatorname(String creatorname) {
		this.creatorname = creatorname;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getUpdatorname() {
		return updatorname;
	}

	public void setUpdatorname(String updatorname) {
		this.updatorname = updatorname;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Byte getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(Byte isvalid) {
		this.isvalid = isvalid;
	}

	public Byte getUnit() {
		return unit;
	}

	public void setUnit(Byte unit) {
		this.unit = unit;
	}

	public String getExchangerate() {
		return exchangerate;
	}

	public void setExchangerate(String exchangerate) {
		this.exchangerate = exchangerate;
	}

	

	public String getAnnualearnings() {
		return annualearnings;
	}

	public void setAnnualearnings(String annualearnings) {
		this.annualearnings = annualearnings;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}