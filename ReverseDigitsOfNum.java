import java.util.*;
class ReverseNum{

	static int reverseNum(int n){
	
		int revNum=0;
		while(n>0){
		
			revNum=revNum*10+n%10;
			n/=10;
		}

		return revNum;
	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();

		System.out.println("The reverse of given number : "+reverseNum(num));
	}
}
