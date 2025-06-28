package com.itheima.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 自动扫描 包下的mapper文件并注册成spring bean
@MapperScan("com.itheima.stock.pojo.mapper")
public class BackendApp {
    public static void main(String[] args) {
        SpringApplication.run(BackendApp.class,args);
    }
}