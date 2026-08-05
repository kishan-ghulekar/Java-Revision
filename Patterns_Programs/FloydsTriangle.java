// Floyd's Triangle number pattern
//
import java.util.*;
class  FloydsTriangle{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		int num=1;
		System.out.println("Enter a number of rows:");
		int rows=sc.nextInt();

		for(int i=1;i<=rows;i++){
		
			for(int j=1;j<=i;j++){
			
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
/*
Floyd's Triangle Explanation:
1.The outer loop (i) controls the rows and runs from 1 to n.
2.The inner loop (j) prints numbers in each row and runs from 1 to i.
3.A variable num is initialized to 1.
4.In each iteration, the current value of num is printed.
5.After printing a number, num is incremented (num++) so the next consecutive number is printed.
6.After each row is completed, println() moves the cursor to the next line.

Time Complexity: O(n²)
Space Complexity: O(1)

Output for rows = 5:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
