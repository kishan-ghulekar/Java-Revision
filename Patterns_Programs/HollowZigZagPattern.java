import java.util.*;
class HollowZigZag{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		for(int i=0;i<rows;i++){
		
			for(int j=0;j<rows;j++){
			
				if(j==i || j==rows-i-1){
				
					System.out.print("*");
				}else{
				
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

/*
Output for rows = 5

*   *
 * *
  *
 * *
*   *


Logic:
The important condition is:
if (j == i || j == n - i - 1)

There are two diagonals:
j == i → left-to-right diagonal \
j == n - i - 1 → right-to-left diagonal /
*/
