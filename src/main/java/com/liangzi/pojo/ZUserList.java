package com.liangzi.pojo;

import java.io.Serializable;
import java.util.Date;

public class ZUserList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4857415625022624717L;
	
	private Long id;
	private String num;
	private String name;
	private Byte gender;
	private Byte status;
	private String titles;
	private String officeEmail;
	private String mobilePhone;
	private String departName;
	private Date joinedDate;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Byte getGender() {
		return gender;
	}
	public void setGender(Byte gender) {
		this.gender = gender;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public String getTitles() {
		return titles;
	}
	public void setTitles(String titles) {
		this.titles = titles;
	}
	public String getOfficeEmail() {
		return officeEmail;
	}
	public void setOfficeEmail(String officeEmail) {
		this.officeEmail = officeEmail;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ZUserList [id=" + id + ", num=" + num + ", name=" + name + ", gender=" + gender + ", status=" + status
				+ ", titles=" + titles + ", officeEmail=" + officeEmail + ", mobilePhone=" + mobilePhone
				+ ", departName=" + departName + ", joinedDate=" + joinedDate + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
    
    
}
