package com.sachin;
/*
    a b c d e
    a b c d e
    a b c d e
    a b c d e
    a b c d e
 */
public class Pattern8 {
    public static void main(String[] args) {
        //1
        for(int row = 1; row <= 5; row++){
            for(char col = 'a'; col <= 'e' ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("****** 2nd Way ******");
        //2
        for(int row = 1; row <= 5; row++){
            char ch = 'a';
            for(int col = 1; col <= 5 ; col++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println("****** 3rd Way ******");
        //3
        for(int row = 1; row <= 5; row++){

            for(int col = 1; col <= 5 ; col++){
                System.out.print((char)(96 + col) + " ");
            }
            System.out.println();
        }
    }
}
