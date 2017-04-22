package com.qunar.fresh.ComparsionChain;

import com.google.common.collect.ComparisonChain;

/**
 * Created by hanju on 2016/8/17. junhua.han@qunar.com
 */
public class ComparsionChainDemo {
    public static void main(String[] args) {
        Foo foo1 = new Foo(10, "foo", "foo1");
        Foo foo2 = new Foo(10, "foo", "foo2");

        int result = ComparisonChain.start().compare(foo1.getId(), foo2.getId()).compare(foo1.getName(), foo2.getName())
                .compare(foo1.getDes(), foo2.getDes()).result();
        System.out.println(result);
    }
}
