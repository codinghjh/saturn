package com.qunar.fresh;

import java.util.Set;

import com.google.common.collect.Sets;

/**
 * Version: 1.0.0 Date:2016-09-22 Time: 17:59 Author: junhua.han
 */
public class Test {
    public static void main(String[] args) {
        Set<Integer> set = Sets.newHashSet();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }

        for (int i : set) {
            System.out.println(i);
        }
    }
}
