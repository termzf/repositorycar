package com.yzp.domain;

import com.yzp.utils.TimeConvert;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品（二手车）
 */
public class Car implements Serializable{
    //车的id
    private int id;
    //根据二手车收录时间来设置二手车编号 年月日-今天录的第几辆车（unique）
    private String carNum;
    //车的颜色
    private String color;
    //车的品牌
    private String brand;
    //车系
    private String car_series;
    //车型
    private String type;
    //排放标准
    private String emission_standards;
    //燃油类型
    private String fuel_type;
    //驱动类型
    private String driving_type;
    //座位数
    private int seating;
    //行驶里程
    private int travel_distance;
    //排量
    private int displacement;
    //牌照地址
    private String license_address;
    //上门时间
    private Date door_time;
    private String door_timeStr;
    //卖家信息
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCar_series() {
        return car_series;
    }

    public void setCar_series(String car_series) {
        this.car_series = car_series;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmission_standards() {
        return emission_standards;
    }

    public void setEmission_standards(String emission_standards) {
        this.emission_standards = emission_standards;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getDriving_type() {
        return driving_type;
    }

    public void setDriving_type(String driving_type) {
        this.driving_type = driving_type;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public int getTravel_distance() {
        return travel_distance;
    }

    public void setTravel_distance(int travel_distance) {
        this.travel_distance = travel_distance;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getLicense_address() {
        return license_address;
    }

    public void setLicense_address(String license_address) {
        this.license_address = license_address;
    }

    public Date getDoor_time() {
        return door_time;
    }

    public void setDoor_time(Date door_time) {
        this.door_time = door_time;
    }

    public String getDoor_timeStr() {
        if (door_time!=null){
            door_timeStr = TimeConvert.d2s(door_time);
        }
        return door_timeStr;
    }

    public void setDoor_timeStr(String door_timeStr) {
        this.door_timeStr = door_timeStr;
    }
}
