package com.wsl.mycat.service.interfaces;

import com.wsl.mycat.dao.entity.Customer;

import java.util.List;

public interface CustomerService {

    String addData();

    List<Customer> queryData();

    List<Customer> queryFemaleData();

}
