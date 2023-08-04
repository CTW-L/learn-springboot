package com.example.demo.controller;/**
 * @author v_jianoluo
 * @create_date 2023/7/24 14:35
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luojian
 * @create_time 2023/7/24 14:35
 */
@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
