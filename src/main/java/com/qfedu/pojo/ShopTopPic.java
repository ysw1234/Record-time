package com.qfedu.pojo;

/**
 * Created by Winchester on 2019/6/26.
 */
public class ShopTopPic {

    private Integer toppid;
    private String toppicpath;

    public Integer getToppid() {
        return toppid;
    }

    public void setToppid(Integer toppid) {
        this.toppid = toppid;
    }

    public String getToppicpath() {
        return toppicpath;
    }

    public void setToppicpath(String toppicpath) {
        this.toppicpath = toppicpath;
    }

    @Override
    public String toString() {
        return "ShopTopPic{" +
                "toppid=" + toppid +
                ", toppicpath='" + toppicpath + '\'' +
                '}';
    }
}
