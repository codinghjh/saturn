package com.qunar.fresh.jvm.understanding.jvm;

/**
 * @version 1.0.0 @author junhua.han @date 2017-10-29 @time 下午10:45 <br>
 */
public class HeapAllocationDemo {

    private static final int MB = 1024 *1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * MB];
        allocation2 = new byte[2 * MB];
        allocation3 = new byte[2 * MB];
        allocation4 = new byte[4 * MB];
    }
}
