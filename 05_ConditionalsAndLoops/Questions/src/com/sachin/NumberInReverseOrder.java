package com.sachin;

import java.util.Scanner;

/*
    Q.3 Print Number in Reverse Order
        Ex : n = 10
        Output : 10 9 8 7 6 5 4 3 2 1
 */
public class NumberInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            System.out.print(i + " ");
        }
    }
}
