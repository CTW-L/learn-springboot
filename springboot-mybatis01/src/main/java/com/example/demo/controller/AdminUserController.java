package com.example.demo.controller;

import com.example.demo.common.ResponseResult;
import com.example.demo.model.AdminUser;
import com.example.demo.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author JianLuo
 * @create_date 2023/7/26 15:22
 */
@RestController
@RequestMapping("/user")
public class AdminUserController {
    @Autowired
    AdminUserService adminUserService;

    @GetMapping("/getUserList")
    public ResponseResult<List<AdminUser>> getAdminUserList(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize) {
        return ResponseResult.success(adminUserService.getAdminUserList(page, pageSize));
    }
}
