package com.sachin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        //initialisation
        for(int i=0;i<3;i++){
            al.add(new ArrayList<>());
        }

        //add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                al.get(i).add(sc.nextInt());
            }
        }
        //print
        System.out.println(al);
    }
}
