package com.yzp.service;

import com.yzp.domain.Car;

import java.util.List;

/**
 * 二手车
 */
public interface ProductService {
    /**
     * 展示所有的二手车信息
     * @return
     */
    public List<Car> findAll(int page,int size);

    /**
     * 通过ID查找该车详细信息 包括卖家信息
     * @param cid
     * @return
     */
    Car findOne(String cid);

    /**
     * 修改几个信息咯
     * @param cid
     */
    void updateOne(Car cid);

    /**
     * 添加基本信息
     * @param car
     */
    void insertOne(Car car);
}
