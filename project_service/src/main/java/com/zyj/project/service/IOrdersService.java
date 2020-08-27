package com.zyj.project.service;


import com.zyj.project.domain.Orders;

import java.util.List;

public interface IOrdersService {

    List<Orders> findAll(Integer page,Integer size) throws Exception;

    Orders findById(Integer ordersId) throws Exception;
}
