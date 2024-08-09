package com.sachin;

import java.util.Scanner;
/*
    Q.1 check whether the given number is prime or not.
       1) Input : 17
          Output : true
       2) Input : 15
          Output : false
    Q.2 check the given 3-digit number is armstrong number or not.
       1) Input : 17
          Output : false
       2) Input : 153
          Output : true
 */
public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isArmstrong(n));
    }
    //print all the 3 digits armstrong numbers

    static boolean isArmstrong(int n){
        int sum = 0;
        int temp = n;
        String str = Integer.toString(n);
        System.out.println(str.length());
        while(n > 0){
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum+=cube;
            n/=10;
        }
        return temp==sum;
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
