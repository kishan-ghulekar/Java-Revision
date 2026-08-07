// Pascal's Triangle
import java.util.*;
class  PascalsTriangle{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		for(int i=0;i<rows;i++){
		
			//print spaces
			for(int j=0;j<rows-i-1;j++){
			
				System.out.print(" ");
			}
			int num=1;
			//Print pascal's Triangle values
			for(int j=0;j<=i;j++){
			
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
		sc.close();
	}
}

/*
Features:
* Accepts the number of rows as user input.
* Prints a centered Pascal's Triangle.
* Uses nested `for` loops to print spaces and values.
* Calculates each number using the combination formula.
* Demonstrates pattern printing and mathematical logic in Java.


Example Output:
Enter the number of rows:
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1


Concepts Used:
* Java Methods
* Scanner Class
* Nested Loops
* Pattern Printing
* Mathematical Formula (Binomial Coefficients)
* User Input Handling


Logic:
1. Read the number of rows from the user.
2. Use the outer loop to iterate through each row.
3. Print leading spaces to center the triangle.
4. Initialize `num = 1` at the beginning of every row.
5. Use the inner loop to print the values in the current row.
6. Calculate the next value using the formula:

Move to the next line after completing each row.

Time Complexity:
O(n²)**, where **n** is the number of rows.
Space Complexity
O(1)** (constant extra space).

*/
