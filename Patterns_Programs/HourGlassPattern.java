//HourGlass Pattern

import java.util.*;
class HourGlass{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		//Upper Half
		for(int i=0;i<rows;i++){
		
			//spaces
			for(int j=0;j<i;j++){
			
				System.out.print(" ");
			}

			//stars
			for(int j=0;j<2*(rows-i)-1;j++){
			
				System.out.print("*");
			}
			System.out.println();
		}

		//Lower Half

		for(int i=1;i<rows;i++){
		
			//spaces
			for(int j=0;j<rows-i-1;j++){
			
				System.out.print(" ");
			}

			//stars
			for(int j=0;j<2*i+1;j++){
			
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*

Output for n = 5
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********

Logic:
Upper half: Number of stars decreases while spaces increase.
Lower half: Number of stars increases while spaces decrease.
2 * (n - i) - 1 controls the stars in the upper half.
2 * i + 1 controls the stars in the lower half.
Nested loops are used for spaces and stars.
*/
