package com.qianfeng.smarthome.vo;

import java.util.Date;

public class VComment {
    private int id;
    private Integer uid;
    private String comment;
    private Integer score;
    private Date commenttime;
    private Integer gid;
    private String uname;
    private String SC;

    public String getSC() {
        return SC;
    }

    public void setSC(String SC) {
        this.SC = SC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
