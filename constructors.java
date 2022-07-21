package Assistedproject;

public class constructors {
	int id;
	String name;
	
	constructors(int i, String n){
		id =i;
		name =n;
		
	}
	 void display() {
		 System.out.println(+id+ " is the roll number of " +name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructors c=new constructors(432, "Ankit.");

		constructors d=new constructors(454, "John.");
		c.display();
		d.display();

	}

}
