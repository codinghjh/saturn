package com.qunar.fresh.mysort;

/**
 * Version: 1.0.0 Date:2017-04-16 Time: 13:45 Author: junhua.han <br>
 */
public class SortUtil {
    public static void swap(int[] array, int i, int j) {
        if (array == null || i == j) {
            return;
        }
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
