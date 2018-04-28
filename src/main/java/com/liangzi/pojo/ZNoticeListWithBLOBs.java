package com.liangzi.pojo;


public class ZNoticeListWithBLOBs extends ZNoticeList{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String content;

    private String remark;

    private String checkremark;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCheckremark() {
        return checkremark;
    }

    public void setCheckremark(String checkremark) {
        this.checkremark = checkremark == null ? null : checkremark.trim();
    }

	
    
}