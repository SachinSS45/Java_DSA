package com.sachin;

import java.util.Scanner;

/*
    Syntax of method :
        access_modifier  return_type name (){
            //body
            return statement
        }
 */
public class Sum {
    public static void main(String[] args) {
       //sum();
        int ans = sum2();
        System.out.println(ans);
        int ans2 = sum3(20,30);
        System.out.println(ans2);
    }
    //pass the value of numbers when you are calling the method in main()
    static int sum3(int num1,int num2){
        return num1 + num2;
    }
    //return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        return num1 + num2;
    }
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = "+ sum);
    }
}
