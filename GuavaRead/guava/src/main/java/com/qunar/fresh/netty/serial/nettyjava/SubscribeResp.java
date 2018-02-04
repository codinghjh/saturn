package com.qunar.fresh.netty.serial.nettyjava;

import java.io.Serializable;

/**
 * @version 1.0.0 @author junhua.han @date 2017-12-22 @time 上午12:46 <br>
 */
public class SubscribeResp implements Serializable {
    private static final long serialVersionUID = 5471144345858940627L;

    private int subReqId;

    private int respCode;

    private String desc;

    public int getSubReqId() {
        return subReqId;
    }

    public void setSubReqId(int subReqId) {
        this.subReqId = subReqId;
    }

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "SubscribeResp{" +
                "subReqId=" + subReqId +
                ", respCode=" + respCode +
                ", desc='" + desc + '\'' +
                '}';
    }
}
