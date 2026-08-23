import java.util.*;
class HeartPattern{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		// Upper part of heart
		for (int i = 0; i < rows; i++) {

    			// Left spaces
    			for (int j = 0; j < rows - i - 2; j++) {
     				System.out.print(" ");
    			}

    			// Left stars
    			for (int j = 0; j < i + 2; j++) {
        			System.out.print("*");
    			}

    			// Middle spaces
    			for (int j = 0; j < 2 * (rows - i) - 3; j++) {
        			System.out.print(" ");
    			}
	
    			// Right stars
   			for (int j = 0; j < i + 2; j++) {
        			System.out.print("*");
    			}

    			System.out.println();
		}



		// Lower part of heart
		for (int i = 0; i < rows; i++) {

   			// Left spaces
    			for (int j = 0; j < i; j++) {
        			System.out.print(" ");
    			}

    			// Stars
    			for (int j = 0; j < 2 * (rows - i) + 1; j++) {
        			System.out.print("*");
    			}
	
  	  		System.out.println();
		}
		
	}
}

/*
Output:

  **   **
 **** ****
***********
 *********
  *******
   *****
    ***
     *

*/
