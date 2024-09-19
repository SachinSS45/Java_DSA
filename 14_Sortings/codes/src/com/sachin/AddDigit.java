package com.sachin;

public class AddDigit {

    public static int addDigit(int num){
        if(num < 10) return num;
        int sum = 0;
        while(num!=0){
            int rem = num % 10;
            sum = sum + rem;
            num = num/10;
            if(num==0 && sum > 9){
                num = sum;
                sum = 0;
            }
        }
        return sum;

    }
    public static int addDigit2(int num){

        if(num==0) return 0;

        return num%9==0?9:num%9;
    }
    public static int addDigit3(int num){

        return num-9*((num-1)/9);
    }
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(addDigit(num));
        System.out.println(addDigit2(12345));
        System.out.println(num-9*137);
    }
}
