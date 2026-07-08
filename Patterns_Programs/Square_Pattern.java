import java.util.*;
class Square{

	public static void squarePattern(int rows){
	
		for(int i=1;i<=rows;i++){
		
			for(int j=1;j<=rows;j++){
			
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows=sc.nextInt();
		squarePattern(rows);
	}
}

/*

# Square Pattern in Java

This Java program prints a square star (`*`) pattern based on the number of rows entered by the user. It demonstrates the use of **nested `for` loops**, where the outer loop controls the number of rows and the inner loop prints the stars in each row.

### Features

* Accepts the size of the square from the user.
* Prints an `N × N` square pattern of stars.
* Uses a separate method (`squarePattern()`) to improve code readability and reusability.
* Helps beginners understand the concept of nested loops in Java.

Input:
Enter number of rows:
4

Output:
* * * *
* * * *
* * * *
* * * *

Logic:

* The **outer loop** iterates through each row.
* The **inner loop** prints the required number of stars for each row.
* After printing one row, `System.out.println()` moves the cursor to the next line.


*/
