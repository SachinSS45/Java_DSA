package com.sachin;

import java.util.Scanner;

/*
    Q.7 Factorial of number
    Input : n = 5
    Output : 120 ( 1 * 2 * 3 * 4 * 5 )
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
