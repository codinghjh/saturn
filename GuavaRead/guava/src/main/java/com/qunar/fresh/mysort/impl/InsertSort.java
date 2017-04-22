package com.qunar.fresh.mysort.impl;

import com.qunar.fresh.mysort.ISort;

/**
 * Version: 1.0.0 Date:2017-04-16 Time: 13:48 Author: junhua.han <br>
 */
public class InsertSort implements ISort {
    @Override
    public void sort(int[] array) {
        if(array == null||array.length<=1){
            return;
        }
        int toMove;
        int position ;
        for(int i=1;i<array.length;i++){
            toMove = array[i];
            position = i;
            int j=i-1;
            for(;j>=0;j--){
                if(array[j]>toMove){
                    array[j+1] = array[j];
                    position = j;
                }else {
                    break;
                }
            }
            array[position] = toMove;
        }
    }
}
