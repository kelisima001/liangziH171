package com.liangzi.pojo;

import java.io.Serializable;
import java.util.Date;

public class ZCustomer implements Serializable {
    private Long id;

    private String name;

    private String nickName;

    private Byte type;

    private Byte status;

    private Byte resource;

    private Long oriSalesId;

    private String oriSalesName;

    private String url;

    private String telephone;

    private String email;

    private String taxNum;

    private String idNum;

    private String idCardFront;

    private String idCardBack;

    private String address;

    private String bank;

    private String bankNum;

    private String mainBussiness;

    private String comment;

    private Byte isAssigned;

    private Byte isShare;

    private Long creatorname;

    private Date createTime;

    private Long updatorname;

    private Date updateTime;

    private Byte isValid;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
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

    public Byte getResource() {
        return resource;
    }

    public void setResource(Byte resource) {
        this.resource = resource;
    }

    public Long getOriSalesId() {
        return oriSalesId;
    }

    public void setOriSalesId(Long oriSalesId) {
        this.oriSalesId = oriSalesId;
    }

    public String getOriSalesName() {
        return oriSalesName;
    }

    public void setOriSalesName(String oriSalesName) {
        this.oriSalesName = oriSalesName == null ? null : oriSalesName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTaxNum() {
        return taxNum;
    }

    public void setTaxNum(String taxNum) {
        this.taxNum = taxNum == null ? null : taxNum.trim();
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }

    public String getIdCardFront() {
        return idCardFront;
    }

    public void setIdCardFront(String idCardFront) {
        this.idCardFront = idCardFront == null ? null : idCardFront.trim();
    }

    public String getIdCardBack() {
        return idCardBack;
    }

    public void setIdCardBack(String idCardBack) {
        this.idCardBack = idCardBack == null ? null : idCardBack.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum == null ? null : bankNum.trim();
    }

    public String getMainBussiness() {
        return mainBussiness;
    }

    public void setMainBussiness(String mainBussiness) {
        this.mainBussiness = mainBussiness == null ? null : mainBussiness.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Byte getIsAssigned() {
        return isAssigned;
    }

    public void setIsAssigned(Byte isAssigned) {
        this.isAssigned = isAssigned;
    }

    public Byte getIsShare() {
        return isShare;
    }

    public void setIsShare(Byte isShare) {
        this.isShare = isShare;
    }

    

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    

    public Long getCreatorname() {
		return creatorname;
	}

	public void setCreatorname(Long creatorname) {
		this.creatorname = creatorname;
	}

	public Long getUpdatorname() {
		return updatorname;
	}

	public void setUpdatorname(Long updatorname) {
		this.updatorname = updatorname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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