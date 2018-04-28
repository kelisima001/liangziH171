package com.liangzi.pojo;

import java.io.Serializable;

public class ZDepartManager  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer departid;

    private String departname;

    private String username;	//部门经理

    private String connecttelno;

    private String connectmobiletelno;

    private String faxes;

    private Integer branchid;

	public Integer getDepartid() {
		return departid;
	}

	public void setDepartid(Integer departid) {
		this.departid = departid;
	}

	public String getDepartname() {
		return departname;
	}

	public void setDepartname(String departname) {
		this.departname = departname;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getConnecttelno() {
		return connecttelno;
	}

	public void setConnecttelno(String connecttelno) {
		this.connecttelno = connecttelno;
	}

	public String getConnectmobiletelno() {
		return connectmobiletelno;
	}

	public void setConnectmobiletelno(String connectmobiletelno) {
		this.connectmobiletelno = connectmobiletelno;
	}

	public String getFaxes() {
		return faxes;
	}

	public void setFaxes(String faxes) {
		this.faxes = faxes;
	}

	public Integer getBranchid() {
		return branchid;
	}

	public void setBranchid(Integer branchid) {
		this.branchid = branchid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DepartManager [departid=" + departid + ", departname=" + departname + ", username=" + username
				+ ", connecttelno=" + connecttelno + ", connectmobiletelno=" + connectmobiletelno + ", faxes=" + faxes
				+ ", branchid=" + branchid + "]";
	}
    
}
