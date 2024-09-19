package com.sachin;

import java.util.Arrays;
import java.util.Collections;
/*
    TC : Worst Case : O(n2)  Best Case : O(n) Avg Case : O(n2)

 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,6,5,4,1};
        System.out.println(Arrays.toString(arr));
        bubbleSortAscending(arr);
        System.out.println(Arrays.toString(arr));
        bubbleSortDesending(arr);
    }

    private static void bubbleSortDesending(int[] arr) {
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            boolean isSorted = false;
            for(int j=0;j<=i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = true;
                }
            }
            if(!isSorted) break;
        }
    }

    private static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            boolean isSorted = false;
            for(int j=0;j<=i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = true;
                }
            }
            if(!isSorted) break;
        }
    }
}
