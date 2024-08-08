package com.sachin;

import java.util.Scanner;

/*
    In switch statements,you can jump to various cases based on your expression.

    Syntax :
        switch(expression){
            //cases
            case one:
                //do something
                break;

            case one:
                //do something
                break;

            case one:
                //do something
                break;

            default :
                //do something
         }

         OR

         switch(expression){
            case one -> //do something
            case two -> //do something
            case three -> //do something
            case four -> //do something
            case default -> //do something
         }
         //No need to add break in enhanced switch it internally implements break statement

     Notes :
        1)cases have to be the same type as expressions,must be constant or litreal
        2)Duplicate case values are not allowed
        3)break is used to terminate the sequence
        4)if break is not used,it will continue to next case
        5)default will execute when none of the above does
        6)if default is not at the end, put break after it.

 */
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        //1
        System.out.println("***** Way 1 to write switch statement *****");
        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }
        //2
        System.out.println("***** Way 2 to write switch statement *****");
        switch (fruit){
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange"-> System.out.println("Round Fruit");
            case "Grapes"-> System.out.println("Small fruit");
            default -> System.out.println("please enter a valid fruit");
        }

    }
}
