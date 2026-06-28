class CheckPower{

	public static boolean isPower(int x,int y){
	
		//The only power of 1 is 1 itself
		if(x==1)
			return (y==1);

		//Repeatly Compute power of x

		long pow=1;

		while (pow <y)
			pow*=x;

		return (pow ==y);

	}
	public static void main(String[]args){
		
		System.out.println(isPower(10,1));
		System.out.println(isPower(1,20));
		System.out.println(isPower(2,128));
		System.out.println(isPower(2,30));
		
	}
}

/*
This Java program checks whether a given number y is a power of another number x.

The program starts with a value of 1 (which represents x⁰) and repeatedly multiplies it by x. This generates the sequence of powers:

1, x, x², x³, x⁴, ...

The multiplication continues until the generated power is greater than or equal to y.

If the generated power is exactly equal to y, the method returns true, indicating that y is a power of x.
If the generated power exceeds y without matching it, the method returns false.

The program also handles the special case where x = 1, since the only power of 1 is 1 itself.

Example
isPower(2, 128) → true because 2⁷ = 128
isPower(2, 30) → false because 30 is not a power of 2
isPower(10, 1) → true because 10⁰ = 1
isPower(1, 20) → false because no power of 1 equals 20
