package com.sachin;

public class CountOccurence {
    public static void main(String[] args) {
        int num = 13757787;

        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem == 7){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
        int num1 = 13757787;
        String str = "";
        str = str + num1;
        System.out.println(str.length());
    }
}
