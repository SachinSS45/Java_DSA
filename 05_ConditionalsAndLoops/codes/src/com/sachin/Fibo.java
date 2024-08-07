package com.sachin;

import java.util.Scanner;
//Q.find the nth fibonacci number
public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev = 0;
        int curr = 1;
        int count = 2;
        while(count <= n){
            int temp = curr;
            curr = prev + curr;
            prev = temp;
            count++;
        }
        System.out.println(curr);
    }
}
