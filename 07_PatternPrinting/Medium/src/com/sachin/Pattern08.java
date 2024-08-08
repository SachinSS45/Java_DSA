package com.sachin;
/*
    5
    5 4
    5 4 3
    5 4 3 2
    5 4 3 2 1
 */
public class Pattern08 {
    public static void main(String[] args) {
        for(int row = 1; row <= 5; row++){
            for(int col = 5; col >= 5-(row-1);col--){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
