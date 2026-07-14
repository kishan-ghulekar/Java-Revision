import java.util.*;
class InvertedLeftTriangle{

	public static void leftTriangle(int rows){
	
		for(int i=rows;i>=1;i--){
		
			for(int j=0;j<rows-i;j++){
			
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
			
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		leftTriangle(rows);
	}
}
/*
Output:

Enter the number of rows:
5

*****
 ****
  ***
   **
    *
    *



Topic: Inverted Left Triangle Pattern

📖 Explanation

In this program, the user enters the number of rows. The program uses nested loops to print an inverted left triangle.

The outer loop (i) runs from rows down to 1, controlling the number of rows.
The first inner loop (j) prints leading spaces (rows - i) so that the triangle shifts to the right on each new line.
The second inner loop (k) prints i stars (*), decreasing by one in every row.
After printing each row, System.out.println() moves the cursor to the next line.
*/
