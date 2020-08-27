package com.zyj.project.dao;

import com.zyj.project.domain.Permission;
import com.zyj.project.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IRoleDao {

    @Select("select * from role where id in (select roleId from user_role where userId=#{userId})")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "com.zyj.project.dao.IPermissionDao.findPermissionByRoleId")),


    })
    public List<Role> findRoleByUserId(Integer userId) throws Exception;


    @Select("select * from role")
    List<Role> findAll() throws Exception;

    @Insert("insert into role(roleName,roleDesc) values(#{roleName},#{roleDesc})")
    void save(Role role) throws Exception;

    @Select("select * from role where id=#{roleId}")
    Role findById(Integer roleId) throws Exception;


    @Select("select * from permission where id not in (select permissionId from role_permission where roleId=#{roleId})")
    List<Permission> findOtherPermissions(Integer roleId);

    @Insert("insert into role_permission(roleId,permissionId) values(#{roleId},#{permissionId}) ")
    void addPermissionToRole(@Param("roleId") Integer roleId,@Param("permissionId") Integer permissionId) throws Exception;
}