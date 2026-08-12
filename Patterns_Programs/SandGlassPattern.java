//SandGlass Pattern

import java.util.*;
class SandGlass{

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
		
			for(int j=0;j<rows-i-1;j++){
			
				System.out.print(" ");
			}

			for(int j=0;j<2*i+1;j++){
			
				System.out.print("*");
			}
			System.out.println();
		}
	sc.close();	
	}

}


/*

Output for rows = 5
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********


1. Upper Half
for (int i = 0; i < rows; i++)
Controls the number of rows in the upper half.
As i increases, the number of spaces increases.
The number of stars decreases.


2. Printing Spaces
for (int j = 0; j < i; j++) {
    System.out.print(" ");
}
Prints spaces before the stars.
In each new row, one additional space is printed.
This moves the stars toward the center.


3. Printing Stars
for (int j = 0; j < 2 * (rows - i) - 1; j++) {
    System.out.print("*");
}
Prints the stars in decreasing order.
For rows = 5, the number of stars is:
9 → 7 → 5 → 3 → 1


4. Lower Half
for (int i = 1; i < rows; i++)
Creates the bottom half of the sandglass.
The number of stars increases again.


5. Spaces in Lower Half
for (int j = 0; j < rows - i - 1; j++) {
    System.out.print(" ");
}
Prints decreasing spaces.
This moves the stars back toward the left.


6. Stars in Lower Half

for (int j = 0; j < 2 * i + 1; j++) {
    System.out.print("*");
}
Prints an increasing number of stars:
3 → 5 → 7 → 9
🎯 Key Concepts
Nested for loops
Pattern printing
Spaces and stars
Increasing and decreasing sequences
Understanding row and column relationships
*/
