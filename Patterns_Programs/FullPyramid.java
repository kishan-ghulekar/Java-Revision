import java.util.*;
class FullPyramid{

	public static void fullPyramid(int rows){
	
		for(int i=1;i<=rows;i++){
		
			for(int j=1;j<=rows-i;j++){
			
				System.out.print(" ");
			}

			for(int k=1;k<=(2*i-1);k++){
			
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		fullPyramid(rows);
	}
}

/*
Full Pyramid Pattern in Java
This Java program prints a Full Pyramid Star Pattern using nested loops.

Features:
- Accepts the number of rows as user input.
- Prints a centered full pyramid using `*`.
- Uses nested `for` loops to manage spaces and stars.
- Demonstrates basic pattern programming concepts in Java.

Example Output:
Enter the number of rows: 5

    *
   ***
  *****
 *******
*********


Concepts Used:
- Java Methods
- Scanner Class
- Nested Loops
- Pattern Printing
- User Input Handling
*/
