import java.util.*;
public class AlphabetPyramid{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		for(int i=1;i<=rows;i++){
		
			//Spaces
			for(int j=1;j<rows-i;j++){
			
				System.out.print("  ");
			}

			//Alphabets
			for(int j=1;j<=i;j++){
			
				 System.out.printf((char)(64 + j)+" ");
			}
			System.out.println();
		}
	}
}

/*
 
Output:
Enter the number of rows: 5
        A
      A B
    A B C
  A B C D
A B C D E


🧠 Explanation:
The outer for loop controls the number of rows.
The first inner loop prints spaces before the alphabets to center the pyramid.
(n - i) * 2 calculates the required spaces for each row.
The second inner loop prints the alphabets.
(char)(64 + j) converts numbers into uppercase alphabets:
65 → A
66 → B
67 → C
68 → D
69 → E
System.out.println() moves the cursor to the next line.

🎯 What I Learned:
Using nested for loops for pattern printing.
Printing spaces and alphabets together.
Using ASCII values to generate alphabets.
Creating a centered pyramid pattern in Java.
*/
