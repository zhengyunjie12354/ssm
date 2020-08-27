package com.zyj.project.dao;

import com.zyj.project.domain.SysLog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ISysLogDao {


    @Insert("insert into syslog(visitTime,username,ip,url,executionTime,method) values(#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    public void save(SysLog sysLog) throws Exception;


    @Select("select * from syslog")
    List<SysLog> findAll() throws Exception;


    @Delete("delete from syslog where id=#{id}")
    void delete(Integer id);
}
