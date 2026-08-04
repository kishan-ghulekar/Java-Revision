//Inverted Triangle Number Pattern

import java.util.*;
class InvertedNumberTriangle{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		for(int i=rows;i>=1;i--){
		
			for(int j=1;j<=i;j++){
			
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
---Sample Output---
Enter number of rows: 5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1


1. The outer loop starts from n and decreases to 1.
2. Each iteration represents one row.
3. The inner loop prints numbers from 1 up to the current row value.
4. After printing each row, println() moves the cursor to the next line.
5. The number of elements decreases by one in every row, forming an inverted triangle.
*/
