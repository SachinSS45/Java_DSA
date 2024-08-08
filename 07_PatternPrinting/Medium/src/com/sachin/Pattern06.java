package com.sachin;
/*
    * * * * *
    * * * *
    * * *
    * *
    *
 */
public class Pattern06 {
    public static void main(String[] args) {
        System.out.println("**** 1st Way ****");
        for(int row = 1; row <= 5; row++){
            for(int col = 5 ; col >= row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("**** 2nd Way ****");
        for(int row = 1; row <= 5; row++){
            for(int col = 1 ; col <= 5-(row-1); col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
