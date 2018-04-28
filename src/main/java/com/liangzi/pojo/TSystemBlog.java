package com.liangzi.pojo;

import java.io.Serializable;
import java.util.Date;

public class TSystemBlog implements Serializable {
    private Integer id;

    private Integer createid;

    private Date createtime;

    private Byte canpublic;

    private Integer fabulous;

    private String avater;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getCanpublic() {
        return canpublic;
    }

    public void setCanpublic(Byte canpublic) {
        this.canpublic = canpublic;
    }

    public Integer getFabulous() {
        return fabulous;
    }

    public void setFabulous(Integer fabulous) {
        this.fabulous = fabulous;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater == null ? null : avater.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}