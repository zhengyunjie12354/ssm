package com.zyj.project.service;

import com.zyj.project.domain.Product;

import java.util.List;

public interface IProductService {

    /**
     * 查询所有产品信息
     * @return
     * @throws Exception
     */
    public List<Product> finAll(Integer page,Integer size) throws Exception;

    void save(Product product) throws Exception;
}
