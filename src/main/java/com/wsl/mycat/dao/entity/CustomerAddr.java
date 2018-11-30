package com.wsl.mycat.dao.entity;

import lombok.Data;

@Data
public class CustomerAddr {
    private Long id;

    private Long customerId;

    private String addr;
}