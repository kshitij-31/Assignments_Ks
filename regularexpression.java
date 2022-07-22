import java.util.regex.*;
public class regularexpression {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "5789453586"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "4635892556"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "8478563338"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9256312587"));


	}

}
