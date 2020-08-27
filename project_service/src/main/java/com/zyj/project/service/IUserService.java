package com.zyj.project.service;

import com.zyj.project.domain.Role;
import com.zyj.project.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface IUserService extends UserDetailsService {

    List<UserInfo> findAll(Integer page,Integer size) throws Exception;

    void save(UserInfo userInfo) throws Exception;

    UserInfo findById(Integer id) throws Exception;

    List<Role> findOtherRoles(Integer userId)throws Exception;

    void addRoleToUser(Integer userId, Integer[] roleIds) throws Exception;

    List<UserInfo> find(Integer page, Integer size, String username) throws Exception;

    UserInfo findById1(Integer id) throws Exception;


    void update(UserInfo userInfo) throws Exception;
}