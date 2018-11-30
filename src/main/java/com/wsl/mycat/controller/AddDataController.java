package com.wsl.mycat.controller;

import com.wsl.mycat.error.ResponseMessage;
import com.wsl.mycat.service.*;
import com.wsl.mycat.service.interfaces.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("add")
public class AddDataController {
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
    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping(value = "company")
    public ResponseMessage<String> addCompanyData() {
        return new ResponseMessage.Success<>(companyService.addData());
    }

    @GetMapping(value = "goods")
    public ResponseMessage<String> addGoodsData() {
        return new ResponseMessage.Success<>(goodsService.addData());
    }

    @GetMapping(value = "hotnews")
    public ResponseMessage<String> addHotNewsData() {
        return new ResponseMessage.Success<>(hotNewsService.addData());
    }

    @GetMapping(value = "orders")
    public ResponseMessage<String> addOrdersData() {
        return new ResponseMessage.Success<>(ordersService.addData());
    }

    @GetMapping(value = "travelrecord")
    public ResponseMessage<String> addTravelRecordData() {
        return new ResponseMessage.Success<>(travelRecordService.addData());
    }

    @GetMapping(value = "customer")
    public ResponseMessage<String> addCustomerData() {
        return new ResponseMessage.Success<>(customerService.addData());
    }

}