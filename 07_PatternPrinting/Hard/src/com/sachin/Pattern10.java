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
public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        //No of rows ? Ans : 2*n-1

        for(int row = 1; row <= 2*n-1 ;row++){

            if(row>n){
                for(int col = 1;col <= (2*n-row);col++){
                    System.out.print("* ");
                }
            }else{
                for(int col = 1;col <= row ; col++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        //2
        for(int row =1 ; row <= 2*n-1;row++){

            int totalColsInRow = row > n ? 2 * n - row : row;
            for(int col = 1;col<= totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
