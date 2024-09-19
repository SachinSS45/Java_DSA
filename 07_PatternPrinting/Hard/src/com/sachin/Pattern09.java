package com.sachin;
/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */
public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        //How many rows are present ? Ans : n

        for(int row = 1;row <= n; row++){
            //How many cols are present for every row
            for(int col = 1;col <= row ; col++){
                //In every row what we need to print ? col number
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
