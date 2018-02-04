package com.qunar.fresh.netty.serial.nettyjava;

import java.io.Serializable;

/**
 * @version 1.0.0 @author junhua.han @date 2017-12-22 @time 上午12:44 <br>
 */
public class SubscribeReq implements Serializable {
    private static final long serialVersionUID = -6084444430922129777L;

    private int subReqId;

    private String userName;

    private String productName;

    private String phoneNumber;

    private String address;

    public int getSubReqId() {
        return subReqId;
    }

    public void setSubReqId(int subReqId) {
        this.subReqId = subReqId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SubscribeReq{" +
                "subReqId=" + subReqId +
                ", userName='" + userName + '\'' +
                ", productName='" + productName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
