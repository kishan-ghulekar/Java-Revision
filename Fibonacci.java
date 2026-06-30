//Fibonacci Series 
import java.util.*;

class Fibonacci{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();

		int a=0 ,b=1;

		System.out.println("Fibonacci Series:");
		for(int i=1;i<=n;i++){
		
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
	}


}

/*
Description:
This Java program prints the Fibonacci series up to the number of terms entered by the user. It takes input using the Scanner class and generates the sequence using a for loop.
The Fibonacci sequence starts with 0 and 1, and each subsequent number is the sum of the previous two numbers.

Example:

Input:
10

Output:
Fibonacci Series:
0 1 1 2 3 5 8 13 21 34

Features:
1.Accepts the number of terms from the user.
2.Uses a for loop to generate the Fibonacci sequence.
3.Demonstrates the use of variables, loops, and user input in Java.
4.Simple and beginner-friendly implementation.
*/
