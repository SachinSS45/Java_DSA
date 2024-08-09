package com.sachin;
/*
    It is programed to check how we can return String value from method !!
 */
public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }
}
