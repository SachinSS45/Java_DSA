package com.sachin;

import java.util.Arrays;
/*
    Variable length args : (VarArgs)
        -> It is used when you don't know how many inputs we are giving
        Syntax :
            return_Type method_Name ( Type ...v){
            }
 */
public class VarArgs {
    public static void main(String[] args) {
        fun(10,2,3,4,5,4,45,6,43,56,34,35);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
