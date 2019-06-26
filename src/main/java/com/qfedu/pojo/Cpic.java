package com.qfedu.pojo;

/**
 * Created by Winchester on 2019/6/26.
 */
public class Cpic {

    private Integer pid;
    private String picpath;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }

    @Override
    public String toString() {
        return "Cpic{" +
                "pid=" + pid +
                ", picpath='" + picpath + '\'' +
                '}';
    }

}
