package com.sachin;
/*
    Scope :
        1)Method Scope
        2)Block Scope
        3)Loop Scope

 */
public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //1.Method Scope
        //System.out.println(marks); We can't access variables outside the method which are  defined inside method.

        //2.Block Scope
        {
            int c = 20;
            System.out.println(c);
            //int a = 78;//already initialized outside the block in the same method , hence you can't initialize value
            a = 40; // but you can change value
        }
        System.out.println(a);
        //System.out.println(c);we can't access block variables outside the block

        //3.Loop Scope
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        //System.out.println(i);we can't access loop variables outside the loop
    }
    //1.Method Scope
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
