package com.sachin;

import java.util.Scanner;

/*
    Q.1 convert lowercase to uppercase
    Input 1 : a
    Output 1 : A
    Input 2 : f
    Output 2 : F
 */
public class Program1 {

    public static char upperCase(char ch){
        ch = (char) (ch - 'a' + 'A');
        return ch;
    }
    public static char lowerCase(char ch){
        ch = (char) (ch + ('a'-'A'));
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(upperCase(ch));
        char ch1 = sc.next().charAt(0);
        System.out.println(lowerCase(ch1));


    }
}
