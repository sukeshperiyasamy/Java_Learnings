package com.leeetcode;

import java.util.ArrayList;

public class MultipledsOfFifteen

{
//TODO 
	/*
	 * The Arrays are given like nums = [3,5,15,6,7,4,1] if the num is divisible by
	 * 3 return as biss if the num is divisible by 5 return as buss if the num is
	 * divisible by both it should return as bissbuss else it return the num as
	 * string solution ["biss,"buss,"bissbuss","biss","7","4","1"]
	 */

	public static void main(String[] args) {
		
		
		
ArrayList arr= new ArrayList(); 
		int nums[] = new int[] { 3, 5, 15, 6, 7, 4, 1 };

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 5 == 0 && nums[i] % 3 == 0) {
//				System.out.println("bissbuss");
				arr.add("bissbuss");
				continue;
			}

			else if (nums[i] % 3 == 0) {

//				System.out.println("biss");
				arr.add("biss");
				continue;
				
			} else if (nums[i] % 5 == 0) {
//				System.out.println("buss");
				arr.add("buss");
				continue;
			}
			else {
				String num=Integer.toString(i);
				arr.add(" ' "+ num +" ' ");
			
			}
			
			
		}
		System.out.println(arr);
	}

}
