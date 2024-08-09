package com.sachin;
/*
    Pass by value :
            1) if we pass primitive types or String (immutable) to method it will change original value .

 */
public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //swap two numbers
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
        System.out.println(a + " " + b);

        String name = "Sachin Shetkar";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Subramanyam Jadhav";
    }

    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
