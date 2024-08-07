package com.sachin;

import java.util.Scanner;
/*
    Q.4 Octal To Decimal
        Input : 15
        Output : 13
 */
public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = 0;
        int rem = 0;
        int mul = 1;

        while(num>0){
            rem = num % 10;
            num=num/10;
            ans+= rem*mul;
            mul*=8;
        }
        System.out.println(ans);
    }
}
