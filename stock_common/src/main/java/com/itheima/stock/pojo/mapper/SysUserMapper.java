package com.itheima.stock.pojo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.stock.pojo.entity.SysUser;
import org.apache.ibatis.annotations.Param;

/**
* @author Administrator
* @description 针对表【sys_user(用户表)】的数据库操作Mapper
* @createDate 2025-06-28 11:15:47
* @Entity com.itheima.stock.pojo.entity.SysUser
*/
public interface SysUserMapper extends BaseMapper<SysUser> {

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser getUserInfoByUsername(@Param("username") String username);
}
