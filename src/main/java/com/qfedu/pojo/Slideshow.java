package com.qfedu.pojo;

/**
 * Created by Winchester on 2019/6/29.
 */
public class Slideshow {

    private Integer sid;
    private String spath;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSpath() {
        return spath;
    }

    public void setSpath(String spath) {
        this.spath = spath;
    }

    @Override
    public String toString() {
        return "Slideshow{" +
                "sid=" + sid +
                ", spath='" + spath + '\'' +
                '}';
    }
}
