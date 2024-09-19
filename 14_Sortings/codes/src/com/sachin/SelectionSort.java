package com.sachin;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {6,5,4,1,2,3};
        sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //Take array size from user
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr2 = new int[size];
        for(int i=0;i<size;i++) {
            arr2[i] = sc.nextInt();
        }
        sort(arr2);
        System.out.println(Arrays.toString(arr2));
        descending(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    private static void descending(int[] arr){
            for(int i=0;i<arr.length-1;i++){
                int maxIndex = i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>arr[maxIndex]) maxIndex = j;
                }
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
    }
}
