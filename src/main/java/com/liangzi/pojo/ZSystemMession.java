package com.liangzi.pojo;

import java.io.Serializable;
import java.util.Date;

public class ZSystemMession implements Serializable {
    private Integer id;

    private String missionname;

    private String createname;

    private String executorname;

    private String content;

    private Date begintime;

    private Date endtime;

    private String cooperationer;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMissionname() {
        return missionname;
    }

    public void setMissionname(String missionname) {
        this.missionname = missionname == null ? null : missionname.trim();
    }

    

    

	public String getCreatename() {
		return createname;
	}

	public void setCreatename(String createname) {
		this.createname = createname;
	}

	public String getExecutorname() {
		return executorname;
	}

	public void setExecutorname(String executorname) {
		this.executorname = executorname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getCooperationer() {
        return cooperationer;
    }

    public void setCooperationer(String cooperationer) {
        this.cooperationer = cooperationer == null ? null : cooperationer.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}