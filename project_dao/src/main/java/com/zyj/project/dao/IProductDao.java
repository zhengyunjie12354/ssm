package com.zyj.project.dao;

import com.zyj.project.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {
    /**
     * 根据id查询产品
     *
     * @return
     * @throws Exception
     */
    @Select("select * from product where id=#{id}")
    public Product findById(Integer id) throws Exception;


    @Select("select * from product")
    public List<Product> findAll() throws Exception;

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
}
