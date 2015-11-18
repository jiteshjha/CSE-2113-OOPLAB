import java.util.*;
import java.io.*;

public class q2 {
	public static void main(String ... args) throws IOException {
		String whitespace = "\t \n \r";
		int lines = 0, words = 0, characters = 0, numbers = 0;
		InputStream inputStream = new FileInputStream("fileNames.txt");
		Reader inputStreamReader = new InputStreamReader(inputStream);

		int data = inputStreamReader.read();
		
		while(data != -1) {
			characters++;
  			char theChar = (char) data;
			if(Character.isDigit(theChar)) numbers++;
			if(theChar == '\n') lines++;
			else if(theChar == ' ') words++;
    			data = inputStreamReader.read();
	
		}
		inputStreamReader.close();

		System.out.println("Lines: " + lines);
		System.out.println("Numbers: " + numbers);
		System.out.println("Characters: " + characters);
		System.out.println("Words: " + (lines + words));
	}
}
