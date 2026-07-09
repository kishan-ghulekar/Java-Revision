import java.util.*;
class RightTriangle{
	public static void rightTriangle(int rows){
	
		for(int i=1;i<=rows;i++){
		
			for(int j=1;j<=i;j++){
			
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows:");
		int rows=sc.nextInt();

		rightTriangle(rows);
	}
}

/*
Input:
Enter Number of Rows:
5

Output:
*
* *
* * *
* * * *
* * * * *


Logic:
The outer loop (i) controls the number of rows.
The inner loop (j) prints * from 1 to i.
After printing each row, System.out.println() moves to the next line.
*/
