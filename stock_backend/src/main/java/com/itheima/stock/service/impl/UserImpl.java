package com.itheima.stock.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.stock.pojo.entity.SysUser;
import com.itheima.stock.pojo.mapper.SysUserMapper;
import com.itheima.stock.service.UserService;
import com.itheima.stock.vo.req.LoginReqVo;
import com.itheima.stock.vo.resp.LoginRespVo;
import com.itheima.stock.vo.resp.R;
import com.itheima.stock.vo.resp.ResponseCode;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sun.security.util.Password;

import javax.security.auth.callback.PasswordCallback;
import java.util.Collection;


/**
 * 用户服务实现类
 */
@Service
@RequiredArgsConstructor
public class UserImpl extends ServiceImpl<SysUserMapper,SysUser> implements UserService {

    private final SysUserMapper sysUserMapper;

    private final PasswordEncoder passwordEncoder;
    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    @Override
    public SysUser getSysUserInfoByUsername(String username) {
        return sysUserMapper.getUserInfoByUsername(username);
    }

    @Override
    public R<LoginRespVo> login(LoginReqVo loginReqVo) {
        // 根据用户名查询数据
        String username = loginReqVo.getUsername();
        String password = loginReqVo.getPassword();
        if (loginReqVo !=null || StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            // 查询数据
            LoginRespVo respVo = new LoginRespVo();
            LambdaQueryWrapper<SysUser> sysUserLambdaQueryWrapper = Wrappers.lambdaQuery(SysUser.class).eq(SysUser::getUsername, username);
            SysUser sysUser = baseMapper.selectOne(sysUserLambdaQueryWrapper);
            // 没有这个用户
            if (sysUser == null)  {
                return R.error("未找到该用户");
            }
            // 密码校验
            if (passwordEncoder.matches(password, sysUser.getPassword())) {
                respVo.setId(sysUser.getId());
                respVo.setUsername(sysUser.getUsername());
                respVo.setPhone(sysUser.getPhone());
                respVo.setNickName(sysUser.getNickName());
                return R.ok(respVo);
            }else {
                return R.error("账号或密码错误");
            }
        }else {
            // 参数错误
            return R.error(ResponseCode.DATA_ERROR.getMessage());
        }


    }


}
