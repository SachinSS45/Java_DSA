package com.sachin;

import java.util.Arrays;

public class RevisionSorts {

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i< n-1;i++){
            int index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[index]) index = j;
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
