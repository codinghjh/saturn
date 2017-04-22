package com.qunar.fresh.mysort;

import com.qunar.fresh.mysort.impl.HeapSort;
import com.qunar.fresh.mysort.impl.InsertSort;
import com.qunar.fresh.mysort.impl.MergeSort;
import com.qunar.fresh.mysort.impl.ShellSort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;

/**
 * Version: 1.0.0 Date:2017-04-16 Time: 13:47 Author: junhua.han <br>
 */
public class SortDemo {
    private static final Logger logger = LoggerFactory.getLogger(SortDemo.class);

    public static void main(String[] args) {
        int[] array = new int[]{7,4,11,26,33,12,8,27};
        ISort sort;

        //插入排序
//        sort = new InsertSort();
//        sort = new HeapSort();
//        sort = new ShellSort();
        sort = new MergeSort();
        sort.sort(array);
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
