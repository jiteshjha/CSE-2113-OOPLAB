
import java.io.*;
import java.util.*;
public class q1 {

	public void listf(String directoryName) {
		File directory = new File(directoryName);
		File[] fList = directory.listFiles();
		try {
		for (File file : fList) {
			if (file.isFile()) {
				System.out.println("File " + file.getName());
				
			} else if (file.isDirectory()) {
				System.out.println("Directory " + file.getCanonicalPath());
				listf(file.getAbsolutePath());
			}
		}
		}
		catch(IOException e) {
			System.out.print(e);
		}
	}

	public static void main(String ... args) {
		//ArrayList<File> files = new ArrayList<File>();
		q1 q = new q1();
		q.listf(".");
	}
}
	
