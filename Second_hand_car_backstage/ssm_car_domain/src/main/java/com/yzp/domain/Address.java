package com.yzp.domain;

import java.io.Serializable;

/**
 * 地区表
 */
public class Address implements Serializable {

    //地区id
    private int id;
    //地区名
    private String name;
    //父地区id
    private int parent_id;
    //地区级别，省市区/1,2,3
    private int level;

    public Address() {
    }

    public Address(int id, String name, int parent_id, int level) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parent_id=" + parent_id +
                ", level=" + level +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
