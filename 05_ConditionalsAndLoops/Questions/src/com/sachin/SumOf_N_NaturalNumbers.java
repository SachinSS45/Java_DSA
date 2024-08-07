package com.sachin;

import java.util.Scanner;

/*
    Q.6 Sum of n natural numbers
    n = 10
    sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
    Output : 55
 */
public class SumOf_N_NaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        //2 : Time Complexity O(1)

        int sum2 = (n * (n + 1))/2;
        System.out.println(sum2);
    }
}
