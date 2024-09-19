package com.sachin;
/*
    * * * *
    * * * *
    * * * *
    * * * *
 */
public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;//No of rows
        for(int row = 1; row <= n; row++){
            for(int col=1;col <= n;col++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
