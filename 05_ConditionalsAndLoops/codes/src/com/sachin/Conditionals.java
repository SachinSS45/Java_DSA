package com.sachin;
public class Conditionals {
    public static void main(String[] args) {

        /*
            Syntax : if statements
            if(boolean expression){
                //body
            }else{
                //body
            }
         */

        int salary = 25400;
        if(salary > 10000){
            salary += 2000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);//27400

        //mutliple if else

        if(salary > 10000){
            salary += 2000;
        }else if(salary > 20000){
            salary += 3000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);//27400
    }
}
