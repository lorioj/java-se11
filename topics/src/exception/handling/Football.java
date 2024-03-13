package exception.handling;

public class Football {
	
	public static void main(String[] args) {
		
		//output is ABD followed by stacktrace
		try {
			System.out.println("a");
			throw new ArrayIndexOutOfBoundsException();
		}catch(RuntimeException r){
			System.out.println("B");
			throw r;
		}catch(Exception e) {
			System.out.println("C");
		}finally {
			System.out.println("D");
		}
	}

}
