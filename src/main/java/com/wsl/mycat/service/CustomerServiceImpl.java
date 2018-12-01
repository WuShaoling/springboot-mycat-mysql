package com.wsl.mycat.service;

import com.wsl.mycat.dao.entity.Customer;
import com.wsl.mycat.dao.entity.CustomerAddr;
import com.wsl.mycat.dao.mapper.CustomerAddrMapper;
import com.wsl.mycat.dao.mapper.CustomerMapper;
import com.wsl.mycat.service.interfaces.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    CustomerAddrMapper customerAddrMapper;

    @Override
    public String addData() {
        long id = System.currentTimeMillis();
        int n = 20;
        for (int i = 1; i <= n; i++) {
            id += 1;
            int gender = 100000;
            if (i % 2 == 0) {
                gender = 100001;
            }
            Customer customer = new Customer();
            customer.setId(id);
            customer.setName("customer" + id);
            customer.setGender(gender);
            customerMapper.insertSelective(customer);

            CustomerAddr customerAddr = new CustomerAddr();
            customerAddr.setId(id);
            customerAddr.setCustomerId(id);
            customerAddr.setAddr("addr" + id);
            customerAddrMapper.insertSelective(customerAddr);
        }
        return "插入" + n + "条 Customer, Customer_Addr 数据成功";
    }

    @Override
    public List<Customer> queryData() {
        return customerMapper.selectAll();
    }

    @Override
    public List<Customer> queryFemaleData() {
        return customerMapper.selectAllFemale();
    }

}
