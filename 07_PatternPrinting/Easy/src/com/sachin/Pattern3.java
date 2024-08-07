package com.sachin;
/*
    1 1 1 1 1
    2 2 2 2 2
    3 3 3 3 3
    4 4 4 4 4
    5 5 5 5 5
 */

public class Pattern3 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        for(int row = 1; row <= rows; row++){
            for(int col =1; col <= cols; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
