package com.velocity.practice.example;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("Pratiksha");
		al.add(20);
		al.add("Pranoti");
		al.add(45);
		al.add("Shobha");
		for(Object o:al)
		{
			System.out.println(o);
		}
	}

}
