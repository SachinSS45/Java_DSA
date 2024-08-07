package com.sachin;
import java.util.Scanner;
/*
   Q.5 Binary To Octal
   Input : 1101
   Output : 15
 */
public class BinaryToOctal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = 0;
        int mul = 1;

        while(num>0){
            int rem = num % 10;
            num = num / 10;
            ans = rem*mul + ans;
            mul = mul*2;
        }
        System.out.println(ans);

        mul = 1;
        int ans2 = 0;
        while(ans>0){
            int rem = ans % 8;
            ans = ans / 8;
            ans2 = rem*mul + ans2;
            mul = mul*10;
        }
        System.out.println(ans2);
    }
}
