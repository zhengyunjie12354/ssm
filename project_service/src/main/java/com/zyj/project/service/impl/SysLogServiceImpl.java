package com.zyj.project.service.impl;

import com.github.pagehelper.PageHelper;
import com.zyj.project.dao.ISysLogDao;
import com.zyj.project.domain.SysLog;
import com.zyj.project.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private ISysLogDao sysLogDao;

    @Override
    public void save(SysLog sysLog) throws Exception {
        sysLogDao.save(sysLog);

    }

    @Override
    public List<SysLog> findAll(Integer page,Integer size) throws Exception {
        PageHelper.startPage(page, size);
        return sysLogDao.findAll();
    }

    @Override
    public void delete(Integer id) {
        sysLogDao.delete(id);
    }


}
