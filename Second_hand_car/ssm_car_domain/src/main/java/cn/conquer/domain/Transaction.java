package cn.conquer.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 交易信息类
 */
public class Transaction implements Serializable {

    //交易id
    private int tid;
    //交易时间
    private Date transaction_time;
    //交易地址
    private String transaction_address;
    //客户信息，只有姓名，具体信息通过姓名查询用户表
    private String client_massage;
    //车id
    private int car_cid;
    //客户电话
    private String tel;

    public Transaction() {
    }

    public Transaction(int tid, Date transaction_time,
                       String transaction_address,
                       String client_massage, int car_cid, String tel) {
        this.tid = tid;
        this.transaction_time = transaction_time;
        this.transaction_address = transaction_address;
        this.client_massage = client_massage;
        this.car_cid = car_cid;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "tid=" + tid +
                ", transaction_time=" + transaction_time +
                ", transaction_address='" + transaction_address + '\'' +
                ", client_massage='" + client_massage + '\'' +
                ", car_cid=" + car_cid +
                ", tel='" + tel + '\'' +
                '}';
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Date getTransaction_time() {
        return transaction_time;
    }

    public void setTransaction_time(Date transaction_time) {
        this.transaction_time = transaction_time;
    }

    public String getTransaction_address() {
        return transaction_address;
    }

    public void setTransaction_address(String transaction_address) {
        this.transaction_address = transaction_address;
    }

    public String getClient_massage() {
        return client_massage;
    }

    public void setClient_massage(String client_massage) {
        this.client_massage = client_massage;
    }

    public int getCar_cid() {
        return car_cid;
    }

    public void setCar_cid(int car_cid) {
        this.car_cid = car_cid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
