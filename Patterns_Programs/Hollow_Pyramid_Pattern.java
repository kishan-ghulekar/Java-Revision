import java.util.*;
class Hollow_Pyramid_Pattern{

	public static void hollowPyramid(int n){
	
		for(int i=1;i<=n;i++){	

			//print spaces
			for(int j=1;j<=n-i;j++){
			
				System.out.print(" ");
			}

			//print stars
			for(int j=1;j<=(2*i-1);j++){
			
				if(i==n || j==1 || j==(2*i-1)){
				
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

		hollowPyramid(rows);
	}
}

/*
Output:
(n = 5)

    *
   * *
  *   *
 *     *
*********


Explanation:
The outer for loop controls the number of rows.
The first inner loop prints the leading spaces to center the pyramid.
The second inner loop prints 2 * i - 1 positions in each row.
A * is printed only:
at the first position of each row (j == 1),
at the last position of each row (j == (2 * i - 1)),
or in the last row (i == n).
All other positions print a space, creating the hollow effect.
*/
