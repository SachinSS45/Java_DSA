package com.sachin;
/*
                   *
                 * *
               * * *
             * * * *
           * * * * *
 */
public class Pattern01 {
    public static void main(String[] args) {

        int rows = 5;
        for(int row = 1;row <= rows;row++){
            for(int space=1;space<=(rows-row);space++){
                System.out.print("  ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
