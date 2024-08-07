package com.sachin;

import java.util.Scanner;

/*
    Q.4 Multiplication Table
        n = 10
        10 X 1 = 10
        10 X 2 = 20
        10 X 3 = 30
        .
        .
        .
        10 X 10 = 100

 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which table you want to print : ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " X " + i + " = " + (n*i));
        }

        //2
        for(int i = n; i <= (10*n); i = i + n){
            System.out.println(i);
        }
    }
}
