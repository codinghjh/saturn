package com.qunar.fresh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * Created by junhuahan on 16-7-19.
 * junhua.han@qunar.com
 */
public class ObjectDemo {
    private final static Logger logger = LoggerFactory.getLogger(ObjectDemo.class);

    public static void main(String[] args) {
        //new ObjectDemo().testInteger();
        new ObjectDemo().lostAccurate();
    }

    private void lostAccurate(){
        double a = 0.58;
        System.out.println(new BigDecimal(0.58));
        long b = (long)(a*100);
        System.out.println(b);
    }
    private void testInteger() {
        Integer a = 122;
        Integer b = 122;
        Integer c = new Integer(122);
        Integer d = 127;
        Integer e = 127;
        logger.info((a == b) + "");
        logger.info((a == c) + "");
        logger.info((d == e) + "");
    }
}
