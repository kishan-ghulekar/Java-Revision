import java.util.*;
class CheckPalindrome{

	public static void isPalindrome(int n){
	
		int reverse=0,temp;
		temp=n;
		while(n>0){
		
			reverse=reverse*10+n%10;
			n/=10;
		}

		if(temp==reverse){
		
			System.out.println("The given number is palindrome");
		}else{
		
			System.out.println("The given number is not palindrome");
		}
	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		isPalindrome(num);
	}
}
