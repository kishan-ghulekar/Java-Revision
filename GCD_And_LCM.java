import java.util.*;
class GCD_And_LCM{

	public static int gcdAndLcm(int a,int b){
	
		while(b!=0){
		
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int a=sc.nextInt();
		int b=sc.nextInt();

		int gcd=gcdAndLcm(a,b);

		System.out.println("GCD:"+gcd);
	       	System.out.println("LCm:"+(a*b)/gcd);	
	}
}
/*
----Sample Output----
Enter two number:
24
18
GCD:6
LCM:72


Enter two number:
15
20
GCD:5
LCM:60


*/

/*
Implemented a Java program to find the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers using the Euclidean Algorithm.
The program efficiently calculates the GCD by repeatedly replacing the larger number with the remainder of dividing it by the smaller number until the remainder becomes zero.	 
It then computes the LCM using the formula LCM = (a × b) / GCD. 
This implementation demonstrates methods, loops, mathematical algorithms, modular arithmetic (%), user input handling, and code reusability in Java.
*/
