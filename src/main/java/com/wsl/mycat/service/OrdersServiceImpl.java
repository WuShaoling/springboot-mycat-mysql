package com.wsl.mycat.service;

import com.wsl.mycat.dao.entity.Orders;
import com.wsl.mycat.dao.mapper.OrdersMapper;
import com.wsl.mycat.service.interfaces.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersMapper ordersMapper;

    @Override
    public String addData() {
        for (int i = 1; i <= 20; i++) {
            Orders orders = new Orders();
            orders.setName("name" + i);
            orders.setAttributes("attribute" + i);
            ordersMapper.insertSelective(orders);
        }
        return "ok";
    }

    @Override
    public List<Orders> queryData() {
        return ordersMapper.selectAll();
    }
}
