package com.sachin;

import java.util.Scanner;

/*
   Q.1 check whether it is weekday or weekend
       Input 1 : 1,2,3,4,5
       Output 1 : Weekday
       Input 2 : 6,7
       Output 2 : Weekend
 */
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }

    }
}
