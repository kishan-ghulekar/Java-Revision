import java.util.*;
class InvertedRightTriangle{

	public static void invertedRightTriangle(int rows){

		for(int i=rows;i>=1;i--){
		
			for(int j=1;j<=i;j++){
			
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows=sc.nextInt();

		invertedRightTriangle(rows);
	}
}

/*

Input:
Enter number of rows:
5


Output:
* * * * *
* * * *
* * *
* *
*


Concepts Practiced:
- ✅ Nested `for` loops
- ✅ User input using `Scanner`
- ✅ Method creation and calling
- ✅ Pattern printing logic
- ✅ Loop control with decreasing iterations
*/
