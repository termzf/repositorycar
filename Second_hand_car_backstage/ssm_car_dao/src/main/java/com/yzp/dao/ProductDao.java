package com.yzp.dao;

import com.yzp.domain.Car;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 产品（二手车）模板 用xml文件写sql 请勿添加注解
 */
@Repository
public interface ProductDao {
    /**
     * 展示所有二手车信息
     * @return
     */
//    @Select("select * from car")
    public List<Car> findAll();

    /**
     * 该车详细信息
     * @param cid
     * @return
     */
    public Car findOne(String cid);

    /**
     * 修改对应id的车的几个基本信息
     * @param cid
     */
    public void updateCar(Car cid);


    void insertCar(Car car);

}
