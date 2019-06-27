package com.qfedu.pojo;

import java.util.List;

/**
 * Created by Administrator on 2019/6/27 0027.
 */
public class Title {

    private Integer id;
    private String title;
    private Integer type;
    private List<TitleSort> titleSortList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<TitleSort> getTitleSortList() {
        return titleSortList;
    }

    public void setTitleSortList(List<TitleSort> titleSortList) {
        this.titleSortList = titleSortList;
    }
}