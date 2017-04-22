package com.qunar.fresh.collectionsdemo;

import java.util.Collections;
import java.util.List;

import javax.annotation.Nullable;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

/**
 * Created by junhuahan on 16-7-20. junhua.han@qunar.com
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> strings = Lists.newArrayList("first", //
                "second", //
                "three", //
                "five", //
                "six");
        Collections.sort(strings, Ordering.natural().reverse().onResultOf(new Function<String, Integer>() {
            @Nullable
            public Integer apply(@Nullable String input) {
                return input == null ? 0 : input.length();
            }
        }).compound(Ordering.<String> natural()));
        System.out.println(strings);
    }
}
