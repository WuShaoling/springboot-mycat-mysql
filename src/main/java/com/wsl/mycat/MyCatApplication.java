package com.wsl.mycat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.wsl.mycat.dao.mapper")
@EnableTransactionManagement
public class MyCatApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCatApplication.class, args);
    }
}
