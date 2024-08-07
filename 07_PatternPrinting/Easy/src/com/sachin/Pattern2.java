package com.sachin;
/*
    10 10 10 10 10
    10 10 10 10 10
    10 10 10 10 10
    10 10 10 10 10
    10 10 10 10 10
 */
public class Pattern2 {
    public static void main(String[] args) {
        int num = 10;

        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= 5; col++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
