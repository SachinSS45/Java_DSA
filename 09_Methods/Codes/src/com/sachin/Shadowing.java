package com.sachin;
/*
    Shadowing in Java :
        -> It is practice of using two variables with the same name within the scope that overlaps
 */
public class Shadowing {
    static int x = 90; // Here x is scope of entire block it can be accessible anywhere inside class
    //this will be shadowed at line 12
    public static void main(String[] args) {
        System.out.println(x);//90
        int x = 40;
        System.out.println(x);//40
    }
    static void fun(){
        System.out.println(x);//90
    }
}
