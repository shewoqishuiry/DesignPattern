package com.example.prototypemodel;

import lombok.Data;

import java.util.Date;

@Data
public class Video implements Cloneable {
    private String name;
    private Date createTime;

    public Video() {
    }

    public Video(String name,Date date) {
        this.name = name;
        this.createTime = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        //实现深克隆
        Video v = (Video) object;
        v.createTime = (Date) this.createTime.clone();
        return object;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
