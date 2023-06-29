package com.kyle.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmsApplication { 

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmsApplication.class, args);
		List <Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(1);
		list1.add(-1);
		list1.add(-1);
		List <Integer> list3 = new ArrayList<>();
		list3.add(3);
		list3.add(2);
		list3.add(1);
		list3.add(3);
		List <Integer> list2 = new ArrayList<>();
		list2.add(256741038);
		list2.add(623958417);
		list2.add(467905213);
		list2.add(714532089);
		list2.add(938071625);
		plusMinus.algo(list1);
		Staircase.algo(4);
		MiniMaxSum.algo(list2);
		System.out.println(BirthdayCakeCandles.algo(list3));
		System.out.println(TimeConversion.algo("02:05:45AM"));
	}
}
