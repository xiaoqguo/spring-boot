package com.kfit.springboothello;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Demo {
    private int id;
    private String name;

    @JSONField(format="yyyy-MM-dd HH:mm")
    private Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
