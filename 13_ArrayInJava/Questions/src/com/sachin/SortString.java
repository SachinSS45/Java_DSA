package com.sachin;

import java.util.Arrays;

public class SortString {
    //T.C : O(n) S.C : 0(1)
    public static String sort(char[] carr){

        //a-z = 26
        // a-> 0 a -a = 97 -97
        // b->1 b-a = 98-97 = 1
        // d->  d -a = 100-97 = 3
        int[] freq = new int[26];//0(1)

        for(int i=0;i<carr.length;i++){//0(n)
            freq[carr[i]-'a']++;
        }
        System.out.println(Arrays.toString(freq));
        int index = 0;
        for(int i=0;i<25;i++){//O(1)
            int count = freq[i];//i = 0
            while(count>0){
                carr[index] = (char)('a'+i);
                index++;
                count--;
            }
        }
        System.out.println(Arrays.toString(carr));
        return new String(carr);
    }
    public static void main(String[] args) {
        String str = "ssacchhiin";
        char[] carr = str.toCharArray();
        System.out.println(sort(carr));
        System.out.println(carr);
    }
}
