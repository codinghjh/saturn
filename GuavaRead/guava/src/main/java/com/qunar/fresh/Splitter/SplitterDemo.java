package com.qunar.fresh.Splitter;

import com.google.common.base.Splitter;

/**
 * Created by junhuahan on 16-7-26. junhua.han@qunar.com
 */
public class SplitterDemo {
    public static void main(String[] args) {
        String toSplit = "abc,def,gh\r\ni,defg,hikd; ....abc";
        // System.out.println(Splitter.on(',').split(toSplit));//,分割
        // System.out.println("11----------------------------------------");
        // System.out.println(Splitter.on(CharMatcher.BREAKING_WHITESPACE).split(toSplit)); //CharMatcher中定义的空白符分割
        // System.out.println("22----------------------------------------");
        // System.out.println(Splitter.on(CharMatcher.anyOf(";,.")).split(toSplit)); //:或者,或者.分割
        // System.out.println("33----------------------------------------");
        // System.out.println(Splitter.on(", ").split(toSplit)); //
        // System.out.println("44----------------------------------------");
        // System.out.println(Splitter.onPattern("\r?\n").split(toSplit)); //将字符串按行分割(应用于\r\n做分行或者\n分行)
        // System.out.println("55----------------------------------------");
        System.out.println(Splitter.fixedLength(3).split(toSplit)); // 每3个字符分割成一个字串
    }
}
