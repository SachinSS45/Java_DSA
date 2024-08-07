package com.sachin;

import java.util.Scanner;

/*
    Q1. Decimal To Binary
    Input : 13
    Output : 1011
 */
/*
    6492 -> reverse 2946 ( by remainder method from last)
    formula : ans = 0;
              ans = ans*10 + rem;
    6492 -> keep same 6492 ( by remainder method from last)
              i start from 0
              ans = rem*power(10,i) + ans;
 */
public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int rem = 0;
        int ans = 0;
        int mul = 1;

        while(num>0){
              //remainder
              rem = num % 2;//rem = num&1
              //Quotient
              num /= 2;//num>>1
              //ans
              ans = rem * mul + ans;
              //multiplier
              mul *= 10;

        }
        System.out.println(ans);
//        int ans = 123;
//        int rev = 0;
//        int pow1 = 1;
//        while(ans > 0){
//            int rem = ans % 10;
//            rev = pow1 * rem + rev;
//            ans/=10;
//            pow1*=10;
//        }
//        System.out.println(rev);



    }
}
