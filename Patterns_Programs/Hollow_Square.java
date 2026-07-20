import java.util.*;
class HollowSquare{

	public static void hollowSquare(int rows){
	
		for(int i=1;i<=rows;i++){
		
			for(int j=1;j<=rows;j++){
			
				if(i==1 || i==rows || j==1 || j==rows){
				
					System.out.print("*");
				}else{
				
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		hollowSquare(rows);
	}
}

/*
Hollow Square Pattern Explanation

1. The outer loop (i) controls the rows and runs from 1 to n.
2. The inner loop (j) controls the columns and also runs from 1 to n.
3. A star (*) is printed when:
      - i == 1  → First row
      - i == n  → Last row
      - j == 1  → First column
      - j == n  → Last column
4. For all other positions, spaces are printed to create the hollow area.
5. After each row is completed, println() moves the cursor to the next line.

Time Complexity: O(n²)
Space Complexity: O(1)

Output for rows = 5:

* * * * *
*       *
*       *
*       *
* * * * *
*/
