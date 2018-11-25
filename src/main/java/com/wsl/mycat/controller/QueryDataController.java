package com.wsl.mycat.controller;

import com.wsl.mycat.dao.entity.*;
import com.wsl.mycat.error.ResponseMessage;
import com.wsl.mycat.service.GoodsServiceImpl;
import com.wsl.mycat.service.HotNewsServiceImpl;
import com.wsl.mycat.service.OrdersServiceImpl;
import com.wsl.mycat.service.TravelRecordServiceImpl;
import com.wsl.mycat.service.interfaces.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("query")
public class QueryDataController {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private GoodsServiceImpl goodsService;
    @Autowired
    private HotNewsServiceImpl hotNewsService;
    @Autowired
    private OrdersServiceImpl ordersService;
    @Autowired
    private TravelRecordServiceImpl travelRecordService;

    @GetMapping(value = "company")
    public ResponseMessage<List<Company>> addCompanyData() {
        return new ResponseMessage.Success<>(companyService.queryData());
    }

    @GetMapping(value = "goods")
    public ResponseMessage<List<Goods>> addGoodsData() {
        return new ResponseMessage.Success<>(goodsService.queryData());
    }

    @GetMapping(value = "hotnews")
    public ResponseMessage<List<HotNews>> addHotNewsData() {
        return new ResponseMessage.Success<>(hotNewsService.queryData());
    }

    @GetMapping(value = "orders")
    public ResponseMessage<List<Orders>> addOrdersData() {
        return new ResponseMessage.Success<>(ordersService.queryData());
    }

    @GetMapping(value = "travelrecord")
    public ResponseMessage<List<TravelRecord>> addTravelRecordData() {
        return new ResponseMessage.Success<>(travelRecordService.queryData());
    }

}