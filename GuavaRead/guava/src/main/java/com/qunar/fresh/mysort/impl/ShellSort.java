package com.qunar.fresh.mysort.impl;

import com.qunar.fresh.mysort.ISort;

/**
 * Version: 1.0.0 Date:2017-04-16 Time: 15:24 Author: junhua.han <br>
 */
public class ShellSort implements ISort {
    @Override
    public void sort(int[] array) {
        if(array == null||array.length<=1){
            return;
        }
        int distance = array.length/2;
        while (distance>=1){
            shellSort(array,distance);
            distance = distance/2;
        }
    }

    private void shellSort(int[] array,int distance){
        int tmp;
        int pos ;
        for(int i=distance;i<array.length;i++){
            tmp = array[i];
            pos = i;
            for (int j = i-distance;j>=0;j -=distance){
                if(tmp>=array[j]){
                    break;
                }
                array[j+distance] = array[j];
                pos = j;
            }
            array[pos] = tmp;
        }
    }
}
