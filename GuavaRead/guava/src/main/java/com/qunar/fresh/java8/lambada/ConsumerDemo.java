package com.qunar.fresh.java8.lambada;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Consumer;

/**
 * @version 1.0.0 @author junhua.han @date 2017-11-27 @time 下午10:50 <br>
 */
public class ConsumerDemo {

    public static <T> void forEach(List<T> list , Consumer<T> c){
        for (T t : list) {
            c.accept(t);
        }
    }

    public static void main(String[] args) {

        List<Integer> lists = Lists.newArrayList(1,2,3,4,5);

        Consumer<Integer> consumer = System.out::println;

        forEach(lists,consumer);
        System.out.println("-----");
        lists.forEach(consumer);
    }
}
