package com.sachin;

import java.util.Scanner;
/*
    Q.2 Binary To Decimal
       Input : 1101
       Output : 13
 */
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int ans = 0;
        int mul = 1;
        int rem = 0;

        while(num>0){
            rem = num % 10;
            num /= 10;
            ans = rem * mul + ans;
            mul *= 2;
        }
        System.out.println(ans);
    }
}
