package com.sachin;
/*
     a a a a a
     b b b b b
     c c c c c
     d d d d d
     e e e e e
 */
public class Pattern7 {
    public static void main(String[] args) {
        //1
        for(int row = 1; row <= 5; row++){
            char ch = (char) ('a' + (row -1));
            for(int col = 1; col <= 5; col++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println("****** 2nd Way ******");
        //2
        for(int row = 1; row <= 5; row++){

            for(int col = 1; col <= 5; col++){
                System.out.print((char)(96 + row) + " ");
            }
            System.out.println();
        }
        System.out.println("****** 3rd Way ******");
        //3
        char ch = 'a';
        for(int row = 1; row <= 5; row++){

            for(int col = 1; col <= 5; col++){
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
