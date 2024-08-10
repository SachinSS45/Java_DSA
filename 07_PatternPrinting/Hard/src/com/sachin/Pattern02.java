package com.sachin;
/*
          1
        2 2
      3 3 3
    4 4 4 4
 */
public class Pattern02 {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n ; row++) {
            for (int space = 1; space <= (n-row) ; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
