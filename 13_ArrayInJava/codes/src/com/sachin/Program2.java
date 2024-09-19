package com.sachin;

import java.util.Arrays;
import java.util.Scanner;

//Input and Output
public class Program2  {
    public static void main(String[] args) {
        //array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 34;
        arr[3] = 25;
        arr[4] = 12;
        //internally [23,45,34,25,12]
        System.out.println(arr[3]);//25

        //input using for loops
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //to print
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //enhanced for loop
        for(int num:arr){ //for every elements in array,print the element
            System.out.print(num + " ");//here num represent element of the array
        }
        System.out.println();
        //System.out.println(arr[5]);//ArrayIndexOutOfBoundException
        //by using toString() method
        System.out.println(Arrays.toString(arr));

        //array of objects
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
