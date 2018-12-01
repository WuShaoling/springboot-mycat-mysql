package com.wsl.mycat.dao.mapper;

import com.wsl.mycat.dao.entity.CustomerAddr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerAddrMapper {

    int deleteAll();

    int deleteByPrimaryKey(Long id);

    int insert(CustomerAddr record);

    int insertSelective(CustomerAddr record);

    CustomerAddr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerAddr record);

    int updateByPrimaryKey(CustomerAddr record);
}