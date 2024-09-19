package com.sachin;
/*
    Q.3 Reverse an array
    Input : arr=[1,2,3,4,5]
    Output : arr=[5,4,3,2,1]

    Approach : Two-Pointer
 */
public class Program3 {
    //T.C : O(n) S.C:O(1)
    public static void reverse(int[] arr){
        if(arr==null){
            System.out.println("Array is not initialized");
        }else{
            int start = 0;
            int end = arr.length-1;

            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            //way 2 : T.C : O(n) S.C : O(1)
            //int mid = size/2;
            //arr[i] = arr[size-1-i] start i from 0 to mid-1

            //way 3 : T.C : O(n)  S.C : O(n)
            //take new array add element in that by adding elements from last of original array
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
    }
}
