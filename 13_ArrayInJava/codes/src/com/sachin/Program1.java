package com.sachin;

public class Program1 {
    public static void main(String[] args) {
        //Q.Store a roll number
        int a = 19;

        //Q.Store a person's name
        String name = "Sachin Shetkar";

        //Q.Store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        //Syntax
        //datatype[] varaible_name = new dataType[size];
//        int[] rnos = new int[5];
        //store 5 roll numbers
        // or directly
//        int[] rnos2 = {23,12,45,32,15};

        int[] ros;//declaration of array,ros is getting defined in the stack
        ros = new int[5];//initialization : actually here object is being created in the heap.

        String[] arr = new String[4];
        System.out.println(arr[0]);//null

        String str = null;

    }
}
