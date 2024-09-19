package com.sachin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
  Q.1 Find the occurrence of each ele in array:
  Explanation :
  Explanation of Your Code:
  1)Initialization of HashMap: You create a HashMap to store the occurrence of each element in the array.
     The key is the element, and the value is the count of that element.
  2)Counting Occurrences: You iterate through the array, check if the element (key) already exists in the map.
   If it does, you increment the count; if not, you add it to the map with an initial count of 1.
  3)Printing Results: Finally, you iterate through the map to print each element and its corresponding count.
 */
public class OccurrenceInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        findOccurrence1(arr);
        findOccurrence2(arr);
        findOccurrence3(arr);

    }

    private static void findOccurrence3(int[] arr) {
        System.out.println("Third Approch");
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int count = 0;
            if(map.containsKey(key)) count = map.get(key);
            count++;
            map.put(key,count);
        }
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            /*
            The getOrDefault method in Java is a handy utility provided by the Map interface.
            It allows you to retrieve the value associated with a specific key in the map.
            If the key is not present in the map, instead of returning null, it returns a default value that you specify.
            This method simplifies the code, especially when dealing with maps where you want to handle missing keys in a specific way.
             */
        }
        for(Map.Entry<Integer,Integer> set:map.entrySet()){
            System.out.println(set.getKey() + " " + set.getValue() + " Times");
        }

    }

    private static void findOccurrence2(int[] arr) {
        System.out.println("Second Approach : ");
        int n = arr.length;
        int[] hash = new int[n];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(hash[i]!=0){
                System.out.println(i + " " + hash[i] + " Times");
            }
        }
    }

    private static void findOccurrence1(int[] arr) {
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        System.out.println("First Approach");
        int n = arr1.length;
//        for(int i=0;i<n;i++){
//            int count = 1;
//            if(arr[i]!=-1) {
//                for (int j = 0; j < n; j++) {
//                    if (arr[i] == arr[j] && i != j) {
//                        count++;
//                        arr[j] = -1;
//                    }
//                }
//                System.out.println(arr[i] + " " + count + " Times");
//            }
        for(int i=0;i<n;i++){
            if(arr1[i]==-1)
                continue;
            int count = 1;
            for(int j = i+1;j<n;j++){
                if(arr1[i]==arr1[j]){
                    count++;
                    arr1[j] = -1;
                }
            }
            System.out.println(arr1[i] + " " + count + " Times");
        }
    }

}
