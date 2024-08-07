package com.sachin;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
            Syntax of for loops :

            for(initialisation; condition; increment/decrement) {
                //body
            }
         */
        //Q. print numbers 1 to 5

//        for(int num = 1; num <=5; num++){
//            System.out.println(num);
//        }

        //Q.Print numbers 1 to n
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        for (int num = 1; num < n; num++) {
//            System.out.print(num + " ");
//        }

        //while loops
        /*
            Syntax :
            while(condition){
                //body
            }
         */
        //Q. print numbers 1 to 5
        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num+=1;
        }
        //do-while
        /*
            Syntax : do while
            do{
                //body
            }while(condition);
         */

        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n<=5);

    }
}
