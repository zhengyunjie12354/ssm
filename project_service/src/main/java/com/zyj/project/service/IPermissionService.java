package com.zyj.project.service;

import com.zyj.project.domain.Permission;

import java.util.List;

public interface IPermissionService {

    public List<Permission> findAll(Integer page,Integer size) throws Exception;

    void save(Permission permission) throws Exception;
}
