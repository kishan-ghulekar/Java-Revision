import java.util.*;
class Armstrong{

	public static int isArmstrong(int num){
	
		int temp=num;
		int count=0;
		int sum=0;

		while(temp>0){
		
			count++;
			temp/=10;
		}
		temp=num;

		while(temp>0){
		
			int digit=temp%10;

			int power=1;
			for(int i=1;i<=count;i++){
			
				power*=digit;

			}

			sum+=power;
			temp/=10;
		}

		return sum;
	}

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter  a Number:");
		int n=sc.nextInt();
		
		int returnSum=isArmstrong(n);
		if(n ==returnSum){
                        count++;
                        temp/=10;
                }
                temp=num;

                while(temp>0){

                        int digit=temp%10;

                        int power=1;
                        for(int i=1;i<=count;i++){

                                power*=digit;

                        }

                        sum+=power;
                        temp/=10;
                }

                return sum;
        }

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);

                System.out.println("Enter  a Number:");
                int n=sc.nextInt();

                int returnSum=isArmstrong(n);
                if(n ==returnSum){

                        System.out.println("The given number is armstrong");
                }else{

                        System.out.println("The given number is not armsteong");
                }
        }
}		
			System.out.println("The given number is armstrong");
		}else{
		
			System.out.println("The given number is not armsteong");
		}
	}
}

/*
# Armstrong Number in Java

##Overview

This Java program checks whether a given number is an **Armstrong Number** without using the built-in `Math.pow()` method. Instead, it calculates the power of each digit manually using loops, helping to strengthen the understanding of number manipulation and algorithmic logic.

##Features

* Accepts user input from the console.
* Counts the total number of digits.
* Extracts each digit using the modulus (`%`) operator.
* Calculates the power of each digit manually using a `for` loop.
* Compares the calculated sum with the original number.
* Displays whether the number is an Armstrong number or not.

##Concepts Used

* Loops (`while`, `for`)
* Methods
* Integer division
* Modulus operator (`%`)
* Number manipulation
* Conditional statements

##Example

**Input:**
153

**Output:**
The given number is Armstrong.


**This implementation avoids `Math.pow()` to demonstrate the underlying logic behind Armstrong number calculation.

*/
