package com.sachin;

import java.util.Scanner;

/*
 Q.8 Prime Number :
       n = 7 -> Prime
       n = 10 -> Not Prime
 */
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num < 2){
            System.out.println(num + " is not prime");
        }else{
            boolean flag = true;
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println(num + " is Prime");
            else
                System.out.println(num + " is not prime");
        }
    }
}
