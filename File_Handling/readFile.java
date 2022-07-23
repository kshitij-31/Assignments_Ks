import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("fileCreate.txt");
		try {
			Scanner Reader = new Scanner(fl);
			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error to read the file");
			e.printStackTrace();
		}

	}

}
