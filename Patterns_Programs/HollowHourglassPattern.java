//HollowHourglassPattern

import java.util.*;
class HollowHourglassPattern{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		//Upper Half
		for(int i=0;i<rows;i++){
		
			//print leading spaces
			for(int j=0;j<i;j++){
			
				System.out.print(" ");
			}

			//print stars and inner spaces
			for(int j=0;j<2*(rows-i)-1;j++){
			
				if(j==0 || j==2*(rows-i)-2 ||i==0){
				
					System.out.print("*");
				}else{
				
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		//Lower Half
		for(int i=1;i<rows;i++){
		
			//Print leading spaces
			for(int j=0;j<rows-i-1;j++){
			
				System.out.print(" ");
			}

			//print stars and inner spaces
			for(int j=0;j<2*i+1;j++){
			
				if(j==0 || j==2*i || i==rows-1){
				
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
Enter the number of rows:
5
*********
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*********


🔶 Hollow Hourglass Pattern in Java
📖 Overview


Today I practiced the Hollow Hourglass Pattern in Java. This pattern creates an hourglass shape using * characters, where only the boundary stars are printed and the inner portion remains empty.

The pattern is divided into two parts:

Upper Half – Prints an inverted hollow triangle.
Lower Half – Prints a normal hollow triangle.
The first and last rows contain only stars.
Spaces are used to create the hollow portion and proper alignment.

🎯 What I Learned
Using nested for loops for pattern printing.
Printing leading spaces to maintain alignment.
Printing stars only at the boundary positions.
Using conditions to create the hollow effect.
Dividing a complex pattern into upper and lower halves.
Understanding how the number of spaces and stars changes for each row.

🧠 Pattern Logic
For the upper half:

Leading spaces increase with each row.
The number of characters decreases.
Stars are printed at the first and last positions.
The first row contains all stars.

For the lower half:

Leading spaces decrease with each row.
The number of characters increases.
Stars are printed at the first and last positions.
The last row contains all stars.


*/
