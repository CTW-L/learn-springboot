package com.example.demo.service;

import com.example.demo.model.AdminUser;

import java.util.List;

/**
 * @author JianLuo
 * @create_date 2023/7/25 16:31
 */
public interface AdminUserService {
    List<AdminUser> getAdminUserList(int page,int pageSize);
}
