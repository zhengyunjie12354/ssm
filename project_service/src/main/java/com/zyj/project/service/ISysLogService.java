package com.zyj.project.service;

import com.zyj.project.domain.SysLog;

import java.util.List;

public interface ISysLogService {

    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll(Integer page,Integer size) throws Exception;


    void delete(Integer id);
}
