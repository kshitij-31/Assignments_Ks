import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class appendFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("fileCreate.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(f, true);
			BufferedWriter b=new BufferedWriter(fw);
			b.write("\n Data add on");
			b.close();
			fw.close();
			System.out.println("Appended Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
