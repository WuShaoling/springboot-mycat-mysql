package com.wsl.mycat.dao.entity;

import lombok.Data;

@Data
public class Customer {
    private Long id;

    private String name;

    private Integer gender;

    private String addr;
}