package cn.conquer.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 车的类
 */
public class Car implements Serializable {

    //车的id
    private int id;
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

    public String getDoor_time_str() {
        if(door_time!=null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            door_time_str = simpleDateFormat.format(door_time);
        }
        return door_time_str;
    }

    public void setDoor_time_str(String door_time_str) {
        this.door_time_str = door_time_str;
    }

    //上门时间str
    private String door_time_str;
    //外键，与用户表外联
    private int uid;

    public Car() {
    }

    public Car(int id, String color, String brand,
               String car_series, String type,
               String emission_standards, String fuel_type,
               String driving_type, int seating,
               int travel_distance, int displacement,
               String license_address, Date door_time, int uid) {
        this.id = id;
        this.color = color;
        this.brand = brand;
        this.car_series = car_series;
        this.type = type;
        this.emission_standards = emission_standards;
        this.fuel_type = fuel_type;
        this.driving_type = driving_type;
        this.seating = seating;
        this.travel_distance = travel_distance;
        this.displacement = displacement;
        this.license_address = license_address;
        this.door_time = door_time;
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", car_series='" + car_series + '\'' +
                ", type='" + type + '\'' +
                ", emission_standards='" + emission_standards + '\'' +
                ", fuel_type='" + fuel_type + '\'' +
                ", driving_type='" + driving_type + '\'' +
                ", seating=" + seating +
                ", travel_distance=" + travel_distance +
                ", displacement=" + displacement +
                ", license_address='" + license_address + '\'' +
                ", door_time=" + door_time +
                ", uid=" + uid +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
