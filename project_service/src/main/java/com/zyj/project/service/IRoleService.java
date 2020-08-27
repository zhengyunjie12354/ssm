package com.zyj.project.service;

import com.zyj.project.domain.Permission;
import com.zyj.project.domain.Role;

import java.util.List;

public interface IRoleService {

    public List<Role> findAll(Integer page,Integer size) throws Exception;

    void save(Role role) throws Exception;

    Role findById(Integer roleId) throws Exception;

    List<Permission> findOtherPermissions(Integer roleId) throws Exception;

    void addPermissionToRole(Integer roleId, Integer[] permissionIds) throws Exception;
}
