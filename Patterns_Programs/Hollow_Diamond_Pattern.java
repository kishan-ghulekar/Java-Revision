import java.util.*;
class HollowDiamondPattern{

	public static void hollowDiamond(int n){
	
		//Upper Half
		for(int i=1;i<=n;i++){
		
			for(int j=1;j<=n-i;j++){
			
				System.out.print(" ");
			}

			for(int j=1;j<=(2*i-1);j++){
			
				if(j==1 || j==(2*i-1)){
				
					System.out.print("*");
				}
				else{
				
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		//Lower Half
		for(int i=n-1;i>=1;i--){
		
			for(int j=1;j<=n-i;j++){
			
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++){
			
				if(j==1 || j==(2*i-1)){
				
					System.out.print("*");
				}
				else{
				
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number:");
		int n=sc.nextInt();

		hollowDiamond(n);
	}
}

/*Output:
Enter the number:
5
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
 

┌─────────────────────────────────────────────────────────────────────────────┐
│                    Hollow Diamond Pattern – Explanation                     │
├─────────────────────────────────────────────────────────────────────────────┤
│ • Takes the number of rows (n) as input from the user.                     │
│                                                                             │
│ • The pattern is divided into two parts:                                    │
│   1. Upper Half                                                             │
│   2. Lower Half                                                             │
│                                                                             │
│ • The first loop prints the upper half by:                                  │
│   - Printing leading spaces.                                                │
│   - Printing stars only at the first and last positions.                    │
│   - Printing spaces between stars to create the hollow effect.              │
│                                                                             │
│ • The second loop prints the lower half using the same logic                │
│   in reverse order to complete the diamond shape.                           │
│                                                                             │
│ • The expression (2 * i - 1) generates odd numbers                          │
│   (1, 3, 5, 7, ...) to increase and decrease the width                      │
│   of each row symmetrically.                                                │
│                                                                             │
│ • Nested loops control rows, spaces, and stars, while                       │
│   conditional statements (if-else) print only the boundary                  │
│   stars, leaving the inside hollow.                                         │
├─────────────────────────────────────────────────────────────────────────────┤
│ Concepts Used:                                                              │
│ ✔ Nested Loops                                                              │
│ ✔ if-else Conditions                                                        │
│ ✔ Pattern Printing                                                          │
│ ✔ Space Management                                                          │
│ ✔ Symmetry Logic                                                            │
└─────────────────────────────────────────────────────────────────────────────┘
*/
