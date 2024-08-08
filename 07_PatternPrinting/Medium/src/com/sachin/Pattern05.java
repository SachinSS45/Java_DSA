package com.sachin;
/*
    a
    b b
    c c c
    d d d d
    e e e e e
 */
public class Pattern05 {
    public static void main(String[] args) {

        //1
        System.out.println("**** 1st Way ****");
        for(int row = 1; row <= 5; row++){
            char ch = (char) ('a' + row - 1);
            for (int col = 1; col <= row ; col++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        //2
        System.out.println("**** 2nd Way ****");
        char ch = 'a';
        for(int row = 1; row <= 5; row++){
            for (int col = 1; col <= row ; col++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
        //3
        System.out.println("**** 3rd Way ****");

        for(int row = 1; row <= 5; row++){
            for (int col = 1; col <= row ; col++) {
                System.out.print((char)(96 + row ) + " ");
            }
            ch++;
            System.out.println();
        }

    }
}
