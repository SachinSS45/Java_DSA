package com.sachin;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float f = num; //Automatic type conversion (Implicit TypeCasting / Widing )

        int num1 = (int) 67.5f;//Typecasting (Narrowing)

        //Automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a); //257%256 = 1
//        System.out.println(b);//1

        byte b1 = 40;
        byte b2 = 50;
        byte b3 = 100;

        int ans = (b1*b2)/b3;
        System.out.println(ans);//20

        char ch = 65;
        System.out.println(ch);//A
    }
}
