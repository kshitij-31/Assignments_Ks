package package1;
class paccess{
	private int hours=3;
	private int minutes=34;
	
}

public class privateAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paccess a=new paccess();
		System.out.println(a.hour);
		System.out.println(a.minutes);
		
		//error output because we use private access modifiers

	}

}
