package com.zyj.project.dao;

import com.zyj.project.domain.Traveller;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface ITravellerDao {


    @Select("select * from traveller where  id  in(select travellerId from order_traveller where orderId=#{ordersId})")
    public List<Traveller> findByOrdersId(Integer ordersId) throws Exception;
}
