package advance.generics;

public class Printer<T> {
	private T t;
	
	
	public Printer(T t) {
		this.t = t;
	}
	public void print() {
		System.out.println(t);
	}
}
