package com.qunar.fresh.joinerdemo;

import java.util.List;
import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * Created by junhuahan on 16-7-27. junhua.han@qunar.com
 */
public class JoinerDemo {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("first", "second", "third");
        Map<Integer, String> map = Maps.newHashMap();
        map.put(1, "first");
        map.put(2, "second");
        map.put(3, "third");
        String[] strings = { "first", "second", "third" };
        System.out.println(Joiner.on("-").appendTo(new StringBuilder(), list));
        System.out.println(Joiner.on("-").appendTo(new StringBuilder(), strings));
        System.out.println(Joiner.on("-").withKeyValueSeparator(":").appendTo(new StringBuilder(), map));
        System.out.println(Joiner.on("-").join(list));
    }
}
