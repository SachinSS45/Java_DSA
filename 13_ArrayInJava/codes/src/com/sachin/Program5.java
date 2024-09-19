package com.sachin;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList :
public class Program5 {
    public static void main(String[] args) {
         //Syntax :
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(343);
//        list.add(34);
//        list.add(45);
//        list.add(234);
//        System.out.println(list);//[67, 343, 34, 45, 234]
//
//        System.out.println(list.contains(45));//true
//
//        list.set(3,99);
//        System.out.println(list);//[67, 343, 34, 99, 234]
//
//        list.remove(2);
//        System.out.println(list);//[67, 343, 99, 234]

        //input
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        //print(get by index)
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}
