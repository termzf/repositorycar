package cn.conquer.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 交易信息类
 */
public class Transaction implements Serializable {

    //交易id
    private int id;
    //交易时间
    private Date transaction_time;
    //交易地址
    private String transaction_address;
    //客户信息，只有姓名，具体信息通过姓名查询用户表
    private String client_massage;
    //车id,外键，与卖车表外联
    private int cid;
    //客户电话
    private String tel;
    //交易结果
    private String result;

    public Transaction() {
    }

    public Transaction(int id, Date transaction_time,
                       String transaction_address,
                       String client_massage, int cid, String tel, String result) {
        this.id = id;
        this.transaction_time = transaction_time;
        this.transaction_address = transaction_address;
        this.client_massage = client_massage;
        this.cid = cid;
        this.tel = tel;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", transaction_time=" + transaction_time +
                ", transaction_address='" + transaction_address + '\'' +
                ", client_massage='" + client_massage + '\'' +
                ", cid=" + cid +
                ", tel='" + tel + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
