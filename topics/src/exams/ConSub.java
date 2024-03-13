package exams;

public class ConSub extends ConSuper{
	ConSub() {
		System.err.println("3");
	}
	ConSub(int a){
		super(3);
		System.err.println(a);
	}
	
	public static void main(String[] args) {
		new ConSub(4);
	}
}
