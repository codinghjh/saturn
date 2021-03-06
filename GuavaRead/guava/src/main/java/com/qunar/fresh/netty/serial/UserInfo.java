package com.qunar.fresh.netty.serial;

import io.netty.buffer.ByteBuf;

import java.io.Serializable;
import java.nio.ByteBuffer;

/**
 * @version 1.0.0 @author junhua.han @date 2017-12-21 @time 下午10:10 <br>
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 7553254826759297614L;

    private String userName;

    private int userId;

    public UserInfo buildUserName(String userName){
        this.userName = userName;
        return this;
    }

    public UserInfo buildUserId(int userId){
        this.userId = userId;
        return this;
    }

    public final String getUserName(){
        return userName;
    }

    public final void setUserName(String userName){
        this.userName = userName;
    }

    public final int getUserId(){
        return userId;
    }

    public final void setUserId(int userId){
        this.userId = userId;
    }

    public byte[] codeC(){
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        byte[] value = this.userName.getBytes();
        buffer.putInt(value.length);
        buffer.put(value);
        buffer.putInt(this.getUserId());
        buffer.flip();
        value = null;
        byte[] result = new byte[buffer.remaining()];
        buffer.get(result);
        return result;
    }
}
