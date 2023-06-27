package com.kyle.algorithms;

//Staircase detail
//
//This is a staircase of size :
//
//   #
//  ##
// ###
//####
//Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
//
//Write a program that prints a staircase of size .
//
//Function Description
//
//Complete the staircase function in the editor below.
//
//staircase has the following parameter(s):
//
//int n: an integer
//Print
//
//Print a staircase as described above.
//
//Input Format
//
//A single integer, , denoting the size of the staircase.


public class Staircase {
	
	public static void algo(int n) {
		String steps = "#";
		String space = " ";
		for(int i = 1; i <= n; i++) {
			System.out.println(space.repeat(n-i) + steps.repeat(i));
		}
	    }

}
