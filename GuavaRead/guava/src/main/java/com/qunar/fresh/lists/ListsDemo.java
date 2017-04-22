package com.qunar.fresh.lists;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

/**
 * Created by junhuahan on 16-7-28. junhua.han@qunar.com
 */
public class ListsDemo {
    public static void main(String[] args) {
        List<Integer> list1 = Lists.newArrayList();
        list1.add(1);
        list1.add(2);
        System.out.println(list1);
        List<Integer> list2 = Lists.newLinkedList(list1);
        System.out.println(list2);
        List<String> stringList = Lists.transform(list1, new Function<Integer, String>() {
            @Nullable
            public String apply(@Nullable Integer input) {
                return String.valueOf(input + "_string");
            }
        });
        System.out.println(stringList);
    }
}
