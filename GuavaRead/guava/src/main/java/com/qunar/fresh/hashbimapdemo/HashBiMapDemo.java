package com.qunar.fresh.hashbimapdemo;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by junhuahan on 16-7-21. junhua.han@qunar.com
 */
public class HashBiMapDemo {
    public static void main(String[] args) {
        BiMap<Integer, String> map = HashBiMap.create();
        System.out.println(map.put(1, "first"));
        System.out.println(map);
        System.out.println(map.put(2, "second"));
        System.out.println(map);
        System.out.println(map.put(1, "first"));
        System.out.println(map);
        System.out.println(map.put(2, "third"));
        System.out.println(map);
        // System.out.println(map.put(4,"third"));
    }
}
