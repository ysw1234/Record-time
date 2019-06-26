package com.qfedu.service;

import com.qfedu.pojo.Pic;

import java.util.List;


public interface PicService {
    List<Pic> findPicShow();

    List<Pic> findCookShow();

    List<Pic> findEatPic();
}
