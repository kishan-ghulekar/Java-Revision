import java.util.*;
class LeapYear{

	public static void leapYear(int year){
	
		if(year % 400==0){
		
			System.out.println(year+" is a leap year");
		}else if(year % 100 ==0){
		
			System.out.println(year+" is not a leap year");
		}else if(year % 4==0){
		
			System.out.println(year+" is a leap year");
		}else{
		
			System.out.println(year+" is not a leap year");
		}
	}
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year to check leap or not:");
		int leapYear=sc.nextInt();

		leapYear(leapYear);

		sc.close();
	}
}

/*

Enter a year: 2000
2000 is a Leap Year

Enter a year: 1900
1900 is Not a Leap Year 

Enter a year to check leap or not:
2020
2020 is a leap year

Enter a year to check leap or not:
2600
2600 is not a leap year

*/

