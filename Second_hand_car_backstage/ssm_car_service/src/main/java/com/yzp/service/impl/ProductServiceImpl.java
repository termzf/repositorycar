package com.yzp.service.impl;

import com.github.pagehelper.PageHelper;
import com.yzp.dao.ProductDao;
import com.yzp.domain.Car;
import com.yzp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 二手车(产品)实现类
 */

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    /**
     * 实现分页,展示所有的二手车
     * @return
     */
    public List<Car> findAll(int page,int size) {
        PageHelper.startPage(page,size);
        return productDao.findAll();
    }

    /**
     * 单车信息
     * @param cid
     * @return
     */
    public Car findOne(String cid) {
        return productDao.findOne(cid);
    }

    /**
     * 修改单车几个小信息
     * @param car
     */
    public void updateOne(Car car) {
        productDao.updateCar(car);
    }

    /**
     * 添加详细信息
     * @param car
     */
    public void insertOne(Car car) {
        productDao.insertCar(car);
    }
}
