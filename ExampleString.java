import java.lang.String;
public class ExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Gambling";
		System.out.println(s1);
		System.out.println(s1.length());
		
		String a=new String("Innovation");
		System.out.println(a.substring(3));
		
		String s2="good";
		String s3="gior";
		System.out.println(s2.compareTo(s3));
		
		// STRING BUFFER
		
		System.out.println("\n String Buffer:");
		
		StringBuffer s5=new StringBuffer("Welcome to my world. ");
		s5.append("Have some party.");
		System.out.println(s5);
		
		// STRING BUILDER
		System.out.println("\n String Bulider :");
		StringBuilder b= new StringBuilder("Love is");
		b.append(" in the");
		b.append(" Air.");
		System.out.println(b);
		
				

	}

}
