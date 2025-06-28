package com.itheima.stock.service;

import com.itheima.stock.pojo.entity.SysUser;

public interface UserService {
    SysUser getSysUserInfoByUsername(String username);
}
