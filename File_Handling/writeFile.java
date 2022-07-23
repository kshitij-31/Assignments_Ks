import java.io.FileWriter;
import java.io.IOException;

public class writeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter w;
		try {
			w = new FileWriter("fileCreate.txt");
			w.write("I am a good player \n I love to play volleyball.");
	        w.close();
	        System.out.println("Written Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error has occured");
			e.printStackTrace();
		}
	
		
		

}

}
