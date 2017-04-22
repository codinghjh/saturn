package com.qunar.junhuahan.jvm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Version: 1.0.0 Date:2017-03-18 Time: 02:15 Author: junhua.han
 */
public class JvmGcDemo {
    private static final Logger logger = LoggerFactory.getLogger(JvmGcDemo.class);

    public static void main(String[] args) {
        int m = 1024*1024;
        byte[] b = new byte[2*m];
        byte[] b2 = new byte[2*m];
        byte[] b3 = new byte[2*m];
        byte[] b4 = new byte[2*m];
        byte[] b5 = new byte[2*m];
        byte[] b6 = new byte[2*m];
        byte[] b7 = new byte[2*m];
    }
}
