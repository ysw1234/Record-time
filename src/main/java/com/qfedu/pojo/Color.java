package com.qfedu.pojo;

/**
 * Created by Winchester on 2019/6/29.
 */
public class Color {

    private Integer colorid;
    private String color;
    private Integer ccid;

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorid=" + colorid +
                ", color='" + color + '\'' +
                ", ccid=" + ccid +
                '}';
    }
}
