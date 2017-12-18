package com.qunar.fresh.java8.impl.stream;

/**
 * @version 1.0.0 @author junhua.han @date 2017-12-01 @time 下午12:33 <br>
 */
public class Transaction {
    private final Trader trader;

    private final int year;

    private final int value;

    public Transaction(Trader trader, int year, int value){
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
