import java.util.*;
class InvertedPyramid{

	public static void invertedPyramid(int rows){
	
		for(int i=rows;i>=1;i--){
		
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

		invertedPyramid(rows);
	}
}
/*
Output:
Enter the number of rows:
5

*********
 *******
  *****
   ***
    *
┌────────────────────────────────────────────────────────────────────────────────────────────┐
│                           Inverted Pyramid Program Explanation                             │
├────────────────────────────────────────────────────────────────────────────────────────────┤
│ • import java.util.*;                                                                      │
│   - Imports the Scanner class to take input from the user.                                │
│                                                                                            │
│ • class InvertedPyramid                                                                    │
│   - Defines a class named InvertedPyramid.                                                 │
│                                                                                            │
│ • public static void invertedPyramid(int rows)                                             │
│   - Creates a method to print the inverted pyramid pattern.                                │
│                                                                                            │
│ • for(int i = rows; i >= 1; i--)                                                           │
│   - Outer loop controls the rows, starting from the last row to the first.                │
│                                                                                            │
│ • for(int j = 1; j <= rows - i; j++)                                                       │
│   - Prints the required leading spaces before the stars.                                  │
│   - The number of spaces increases with each row.                                          │
│                                                                                            │
│ • for(int k = 1; k <= (2 * i - 1); k++)                                                    │
│   - Prints the stars (*) for each row.                                                     │
│   - The number of stars decreases by 2 in every row (9, 7, 5, 3, 1...).                   │
│                                                                                            │
│ • System.out.println();                                                                    │
│   - Moves the cursor to the next line after printing one row.                              │
│                                                                                            │
│ • Scanner sc = new Scanner(System.in);                                                     │
│   - Creates a Scanner object to read input from the user.                                  │
│                                                                                            │
│ • int rows = sc.nextInt();                                                                 │
│   - Reads the number of rows entered by the user.                                          │
│                                                                                            │
│ • invertedPyramid(rows);                                                                   │
│   - Calls the method to print the inverted pyramid pattern.                                │
│                                                                                            │
│ Overall: This program uses nested for loops to print an inverted pyramid pattern.          │
│ The outer loop controls rows, the first inner loop prints spaces, and the second           │
│ inner loop prints decreasing odd numbers of stars to form the pattern.                     │
└────────────────────────────────────────────────────────────────────────────────────────────┘
*/

      
