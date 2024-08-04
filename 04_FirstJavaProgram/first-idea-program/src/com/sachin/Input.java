package com.sachin;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roll = sc.nextInt();
        System.out.println("Your roll number is : " + roll);

        float avg = sc.nextFloat();
        System.out.println(avg);

        double per = sc.nextDouble();
        System.out.println(per);

        long phoneNo = sc.nextLong();
        System.out.println(phoneNo);

        char ch = sc.next().charAt(0);
        System.out.println(ch);

        short prize = sc.nextShort();
        System.out.println(prize);

        boolean isMarried = sc.nextBoolean();
        System.out.println(isMarried);

        byte dollars = sc.nextByte();
        System.out.println(dollars);


    }
}
