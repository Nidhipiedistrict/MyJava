package com.example;

public class TaskSwap {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		int temp = a; // temp =5
		a = b; // a=10
		b = temp; // b=5
		
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}
}