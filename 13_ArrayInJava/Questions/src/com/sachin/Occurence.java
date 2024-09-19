package com.sachin;

import java.util.Arrays;

public class Occurence {
    public static void occurence(int num){

        int[] freq = new int[10];//0(1)
        //number = 123002346 // 100 3 ->2  4->4
        while(num!=0){
            int rem = num % 10;
            freq[rem]++;
            num /=10;
        }
        for(int i=0;i<10;i++){
            if(freq[i]>0)  System.out.println(i+ " " + freq[i] + " Times");
        }
        
    }
    public static void main(String[] args) {
        int number = 123002346;
        System.out.println(number);
        occurence(number);
    }
}
