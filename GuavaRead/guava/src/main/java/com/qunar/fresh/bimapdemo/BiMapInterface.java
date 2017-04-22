package com.qunar.fresh.bimapdemo;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by junhuahan on 16-7-21. junhua.han@qunar.com
 */
public class BiMapInterface {
    public static void main(String[] args) {
        // BiMapInterface.jdkMap();
        BiMapInterface.biMapDemo();
    }

    /**
     * jdk 自带map，实现key-value映射
     */
    private static void jdkMap() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "1");
        map.put(2, "2");
        System.out.println("map: " + map);
    }

    /**
     *
     * @param map 要反转的map
     * @param <K> key
     * @param <V> value
     * @return 反转后的map
     */
    private static <K, V> Map<V, K> inverseMap(Map<K, V> map) {
        Map<V, K> inverseMap = new HashMap<V, K>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            inverseMap.put(entry.getValue(), entry.getKey());
        }
        return inverseMap;
    }

    /**
     * BiMap示例
     */
    private static void biMapDemo() {
        BiMap<Integer, String> map = HashBiMap.create();
        map.put(1, "first");
        map.put(2, "second");
        System.out.println(map.inverse());
        System.out.println(map.inverse().inverse() == map);
        map.forcePut(3, "first");
        System.out.println(map.inverse());
        // map.put(3,"first"); //报错
    }
}
