package cn.conquer.domain;

import java.io.Serializable;

/**
 * 车标图片类
 */
public class Logos implements Serializable {

    //id
    private int id;
    //车品牌
    private String brand;
    //车标图片地址
    private String img;

    public Logos() {
    }

    public Logos(int id, String brand, String img) {
        this.id = id;
        this.brand = brand;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Logos{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", img='" + img + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
