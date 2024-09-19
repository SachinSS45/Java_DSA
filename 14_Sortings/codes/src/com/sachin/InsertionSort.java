package com.sachin;

import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(int[] arr) {

        //left side is sorted and right side is unsorted 0th ele is sorted because it is single ele
        int n = arr.length;
        for(int i=0;i< n-1;i++){
            for(int j=i+1;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    arr[j-1] = arr[j-1]^arr[j];
                    arr[j] = arr[j-1]^arr[j];
                    arr[j-1] = arr[j-1]^arr[j];
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
