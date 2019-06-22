package com.qfedu.pojo;

/**
 * Created by Winchester on 2019/6/22.
 */
public class Ariticle {

    private Integer aid;
    private String article;
    private Integer uid;


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }


    @Override
    public String toString() {
        return "Ariticle{" +
                "aid=" + aid +
                ", article='" + article + '\'' +
                ", uid=" + uid +
                '}';
    }
}
