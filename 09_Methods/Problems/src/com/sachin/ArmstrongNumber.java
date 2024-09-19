package com.sachin;

import java.util.Scanner;

/*
    Q.2 Check whether the number is armstrong or not
     Input 1 : 23
     Output 1 : false
     Explanation : 23 contains 2 digits so 2^2 + 3^2 = 13
        i.e 23==13 (false) it is not armstrong number
     Input 2 : 153
     Output 2 : true
     Explanation : No.of digits : 3 so 1^3 + 5^3 + 3^3 = 153
        i.e 153==153(true) it is armstrong number
 */
public class ArmstrongNumber {
    public static boolean checkArmstrong(int num,int digit){
        int ans = 0;
        int temp = num;
        int rem = 0;
        while(temp!=0){
            rem = temp % 10;
            ans += Math.pow(rem,digit);
            temp /= 10;
        }
        return num==ans;
    }
    public static int noOfDigits(int num){
        int cnt = 0;
        while(num!=0){
            num /= 10;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = noOfDigits(num);
        System.out.println(checkArmstrong(num,digit));
    }
}
