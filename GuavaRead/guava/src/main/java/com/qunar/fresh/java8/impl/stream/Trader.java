package com.qunar.fresh.java8.impl.stream;

/**
 * @version 1.0.0 @author junhua.han @date 2017-12-01 @time 下午12:19 <br>
 */
public class Trader {

    private final String name;

    private final String city;

    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
