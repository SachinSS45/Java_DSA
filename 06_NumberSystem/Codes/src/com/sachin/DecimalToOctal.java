package com.sachin;

import java.util.Scanner;
/*
   Q.4 Decimal To Octal
        Input : 13
        Output : 15
 */
public class DecimalToOctal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = 0;
        int rem = 0;
        int mul = 1;

        while(num>0){
            rem = num % 8;
            num /= 8;
            ans += rem*mul;
            mul *= 10;
        }
        System.out.println(ans);
    }
}
