package com.wsl.mycat.service;

import com.wsl.mycat.dao.mapper.*;
import com.wsl.mycat.service.interfaces.DeleteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DeleteServiceImpl implements DeleteService {

    @Autowired
    CompanyMapper companyMapper;
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    CustomerAddrMapper customerAddrMapper;
    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    HotNewsMapper hotNewsMapper;
    @Autowired
    OrdersMapper ordersMapper;
    @Autowired
    TravelRecordMapper recordMapper;

    @Override
    public String deleteData() {
        companyMapper.deleteAll();
        customerMapper.deleteAll();
        customerAddrMapper.deleteAll();
        goodsMapper.deleteAll();
        hotNewsMapper.deleteAll();
        ordersMapper.deleteAll();
        recordMapper.deleteAll();
        return "删除数据成功";
    }
}
