package exception.handling;

public class Sleep {
	public static void main(String[] args) {
		try {
			String[] sheep = new String[3];
			System.out.println(sheep[3]);
		} catch (Exception e) {
			System.out.println("Awake");
		}finally {
//			throw new Exception(); // much add throws Exceptoin in method declaration 
		}
	}

}
