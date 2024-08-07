package com.sachin;
/*
    Q.5 . Power of number
       Ex 1 : num = 5 pow = 3
       Output : 125
       Explanation : 5 * 5 * 5 = 125
                => 3 times we multiplied
 */
public class PowerOfNumber {
    public static void main(String[] args) {

        int num = 5;
        int pow = 4;

        //If we multiply any number by 1 number will be same
        int ans = 1;

        for(int i = 1; i <= pow; i++){
            ans = ans * num;
        }
        System.out.println(ans);
    }
}
