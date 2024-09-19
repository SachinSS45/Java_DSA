package com.sachin;

import java.util.Arrays;
import java.util.Scanner;

//MultiDimensional Array (Matrix)
//Syntax : Type[][] refVar_name = new Type[Compulsory][not comp];
public class Program4 {
    public static void main(String[] args) {
        //int[][] arr1 = new int[3][];
//        int[][] arr = {
//                {1,2,3},//oth index
//                {4,5},  //1st index
//                {6,7,8,9}//2nd index
//        };

        int[][] arr = new int[3][2];
        System.out.println(arr.length);//no of rows

        Scanner sc = new Scanner(System.in);
        //input
        for(int row = 0; row < arr.length;row++){
            //for each col in every row
            for(int col = 0; col < arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }
        //Output
        for(int row = 0; row < arr.length;row++){
            //for each col in every row
            for(int col = 0; col < arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //Output
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        //Enhanced for loop
        for(int[] arr1D : arr){
            System.out.println(Arrays.toString(arr1D));
        }
    }
}
