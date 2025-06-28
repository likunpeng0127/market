package com.itheima.stock.controller;

import com.itheima.stock.pojo.entity.SysUser;
import com.itheima.stock.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService sysUserService;

    /**
     * 根据用户名称查询用户信息
     * @param username
     * @return
     */
    @GetMapping("/stock/v1/getUserInfo")
    public SysUser getUserInfo(@RequestParam String username) {
        return sysUserService.getSysUserInfoByUsername(username);
    }
}
