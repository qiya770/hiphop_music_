package com.xuhuaze.music;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 热加载
* 1、Ctrl+Shift+A 搜索registry,找到Registry...,注意是带三个点的那个,然后找到compiler.automake.allow.when.app.running勾选
* 2、Ctrl+F9
* */
@SpringBootApplication
@MapperScan("com.xuhuaze.music.dao")
public class MusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

}
