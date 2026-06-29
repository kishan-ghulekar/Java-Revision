import java.util.*;
class FactNum{

	public static int factNum(int n){
	
		int ans=1;
		for(int i=2;i<=n;i++){
		
			ans *=i;
		}

		return ans;
	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();

		System.out.println("Factorial of "+num+" is "+factNum(num));
	}
}
