package com.qunar.fresh.java8.lambada;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Function;

/**
 * @version 1.0.0 @author junhua.han @date 2017-11-27 @time 下午11:54 <br>
 */
public class FunctionDemo {

    public static void main(String[] args) {

        Function<String,Integer> function = String::length;

        List<Integer> map = map(Lists.newArrayList("lambdas", "int", "action"), function);

        System.out.println(map);
    }

    public static <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = Lists.newArrayList();

        for (T t : list) {
            result.add(f.apply(t));
        }

        return result;
    }
}
