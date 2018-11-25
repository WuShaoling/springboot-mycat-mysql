package com.wsl.mycat.service.interfaces;

import java.util.List;
import com.wsl.mycat.dao.entity.Company;

public interface CompanyService {

    String addData();

    List<Company> queryData();

}
