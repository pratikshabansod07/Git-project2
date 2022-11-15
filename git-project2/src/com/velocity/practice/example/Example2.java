package com.velocity.practice.example;

import java.util.HashSet;
import java.util.Iterator;

public class Example2 {

	public static void main(String[] args) {
	HashSet has=new HashSet();
	has.add("Pratiksha Bnasod");
	has.add("Pranoti Bnasod");
	has.add("Shobha Bnasod");
	
	has.forEach(e-> System.out.println(e));
	}

}
