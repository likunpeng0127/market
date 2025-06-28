package com.itheima.stock.service.impl;

import com.itheima.stock.pojo.entity.SysUser;
import com.itheima.stock.pojo.mapper.SysUserMapper;
import com.itheima.stock.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * 用户服务实现类
 */
@Service
@RequiredArgsConstructor
public class UserImpl implements UserService {

    private final SysUserMapper sysUserMapper;

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    @Override
    public SysUser getSysUserInfoByUsername(String username) {
        return sysUserMapper.getUserInfoByUsername(username);
    }
}
