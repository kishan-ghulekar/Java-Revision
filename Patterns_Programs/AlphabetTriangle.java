import java.util.*;
class AlphabetTriangle{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		for(int i=1;i<=rows;i++){
		
			char ch='A';

			for(int j=1;j<=i;j++){
			
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println("");
		}
	}
}

/*
🔤 Alphabet Triangle Pattern 
Explanation:
The Alphabet Triangle Pattern is a pattern-printing program in Java that creates a triangular shape using alphabet characters. The number of alphabets increases in each row, starting from A.

🔹 How It Works:
1.The user enters the number of rows using Scanner.
2.The outer for loop controls the number of rows.
3.The inner for loop controls the number of alphabets printed in each row.
4.The character ch starts from A in every row.
5.ch++ is used to move to the next alphabet.
6.The number of alphabets increases as the row number increases.
7.System.out.println() moves the cursor to the next line after each row.


🎯 Concepts Practiced:
Nested for loops
Scanner for user input
Character variables
Character increment (ch++)
Pattern printing
Row and column control
Increasing pattern logic


📌 Example Output:
A
A B
A B C
A B C D
A B C D E
*/
