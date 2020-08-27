package com.zyj.project.dao;

import com.zyj.project.domain.Role;
import com.zyj.project.domain.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserDao {

    @Select("select * from users where username=#{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "phoneNum", column = "phoneNum"),
            @Result(property = "status", column = "status"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "com.zyj.project.dao.IRoleDao.findRoleByUserId"))
    })
    public UserInfo findByUsername(String username) throws Exception;



    @Select("select * from  users")
    List<UserInfo> findAll() throws Exception;




    @Insert("insert into users(email,username,password,phoneNum,status) values(#{email},#{username},#{password},#{phoneNum},#{status})")
    void save(UserInfo userInfo) throws Exception;



    @Select("select * from users where id=#{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "phoneNum", column = "phoneNum"),
            @Result(property = "status", column = "status"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "com.zyj.project.dao.IRoleDao.findRoleByUserId"))

    })
    UserInfo findById(Integer id) throws Exception;

    @Select("select * from role where id not in (select roleId from user_role where userId=#{userId})")
    List<Role> findOtherRoles(Integer userId);


    @Insert("insert into user_role(userId,roleId) values(#{userId},#{roleId})")
    void addRoleToUser(@Param("userId") Integer userId, @Param("roleId") Integer roleId) throws Exception;


    @Select("select * from users where username like CONCAT('%',#{username},'%')  ")
    public List<UserInfo> find(String username);


    @Select("select * from users where id=#{id}")
    UserInfo findById1(Integer id);



    @Update("update users  set   email=#{email},username=#{username},password=#{password},phoneNum=#{phoneNum},status=#{status}  where id=#{id}")
    void update(UserInfo userInfo);


//    @Update("update users  set   email=#{email},username=#{username},password=#{password},phoneNum=#{phoneNum},status=#{status}  where id=#{id}")
////    void update(Integer id);




}