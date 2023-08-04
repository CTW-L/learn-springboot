package com.example.demo.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 *
 * @author luojian
 * @create_time 2023/7/24 17:27
 */
@Configuration
@MapperScan("com.example.demo.mapper")
public class MyBatisConfig {
}
