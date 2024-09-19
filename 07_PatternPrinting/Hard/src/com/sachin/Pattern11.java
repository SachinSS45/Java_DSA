package com.sachin;
/*
                *
               * *
              * * *
             * * * *
            * * * * *
             * * * *
              * * *
               * *
                *
 */
public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        //No of rows : 2*n-1

        for(int row = 1;row<=2*n-1;row++){

            int totalSpace = row<=n ? n-row : row-n;
            for(int space = 1;space <= totalSpace;space++){
                System.out.print(" ");
            }
            int totalColInRow = row<=n ? row: 2*n-row;
            for(int col = 1;col<=totalColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
