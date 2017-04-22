package com.qunar.fresh.mysort.impl;

import com.qunar.fresh.mysort.ISort;

/**
 * Version: 1.0.0 Date:2017-04-16 Time: 15:37 Author: junhua.han <br>
 */
public class MergeSort implements ISort {
    @Override
    public void sort(int[] array) {
        if(array==null||array.length<=1){
            return;
        }
        mergeSort(array,0,array.length-1);
    }


    private void mergeSort(int[] array,int start,int end){
        if(start==end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(array,0,mid);
        mergeSort(array,mid+1,end);
        merge(array,start,end,mid);
    }
    private void merge(int[] array,int start,int end,int mid){
        if(start==end){
            return;
        }
        int[] tmp = new int[end-start+1];
        int i=0;
        int j = start;
        int k = mid+1;
        while(j<=mid&&k<=end){
            if(array[j]<=array[k]){
                tmp[i++] = array[j++];
            }else {
                tmp[i++] = array[k++];
            }
        }
        if(j>mid){
            while (k<=end){
                tmp[i++] = array[k++];
            }
        }else {
            while (j<=mid){
                tmp[i++] = array[j++];
            }
        }
        for(i=0;i<tmp.length;i++){
            array[start+i] = tmp[i];
        }
    }
}
