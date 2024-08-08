package com.sachin;

public class PowerOfTwo {
    public static void main(String[] args) {

        int num = 32;
        //1
        if(checkPower(num)){
            System.out.println("power of two");
        }else{
            System.out.println("Not power of two");
        }

        //2
        if(checkPowerBS(num)){
            System.out.println("power of two");
        }else{
            System.out.println("Not power of two");
        }
        //3
        if(checkPowerBit(num)){
            System.out.println("power of two");
        }else{
            System.out.println("Not power of two");
        }


    }

    private static boolean checkPowerBS(int num) {

        int squareroot = (int) Math.sqrt(num);

        for(int i=1;i<=squareroot;i++){
            if(num == Math.pow(2,i)){
                return true;
            }
        }
        return false;
    }

    private static boolean checkPowerBit(int num) {
        if( num < 1){
            return false;
        }
        return  (num&(num-1))==0;
    }

    private static boolean checkPower(int num) {
        if(num < 1){
            return false;
        }
        int mul = 1;
        while(mul<=num){
            if(mul==num){
                return true;
            }
            mul = mul * 2;
        }
        return false;
    }
}
