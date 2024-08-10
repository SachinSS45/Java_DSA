package com.sachin;
/*
    A
    A B
    A B C
    A B C D
    A B C D E
 */
public class Pattern04 {
    public static void main(String[] args) {
        int n = 5;
        //Way 1
        for (int row = 0; row <= n ; row++) {
            for (int space = 1; space <= (n-row) ; space++) {
                System.out.print("  ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print((char)('A'+ col-1)+ " ");
            }
            System.out.println();
        }

        //Way 2
        for (int row = 0; row <= n ; row++) {
            char ch = 'A';
            for (int space = 1; space <= (n-row) ; space++) {
                System.out.print("  ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print(ch +  " ");
                ch++;
            }
            System.out.println();
        }
    }
}
