package com.sachin;
/*
    Q.2 Maximum value in array
    Input : arr = {4,3,2,1,10};
    Output : 10
 */
public class Program2 {

    //Imagine that array is not empty
    //T.C : 0(n) S.C : 0(1)
    public static int max(int[] arr){
        if(arr==null || arr.length==0){
            return -1;
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
           // max = Math.max(max,arr[i]);
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,10};
        System.out.println(max(arr));//10
    }
}
