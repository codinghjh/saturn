package com.qunar.fresh.netty.serial;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @version 1.0.0 @author junhua.han @date 2017-12-21 @time 下午11:59 <br>
 */
public class TestUserInfo {

    public static void main(String[] args) throws IOException {
        UserInfo info = new UserInfo();
        info.buildUserId(100).buildUserName("welcome to Netty");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(bos);
        os.writeObject(info);
        os.flush();
        os.close();
        byte[] b = bos.toByteArray();

        System.out.println("The jdk serializable length is : " + b.length);
        bos.close();
        System.out.println("----------");
        System.out.println("The byte array serializable length is :" + info.codeC().length);
    }
}
