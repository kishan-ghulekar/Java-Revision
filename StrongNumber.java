import java.util.*;
class StrongNumber{

	public static int factorial(int n){
	
		int fact=1;
		for (int i=1;i<=n;i++){
		
			fact*=i;
		}
		return fact;
	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();

		int temp=num;
		int sum=0;

		while(temp>0){
		
			int digit=temp%10;
			sum+=factorial(digit);
			temp/=10;
		}

		if(sum==num){
		
			System.out.println(num+" is a strong number.");
		}else{
		
			System.out.println(num+" is not a strong number.");
		}
	}
}

/*
Enter a number: 145
145 is a Strong Number

Enter a number: 123
123 is Not a Strong Number

Enter a number: 40585
40585 is a Strong Number

Enter a number: 2
2 is a Strong Number
*/
