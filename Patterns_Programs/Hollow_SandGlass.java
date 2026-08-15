//Hollow SandGlass
import java.util.*;
class HollowSandglassPattern{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();

		//Upper half
		for(int i=0;i<rows;i++){
		
			//spaces
			for(int j=0;j<i;j++){
			
				System.out.print(" ");
			}

			//stars
			for(int j=0;j<2*(rows-i)-1;j++){
			
				if(i==0 || j==0 || j==2*(rows-i)-2){
				
					System.out.print("*");
				}else{
				
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		//Lower Half
		for(int i=1;i<rows;i++){
		
			//spaces
			for(int j=0;j<rows-i-1;j++){
			
				System.out.print(" ");
			}

			//stars
			for(int j=0;j<2*i+1;j++){
			
				if(i==rows-1 || j==0 || j==2*i){
				
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
Output:
For n = 5:
*********
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*********


📌 Key Logic:
The upper half decreases in width.
The lower half increases in width.
Spaces are used to create the sandglass shape.
Only the first row, last row, and boundary positions contain *.
The middle area remains hollow. 
*/
