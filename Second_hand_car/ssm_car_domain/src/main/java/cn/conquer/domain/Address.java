package cn.conquer.domain;

import java.io.Serializable;

/**
 * 地区表
 */
public class Address implements Serializable {

    //地区id
    private int aid;
    //地区编号
    private int number;
    //父地区编号
    private int parent_number;
    //地区名
    private String address_name;
    //首字母拼音
    private String initial;

    public Address() {
    }

    public Address(int aid, int number, int parent_number, String address_name, String initial) {
        this.aid = aid;
        this.number = number;
        this.parent_number = parent_number;
        this.address_name = address_name;
        this.initial = initial;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", number=" + number +
                ", parent_number=" + parent_number +
                ", address_name='" + address_name + '\'' +
                ", initial='" + initial + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getParent_number() {
        return parent_number;
    }

    public void setParent_number(int parent_number) {
        this.parent_number = parent_number;
    }

    public String getAddress_name() {
        return address_name;
    }

    public void setAddress_name(String address_name) {
        this.address_name = address_name;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }
}
