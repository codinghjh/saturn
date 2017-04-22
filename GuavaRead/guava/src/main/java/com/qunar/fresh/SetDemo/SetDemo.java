package com.qunar.fresh.SetDemo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;

/**
 * Created by junhuahan on 16-7-20. junhua.han@qunar.com
 */
public class SetDemo {
    public static void main(String[] args) {
        // new SetDemo().testSet();
        new SetDemo().multiSetTest();
    }

    private void testSet() {
        Set set = new HashSet();
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(2);
        set.add(null);
        System.out.println(set.size());
        for (Object i : set) {
            System.out.println(i);
        }
    }

    private void multiSetTest() {
        List<Integer> ints = Lists.newArrayList(1, 2, 4, 4, 6, 1, 3, 6, 7, 3);
        Multiset<Integer> bag = HashMultiset.create(ints);
        for (Integer integer : bag.elementSet()) {
            System.out.printf("count of element %d in the bag:%d\n", integer, bag.count(integer));
        }
    }
}
