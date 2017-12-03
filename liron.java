package HomeWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class liron {

	public static void main(String[] args) throws InterruptedException, IOException {
		File file1 =	 new File("c:\\temp\\1.txt");
		file1.createNewFile();
		 FileWriter fw = new FileWriter(file1.getAbsoluteFile());
		 fw.write("liron");
		 fw.close();
	}
}
