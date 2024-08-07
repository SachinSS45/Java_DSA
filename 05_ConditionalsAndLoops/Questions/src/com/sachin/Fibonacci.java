package com.sachin;

import java.util.Scanner;

/*
    Q.7 fibonacci Series
        0 1 1 2 3 5 8 13
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev = 0;
        int curr = 1;

        for(int i = 2;i<=7;i++){
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        System.out.println(curr);

    }
}
