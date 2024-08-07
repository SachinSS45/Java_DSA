package com.sachin;
/*
    1   2   3   4   5
    6   7   8   9   10
    11  12  13  14  15
    16  17  18  19  20
    21  22  23  24  25
 */
public class Pattern9 {
    public static void main(String[] args) {
        int count = 1;
        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= 5; col++){
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }
        System.out.println("*****");
        // 2 way without count variable
        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= 5; col++) System.out.print((row - 1) * 5 + col + " ");
            System.out.println();
        }
    }
}
