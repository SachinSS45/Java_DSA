package com.sachin;

import java.util.Arrays;

/*
75. Sort Colors
1)Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
2)We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
3)You must solve this problem without using the library's sort function.

 Example 1:
 Input: nums = [2,0,2,1,1,0]
 Output: [0,0,1,1,2,2]
 Example 2:
 Input: nums = [2,0,1]
 Output: [0,1,2]

Constraints:
n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.


Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 */
public class Sort012 {
    public static void sortColors(int[] nums){
        int[] hash = new int[3];
        for(int data : nums) hash[data]++;
        int index = 0;
        for(int i=0;i<3;i++)
        {
            int count = hash[i];
            while(count!=0){
                nums[index] = i;
                index++;
                count--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
