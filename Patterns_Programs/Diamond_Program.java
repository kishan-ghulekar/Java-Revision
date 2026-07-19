import java.util.*;
class Diamond_Pattern{

	public static void diamondPattern(int rows){
	
		for(int i=1;i<=rows;i++){
		
			for(int j=1;j<=rows-i;j++){
			
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++){
			
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=rows;i>=1;i--){
		
			for(int j=1;j<=rows-i;j++){
			
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++){
			
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		diamondPattern(rows);
	}
}

/*
Diamond Pattern = Full Pyramid + Inverted Pyramid

Upper Part:
Spaces = rows - i
Stars  = (2 * i) - 1

Lower Part:
Spaces = rows - i
Stars  = (2 * i) - 1

The upper half increases stars by 2 in each row,
while the lower half decreases stars by 2 in each row,
forming a Diamond Shape.
*/
