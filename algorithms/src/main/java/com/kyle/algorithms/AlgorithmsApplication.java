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
		plusMinus.algo(list1);
	}
}
