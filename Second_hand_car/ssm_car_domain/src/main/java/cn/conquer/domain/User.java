package cn.conquer.domain;

import java.io.Serializable;

/**
 * 用户类
 */
public class User implements Serializable {

    //用户id
    private int uid;
    //用户名
    private String username;
    //用户密码
    private String password;
    //真实姓名
    private String name;
    //地址
    private String address;
    //电话号码
    private String tel;
    //电子邮箱
    private String email;

    public User() {
    }

    public User(int uid, String username, String password, String name, String address, String tel, String email) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
