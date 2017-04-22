package com.qunar.fresh.setsdemo;

import java.util.Set;

import com.google.common.collect.Sets;

/**
 * Created by junhuahan on 16-8-1. junhua.han@qunar.com
 */
public class SetsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = Sets.newHashSet(1, 2, 3, 4, 5, 6);
        Set<Integer> set2 = Sets.newHashSet(5, 6, 7, 8, 9);
        System.out.println(Sets.difference(set1, set2));
        System.out.println(Sets.union(set1, set2));
        System.out.println(Sets.intersection(set1, set2));
    }
}
