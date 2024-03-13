package exams;

import java.io.FileNotFoundException;

public class ExSub extends ExSuper{
	public ExSub(int eCode, String msg, Throwable cause) {
		super(eCode, msg, cause);
	}
	
	public static void main(String[] args) {
		try {
			String param1 = "Oracle";
			if(param1.equalsIgnoreCase("oracle")) {
				throw new ExSub(9001, "APPLICATION ERROR-9001", new FileNotFoundException("Myfile.txt"));
			}
			throw new ExSuper(9001, new FileNotFoundException("Myfile.txt"));
		}catch(ExSuper ex) {
			System.err.println(ex.getMessage());
		}
	}
}
