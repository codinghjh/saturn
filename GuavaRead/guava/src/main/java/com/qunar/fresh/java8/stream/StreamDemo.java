package com.qunar.fresh.java8.stream;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @version 1.0.0 @author junhua.han @date 2017-11-30 @time 下午3:41 <br>
 */
public class StreamDemo {

    private static Gson gson = new GsonBuilder().create();
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5);
        List<Integer> collect = list.stream().map(i -> i * i).collect(toList());
        System.out.println(collect);

        List<Integer> numbers1 = Lists.newArrayList(1, 2, 3);
        List<Integer> numbers2 = Lists.newArrayList(4, 5);

        List<int[]> collect1 = numbers1.stream().flatMap(i -> numbers2.stream().map(j -> new int[] { i, j }))
                .collect(toList());

        System.out.println(gson.toJson(collect1));

        List<int[]> collect2 = numbers1.stream()
                .flatMap(i -> numbers2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[] { i, j }))
                .collect(toList());

        System.out.println(gson.toJson(collect2));



    }
}
