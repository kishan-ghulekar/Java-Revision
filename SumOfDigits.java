import java.util.*;
class Sum_Of_Digits{

	static int sumDigit(int num){
	
		int sum=0;

		while(num!=0){
		
			int last=num%10;
			sum+=last;
			num/=10;
		}
		return sum;
	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();

		System.out.println("Sum of Digit of your number is "+sumDigit(num));
	}
}
