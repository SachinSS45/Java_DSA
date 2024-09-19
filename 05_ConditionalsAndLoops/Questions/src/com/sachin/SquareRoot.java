package com.sachin;/*
	Q.Square root of a number

	Input : n = 5
	Output : 2
	Explanation : Since , 5 is not perfect square, floor of square_root of 5 is 2.
*/

public class SquareRoot{

	public static int squareRoot(int num){
		int start=1;
		int end = num;
		while(start<end){
			int mid = end + (start-end)/2;
			if(mid*mid == num){
				return mid;
			}
			if(mid*mid < num){
				start = mid + 1;
			}else{
				end = mid-1;
			}
		}
		return end;
	}

	public static void main(String[] args){

		int num = 143;
		int i = 0;
		while(i*i <= num){
			i++;
		}
		if(i*i == num){
			System.out.println(i);
		}else{
			System.out.println(i-1);
		}
		int ans = squareRoot(num);
		System.out.println(ans);
	}
}
