import java.util.*;
class RightTriangle{

	public static void rightTriangle(int rows){
	
		for(int i=1;i<=rows;i++){
		
			for(int j=1;j<=rows-i;j++){
			
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
			
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		rightTriangle(rows);
	}
}

/*
Output:
Enter number of rows: 5

	*
      * *
    * * *
  * * * *
* * * * *


Program Implementation:

1.Takes the number of rows as input from the user.
2.Uses nested for loops.
3.The first inner loop prints the required spaces before each row.
4.The second inner loop prints the stars (*).
5.As the row number increases, the number of spaces decreases and the number of stars increases, forming a right-aligned triangle.


*/
