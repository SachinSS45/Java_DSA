package com.sachin;
//Q.2 : Print 'a' to 'z'
public class PrintAToZ {
    public static void main(String[] args) {
        //1
        for(char ch = 97;ch <= 122; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
        //2
        for (char ch = 'a'; ch <= 'z' ; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
        //3
        for(int i = 97; i <= 122; i++){
            System.out.print((char)i + " ");
        }
    }
}
