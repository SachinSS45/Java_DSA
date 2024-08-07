package com.sachin;

//Q.Reverse Number Ex : Num = 123 Rev = 321
public class ReverseNumber {
    public static void main(String[] args) {

        int num = 123;
        int rev = 0;

        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println(rev);
    }
}
