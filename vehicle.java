package Assignment_4;
//overriding example

public class vehicle {
	void colour() {
		System.out.println("Colour of bike is Blue");
	}
}
	
	class bike extends vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike obj=new bike();
		obj.colour();

	}

}

