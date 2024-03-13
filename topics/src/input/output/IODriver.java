package input.output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IODriver {

	public static void main(String[] args) {
//		writeToFileUsingBufferedWriter();
//		readFromFileUsingBufferedReader();
		createUsingFile();
		
	}
	
	static void createUsingFile() {
	
		try {
			File f =new File("file.txt"); //
//			f.mkdir(); //create folder
			f.createNewFile(); // create new file
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //create new file
		
	}
	
	static void writeToFileUsingBufferedWriter() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("io.txt"));
			bw.write("Hello World");
			bw.close();
		} catch (IOException e) {
		}
	}
	
	static void readFromFileUsingBufferedReader() {
		try {
			BufferedReader  br = new BufferedReader(new FileReader("io.txt"));
			StringBuilder sb = new StringBuilder();
			
			String line = null;
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			System.out.println(sb);
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
