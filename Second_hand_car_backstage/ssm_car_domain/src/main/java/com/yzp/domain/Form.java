package com.yzp.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 成交订单类
 */
public class Form implements Serializable {

    //订单id
    private int id;
    //订单图片
    private String picture;
    //车的描述
    private String description;
    //成交日期
    private Date transaction_time;
    //行驶公里
    private int travel_distance;
    //速度
    private int speed;
    //成交价格
    private int transaction_price;

    public Form() {
    }

    public Form(int id, String picture, String description,
                Date transaction_time, int travel_distance,
                int speed, int transaction_price) {
        this.id = id;
        this.picture = picture;
        this.description = description;
        this.transaction_time = transaction_time;
        this.travel_distance = travel_distance;
        this.speed = speed;
        this.transaction_price = transaction_price;

    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", picture='" + picture + '\'' +
                ", description='" + description + '\'' +
                ", transaction_time=" + transaction_time +
                ", travel_distance=" + travel_distance +
                ", speed=" + speed +
                ", transaction_price=" + transaction_price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTransaction_time() {
        return transaction_time;
    }

    public void setTransaction_time(Date transaction_time) {
        this.transaction_time = transaction_time;
    }

    public int getTravel_distance() {
        return travel_distance;
    }

    public void setTravel_distance(int travel_distance) {
        this.travel_distance = travel_distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTransaction_price() {
        return transaction_price;
    }

    public void setTransaction_price(int transaction_price) {
        this.transaction_price = transaction_price;
    }
}
