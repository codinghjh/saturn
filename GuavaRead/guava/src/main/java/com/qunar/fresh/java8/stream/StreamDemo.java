package com.qunar.fresh.java8.stream;

import static com.sun.tools.doclint.Entity.sum;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Optional;

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

        if (numbers1.stream().anyMatch(i -> i > 2)) {
            System.out.println("has match");
        }

        if (numbers1.stream().allMatch(i -> i > 0)) {
            System.out.println("all match");
        }

        if (numbers1.stream().noneMatch(i -> i > 100)) {
            System.out.println("none match");
        }

        Optional<Integer> any = numbers1.stream().filter(i -> i > 2).findAny();
        System.out.println(any.isPresent() ? any.get() : "not exist");

        Optional<Integer> first = numbers1.stream().filter(i -> i > 1).findFirst();
        System.out.println(first.isPresent() ? first.get() : "not exists");

        Optional<Integer> reduce = numbers1.stream().reduce((i, j) -> i + j);
        System.out.println(gson.toJson(reduce));

        Integer reduceWithInit = numbers1.stream().reduce(0, (i, j) -> i + j);
        System.out.println(reduceWithInit);

        Integer reduceClassSum = numbers1.stream().reduce(0, Integer::sum);
        System.out.println(reduceClassSum);
    }
}
