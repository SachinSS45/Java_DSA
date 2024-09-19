package com.sachin;
/*
    * * * * *
    * * * *
    * * *
    * *
    *
 */
public class Pattern3 {
    public static void main(String[] args) {

        int n = 5;
        //How many rows are there ? = n
        for(int row = 1; row <= n ; row++){

            for(int col = 1;col <= (n+1-row);col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
