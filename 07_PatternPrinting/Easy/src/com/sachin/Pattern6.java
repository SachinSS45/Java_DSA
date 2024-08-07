package com.sachin;
/*
    1 4 9 16 25
    1 4 9 16 25
    1 4 9 16 25
    1 4 9 16 25
    1 4 9 16 25
 */
public class Pattern6 {
    public static void main(String[] args) {

        for (int row = 1; row <= 5 ; row++) {
            for (int col = 1; col <= 5 ; col++) {
                System.out.print(col*col + " ");
            }
            System.out.println();
        }

    }
}
