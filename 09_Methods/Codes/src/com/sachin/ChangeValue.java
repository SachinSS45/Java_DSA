package com.sachin;
/*
    Pass by copy of value of reference :
            passing array to method : it will change value
 */
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99; // here we are not creating new object we are modifying it
    }
}
