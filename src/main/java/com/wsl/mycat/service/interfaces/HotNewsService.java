package com.wsl.mycat.service.interfaces;

import com.wsl.mycat.dao.entity.HotNews;

import java.util.List;

public interface HotNewsService {
    String addData();

    List<HotNews> queryData();
}
