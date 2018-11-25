package com.wsl.mycat.service.interfaces;

import com.wsl.mycat.dao.entity.Orders;

import java.util.List;

public interface OrdersService {
    String addData();

    List<Orders> queryData();
}
