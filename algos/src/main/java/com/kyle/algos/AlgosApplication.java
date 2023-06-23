package com.kyle.algos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//
//For example, the square matrix  is shown below:
//
//1 2 3
//4 5 6
//9 8 9  
//The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
//
//Function description
//
//Complete the  function in the editor below.
//
//diagonalDifference takes the following parameter:
//
//int arr[n][m]: an array of integers
//Return
//
//int: the absolute diagonal difference

@RestController
@SpringBootApplication
public class AlgosApplication {

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int d1 = 0;
		int d2 = 0;
		int j = 0;
		int k = arr.size() - 1;
		for(int i = 0; i < arr.size(); i++){
			d1+= arr.get(i).get(j);
			d2+=arr.get(i).get(k);
			j++;
			k--;
		}
		return Math.abs(d1 - d2);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AlgosApplication.class, args);
		List<List<Integer>> listOfLists = new ArrayList<>();
		List <Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(2);
		list1.add(4);
		List <Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		List <Integer> list3 = new ArrayList<>();
		list3.add(10);
		list3.add(8);
		list3.add(-12);
		listOfLists.add(list1);
		listOfLists.add(list2);
		listOfLists.add(list3);
		System.out.println(diagonalDifference(listOfLists));
	}
	
	
	

}
