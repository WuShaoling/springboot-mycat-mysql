package com.wsl.mycat.controller;

import com.wsl.mycat.dao.entity.*;
import com.wsl.mycat.error.ResponseMessage;
import com.wsl.mycat.service.*;
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
    private CompanyServiceImp companyService;
    @Autowired
    private GoodsServiceImpl goodsService;
    @Autowired
    private HotNewsServiceImpl hotNewsService;
    @Autowired
    private OrdersServiceImpl ordersService;
    @Autowired
    private TravelRecordServiceImpl travelRecordService;
    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping(value = "company")
    public ResponseMessage<List<Company>> queryCompanyData() {
        return new ResponseMessage.Success<>(companyService.queryData());
    }

    @GetMapping(value = "goods")
    public ResponseMessage<List<Goods>> queryGoodsData() {
        return new ResponseMessage.Success<>(goodsService.queryData());
    }

    @GetMapping(value = "goods/range")
    public ResponseMessage<List<Goods>> queryGoodsRangeData() {
        return new ResponseMessage.Success<>(goodsService.queryRangeData());
    }

    @GetMapping(value = "hotnews")
    public ResponseMessage<List<HotNews>> queryHotNewsData() {
        return new ResponseMessage.Success<>(hotNewsService.queryData());
    }

    @GetMapping(value = "orders")
    public ResponseMessage<List<Orders>> queryOrdersData() {
        return new ResponseMessage.Success<>(ordersService.queryData());
    }

    @GetMapping(value = "travelrecord")
    public ResponseMessage<List<TravelRecord>> queryTravelRecordData() {
        return new ResponseMessage.Success<>(travelRecordService.queryData());
    }

    @GetMapping(value = "travelrecord/top")
    public ResponseMessage<List<TravelRecord>> queryTravelRecordTopData() {
        return new ResponseMessage.Success<>(travelRecordService.queryTopData());
    }

    @GetMapping(value = "customer")
    public ResponseMessage<List<Customer>> queryCustomerData() {
        return new ResponseMessage.Success<>(customerService.queryData());
    }

    @GetMapping(value = "customer/female")
    public ResponseMessage<List<Customer>> queryCustomerFemaleData() {
        return new ResponseMessage.Success<>(customerService.queryFemaleData());
    }

}