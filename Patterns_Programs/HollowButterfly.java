//HollowButterfly

import java.util.*;
class HollowButterfly{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		//Upper Half
		for(int i=1;i<=rows;i++){
		
			//Left Stars
			for(int j=1;j<=i;j++){
			
				if(j==1 || j==i){
				
					System.out.print("*");
				}else{
				
					System.out.print(" ");
				}
			}

			//Middle Spaces
			for(int j=1;j<=2*(rows-i);j++){
			
				System.out.print(" ");
			}

			//Right Stars

			for(int j=1;j<=i;j++){
			
				if(j==1 || j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		//Lower Half

		for(int i=rows;i>=1;i--){
		
			//Left Stars

			for(int j=1;j<=i;j++){
			
				if(j==1 || j==i)
					System.out.print("*");
				else
					System.out.print(" ");

			}

			//Middle Spaces
			
			for(int j=1;j<=2*(rows-i);j++){
			
				System.out.print(" ");
			}

			//Right Stars

			for(int j=1;j<=i;j++){
			
				if(j==1 || j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}

/*
Output:
Enter the number of rows:
5
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *




🦋 Hollow Butterfly Pattern – Explanation:

The Hollow Butterfly Pattern is a pattern-printing program in Java that creates a butterfly shape using * characters. Unlike the normal butterfly pattern, the inner area of each wing is hollow, so stars are printed mainly at the boundaries.

🔹 How It Works:
The pattern is divided into two halves:
Upper half → stars increase row by row.
Lower half → stars decrease row by row.
Two separate star sections represent the left and right wings.
Middle spaces separate the two wings.
A condition such as j == 1 || j == i prints stars only at the first and last positions, making the wings hollow.
Nested for loops are used to control rows, stars, and spaces.

🎯 Concepts Practiced:
Nested for loops
Conditional statements
Pattern printing
Managing spaces
Increasing and decreasing patterns
Boundary/hollow logic in patterns
 */
