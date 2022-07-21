package Assignment2;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit Type Casting is in process >>");
		char a='Z';
		System.out.println("Value of a is "+a);
		int b=a;
		System.out.println("Value of b is "+b);
		
		float c=a;
		System.out.println("Value of c is "+c);
		
		long d=a;
		System.out.println("Value of d is "+d);
		
		double e=a;
		System.out.println("Value of e is "+e);
		
		
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting is in process >>");
		//explicit conversion
		
		double x=105.258;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}



