import java.util.*;
class PerfectNumber{

	public static boolean isPerfect(int num){
	
		if(num<=1){
		
			return false;
		}
		int sum=1;

		for(int i=2;i<=num/2;i++){
		
			if(num%i==0){
			
				sum+=i;
			}
		}
		return sum == num;
	}
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a Number:");
		int n=sc.nextInt();

		if(isPerfect(n)){
		
			System.out.println(n+" is a perfect number");
		}else{
		
			System.out.println(n+" is not a perfect number");
		}
	}
}

/*
# Perfect Number Checker (Java)

## Description

The **Perfect Number Checker** is a simple Java console application that determines whether a given number is a **Perfect Number**. A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding the number itself).

The program accepts an integer input from the user, calculates the sum of all its proper divisors using a loop, and compares the sum with the original number. If both values are equal, the program displays that the number is a **Perfect Number**; otherwise, it reports that it is **not a Perfect Number**.

## Features

* Accepts user input using `Scanner`.
* Checks whether the entered number is a Perfect Number.
* Uses a separate method (`isPerfect()`) for better code organization.
* Demonstrates loops, conditional statements, methods, and mathematical logic.
* Provides clear and user-friendly output.

## Technologies Used

* Java
* Scanner Class
* Methods
* Loops (`for`)
* Conditional Statements (`if-else`)

## Example
Input:
28
Output:
28 is a Perfect Number
This project is ideal for beginners who want to practice Java fundamentals and understand divisor-based mathematical algorithms.

*/
