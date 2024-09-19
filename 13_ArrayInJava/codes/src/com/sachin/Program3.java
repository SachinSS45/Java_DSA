package com.sachin;

import java.util.Arrays;

//Passing array to method : when we pass object reference actually it will take copy of reference
//                          which is going to point to same object.
public class Program3 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));//[3,4,5,12]
        change(nums);
        System.out.println(Arrays.toString(nums));//[99,4,5,12]
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
