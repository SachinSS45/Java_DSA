package Introduction;

import java.util.Collections;

/*
    How to convert decimal to binary :
    T.C : O(log2(n))
    S.C : O(1)
 */
public class Program01 {
    public static void main(String[] args) {

        int num = 13;

        System.out.println(convertToBinary(num));
        System.out.println(convertToBinary2(num));
    }
    public static int convertToBinary(int num){

        int ans = 0;
        int mul = 1;

        while(num>0){
            int rem = num % 2;
            num = num / 2;
            ans = rem*mul + ans;
            mul*=10;
        }
        return ans;
    }

    //T.C : log2(n) S.C : log2(n) [For String]
    public static String convertToBinary2(int num){
        String str = "";

        while(num!=0){
            if(num%2==1) str= str + '1';
            else str = str + '0';
            num = num/2;
        }
        return reverse(str);

    }


    public static String reverse(String str){

        String ans = "";
        int mul = 1;
        for(int i=str.length()-1;i>=0;i--){
            ans = ans + str.charAt(i);
        }
        return ans;
    }
}
