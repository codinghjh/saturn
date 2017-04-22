package com.qunar.fresh.objects;

import com.google.common.collect.ComparisonChain;

/**
 * Created by junhuahan on 16-7-15. junhua.han@qunar.com
 */
public class Foo {
    private String name = "";
    private int a = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int compareTo(Foo that) {
        return ComparisonChain.start().compare(this.getName(), that.getName()).compare(this.getA(), that.getA())
                .result();
    }
}
