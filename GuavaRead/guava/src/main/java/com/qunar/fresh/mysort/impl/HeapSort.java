package com.qunar.fresh.mysort.impl;

import com.qunar.fresh.mysort.ISort;
import com.qunar.fresh.mysort.SortUtil;

/**
 * Version: 1.0.0 Date:2017-04-16 Time: 14:30 Author: junhua.han <br>
 */
public class HeapSort implements ISort {
    @Override
    public void sort(int[] array) {
        if(array == null||array.length<=1){
            return;
        }
        for(int i=array.length/2;i>=0;i--){
            heapAdjust(array,i,array.length-1);
        }
        for(int i=array.length-1;i>=0;i--){
            SortUtil.swap(array,0,i);
            heapAdjust(array,0,i-1);
        }
    }

    private void heapAdjust(int[] array,int start,int end){
        if(start >=end)
        {
            return;
        }
        int tmp = array[start];
        for(int i=start*2+1;i<=end;i*=2){
            if(i+1<=end&&array[i]<array[i+1])
            {
                i++;
            }
            if(tmp >=array[i]){
                break;
            }
            array[start] = array[i];
            start = i;
        }
        array[start] = tmp;
    }
}
