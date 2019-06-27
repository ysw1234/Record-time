package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/27 0027.
 */
public class Pabulum {

    private Integer id;
    private String cookName;
    private String cookIntro;
    private String cookOffer;
    private Integer sid;
    private Integer typeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getCookName() {
        return cookName;
    }

    public void setCookName(String cookName) {
        this.cookName = cookName;
    }

    public String getCookIntro() {
        return cookIntro;
    }

    public void setCookIntro(String cookIntro) {
        this.cookIntro = cookIntro;
    }

    public String getCookOffer() {
        return cookOffer;
    }

    public void setCookOffer(String cookOffer) {
        this.cookOffer = cookOffer;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}