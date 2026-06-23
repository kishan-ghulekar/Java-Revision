class EvenOdd{

	boolean evenOdd(int n){
	
		if(n%2==0)
			return true;
		else
			return false;
	}


	public static void main(String[]args){
	
		EvenOdd obj=new EvenOdd();
		System.out.println(obj.evenOdd(10));
	}
}
