package com.qunar.fresh.arrayListMultiMap;

import java.util.List;

import com.google.common.collect.ArrayListMultimap;

/**
 * Created by junhuahan on 16-8-4. junhua.han@qunar.com
 */
public class ArrayListMultiMapDemo {
    public static void main(String[] args) {
        ArrayListMultimap multimap = ArrayListMultimap.create();
        multimap.put(1, "1");
        multimap.put(1, "first");
        multimap.put(2, "2");
        List<String> result = (List<String>) multimap.get(1);
        System.out.println(result);
    }
}
