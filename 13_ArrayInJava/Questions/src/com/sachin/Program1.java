package com.sachin;

import java.util.Arrays;
import java.util.Collections;

/*
    Q.1 . Swap two elements of array
    Input : arr = [1,3,23,9,28] index1 = 1 , index2 = 3;
    Output : arr = [1,9,23,3,28]
 */
public class Program1 {

    //Time complexity : 0(1) S.C : 0(1)
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,28};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr)); //[1, 9, 23, 3, 28]
    }
}
