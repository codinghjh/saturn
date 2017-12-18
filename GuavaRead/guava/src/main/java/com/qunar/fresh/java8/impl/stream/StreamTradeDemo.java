package com.qunar.fresh.java8.impl.stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @version 1.0.0 @author junhua.han @date 2017-12-01 @time 下午12:14 <br>
 */
public class StreamTradeDemo {

    private static final Gson gson = new GsonBuilder().create();

    public static void main(String[] args) {

        Trader raou1 = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brain = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Lists.newArrayList(new Transaction(brain, 2011, 300),
                new Transaction(raou1, 2012, 1000), new Transaction(raou1, 2011, 400),
                new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

        // 2011年所有交易，按照交易额排序（从低到高）
        List<Transaction> collect2011 = transactions.stream().filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue)).collect(toList());
        System.out.println(gson.toJson(collect2011));

        // 交易员都在哪些不同的城市工作过
        List<String> diffCity = transactions.stream().map(transaction -> transaction.getTrader().getCity()).distinct()
                .collect(toList());
        Set<String> diffCitySet = transactions.stream().map(transaction -> transaction.getTrader().getCity())
                .collect(toSet());
        System.out.println(gson.toJson(diffCity));
        System.out.println(gson.toJson(diffCitySet));

        // 查找所有来自于剑桥的交易员，并按姓名排序
        List<Trader> cambridgeName = transactions.stream().map(Transaction::getTrader)
                .filter(trader -> StringUtils.equals(trader.getCity(), "Cambridge")).distinct()
                .sorted(Comparator.comparing(Trader::getName)).collect(toList());
        System.out.println(gson.toJson(cambridgeName));

        // 返回所有交易员的姓名字符串，按照字母顺序排序
        List<String> tradersName = transactions.stream().map(Transaction::getTrader).distinct().map(Trader::getName)
                .sorted().collect(toList());
        System.out.println(gson.toJson(tradersName));
        // 有没有交易员是在米兰工作的
        boolean milan = transactions.stream()
                .anyMatch(transaction -> StringUtils.equals(transaction.getTrader().getCity(), "Milan"));
        System.out.println(milan);
        // 打印生活在剑桥的交易员的所有交易额
        transactions.stream().filter(transaction -> StringUtils.equals(transaction.getTrader().getCity(), "Cambridge"))
                .map(Transaction::getValue).forEach(System.out::println);
        // 所有交易中，最高的交易额是多少

        Optional<Integer> max = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
        System.out.println(gson.toJson(max));

        // 找到交易额最小的交易额
        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));
        System.out.println(gson.toJson(min));

        int sum = transactions.stream().mapToInt(Transaction::getValue).sum();
        System.out.println(sum);

        IntStream intStream = transactions.stream().mapToInt(Transaction::getValue);
        Stream<Integer> boxed = intStream.boxed();

        IntStream evenNumbers = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0);
        System.out.println(evenNumbers.count());

        Stream<int[]> stream = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(i -> IntStream.rangeClosed(i, 100).filter(j -> Math.sqrt(i * i + j * j) % 1 == 0)
                        .mapToObj(j -> new int[] { i, j, (int) Math.sqrt(i * i + j * j) }));

        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);

        // 斐波那契
        Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(20)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));
    }

    IntSupplier fib = new IntSupplier() {

        private int previous = 0;
        private int current = 1;
        @Override
        public int getAsInt() {
            int oldPrevious = this.previous;
            int nextValue = this.previous + this.current;
            this.previous = this.current;
            this.current = nextValue;

            return oldPrevious;
        }
    };

}
