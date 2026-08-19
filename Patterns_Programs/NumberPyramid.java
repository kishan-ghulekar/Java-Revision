//Continuous Number Pyramid
import java.util.*;
class NumberPyramid{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		int num=1;
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
Continuous Number Pyramid

For rows= 5, the pattern is:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

Logic:

Start num = 1.
The first row prints 1 number.
The second row prints 2 numbers.
The third row prints 3 numbers.
Continue increasing the number of elements in each row.
Increment num after every print.
*/
