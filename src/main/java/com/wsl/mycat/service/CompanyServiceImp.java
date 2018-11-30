package com.wsl.mycat.service;

import com.wsl.mycat.dao.entity.Company;
import com.wsl.mycat.dao.mapper.CompanyMapper;
import com.wsl.mycat.service.interfaces.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CompanyServiceImp implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    @Override
    public String addData() {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            Company company = new Company();
            company.setName("company" + i);
            companyMapper.insertSelective(company);
        }
        return "插入" + n + "条 company 数据成功";
    }

    @Override
    public List<Company> queryData() {
        return companyMapper.selectAll();
    }
}