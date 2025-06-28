package com.itheima.stock.pojo.mapper;

import com.itheima.stock.pojo.entity.SysRolePermission;

/**
* @author Administrator
* @description 针对表【sys_role_permission(角色权限表)】的数据库操作Mapper
* @createDate 2025-06-28 11:15:47
* @Entity com.itheima.stock.pojo.entity.SysRolePermission
*/
public interface SysRolePermissionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);

}
