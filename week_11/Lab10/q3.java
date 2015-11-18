import java.util.Scanner;
import java.io.*;

public class q3 {
	public static void main(String ... args) throws FileNotFoundException {
	Scanner in = null;
	Scanner scanner = new Scanner(System.in);
	String str = null;
	int line = 0;
	String search = null;
	System.out.printf("Enter word to be searched:\n>");
	search = scanner.nextLine();
	
		File file = new File("fileNames.txt");
		in = new Scanner(file);
		while(in.hasNext()) {
			str = in.nextLine();
			line++;
			if(str.contains(search))
				System.out.println(search + " found in line no. " + line + ": " + str);
		}
	}
}
	
		
