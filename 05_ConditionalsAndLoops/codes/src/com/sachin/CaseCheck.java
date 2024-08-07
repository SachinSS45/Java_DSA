package com.sachin;
//Q.check whether the character is uppercase or lowercase
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        //String name = "Sachin";
        //System.out.println(name.charAt(0));//S

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }
    }
}
