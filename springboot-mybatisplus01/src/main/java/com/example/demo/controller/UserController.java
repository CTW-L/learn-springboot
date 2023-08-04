package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.ResponseResult;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JianLuo
 * @create_date 2023/8/3 10:10
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUserList")
    public ResponseResult<Map> getAdminUserList(@RequestParam(defaultValue = "1") Integer curPage, @RequestParam(defaultValue = "10") Integer perPage) {

        Page<User> page = new Page<>(curPage, perPage);
        page = userService.page(page);
        Map<String, Object> map = new HashMap<>();
        map.put("list", page.getRecords());
        map.put("total_count", page.getTotal());
//        Assert.
        return ResponseResult.success(map);
    }
}
