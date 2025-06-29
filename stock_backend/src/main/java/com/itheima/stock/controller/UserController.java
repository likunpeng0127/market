package com.itheima.stock.controller;

import com.itheima.stock.pojo.entity.SysUser;
import com.itheima.stock.service.UserService;
import com.itheima.stock.vo.req.LoginReqVo;
import com.itheima.stock.vo.resp.LoginRespVo;
import com.itheima.stock.vo.resp.R;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/stock/v1/login")
    public R<LoginRespVo> login(@RequestBody LoginReqVo loginReqVo) {
        return sysUserService.login(loginReqVo);
    }
}
