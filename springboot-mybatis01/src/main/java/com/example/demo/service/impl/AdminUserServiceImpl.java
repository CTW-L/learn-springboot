package com.example.demo.service.impl;

import com.example.demo.mapper.AdminUserMapper;
import com.example.demo.model.AdminUser;
import com.example.demo.model.AdminUserExample;
import com.example.demo.service.AdminUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luojian
 * @create_time 2023/7/25 15:54
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    AdminUserMapper adminUserMapper;

    @Override
    public List<AdminUser> getAdminUserList(int page,int pageSize) {
        PageHelper.startPage(page,pageSize);
        AdminUserExample adminUserExample = new AdminUserExample();
        List<AdminUser> list = adminUserMapper.selectByExample(adminUserExample);
        return list;
    }
}
