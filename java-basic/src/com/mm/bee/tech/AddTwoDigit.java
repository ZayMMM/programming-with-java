package com.mm.bee.tech;

import java.util.Scanner;

public class AddTwoDigit {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = scanner.nextInt();
		
		int result = num1 + num2;
		System.out.println("Result : " + result);
	}

}
