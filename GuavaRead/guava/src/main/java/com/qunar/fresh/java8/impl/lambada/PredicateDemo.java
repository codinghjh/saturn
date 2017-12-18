package com.qunar.fresh.java8.impl.lambada;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @version 1.0.0 @author junhua.han @date 2017-11-27 @time 下午10:41 <br>
 */
public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<String> nonEmptyStringPredicate = (String s)-> !s.isEmpty();

        List<String> lists = Lists.newArrayList("","1","123");

        List<String> noEmpty = filter(lists,nonEmptyStringPredicate);

        System.out.println(noEmpty);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if(p.test(t)){
                results.add(t);
            }
        }

        return results;
    }
}
