package com.wsl.mycat.service.interfaces;

import com.wsl.mycat.dao.entity.Goods;

import java.util.List;

public interface GoodsService {
    String addData();

    List<Goods> queryData();

    List<Goods> queryRangeData();

}
