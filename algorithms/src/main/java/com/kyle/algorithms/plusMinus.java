package com.kyle.algorithms;

import java.util.List;

//Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
//
//Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
//
//Example
//
//There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
//
//0.400000
//0.400000
//0.200000

public class plusMinus {

	public static void algo(List<Integer> arr) {
	    // Write your code here
	    double positive = 0;
	    double negative = 0;
	    double zero = 0;
	    for(int i = 0; i < arr.size(); i++){
	        if(arr.get(i) > 0){
	            positive++;
	        }
	        else if(arr.get(i) < 0){
	            negative++;
	        }
	        else{
	            zero++;
	        }
	    }
	    System.out.printf("%.6f %n", positive / arr.size());
	    System.out.printf("%.6f %n", negative / arr.size());
	    System.out.printf("%.6f %n", zero / arr.size());
	    } 

}
