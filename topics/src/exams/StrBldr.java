package exams;

public class StrBldr {
	static StringBuilder sb1 = new StringBuilder("yo ");
	StringBuilder sb2 = new StringBuilder("hi ");
	
	StringBuilder foo(StringBuilder s) {
		System.out.println(s + " oh " + sb2);
		return new StringBuilder("ey");
	}
	
	public static void main(String[] args) {
		sb1 = sb1.append(new StrBldr().foo(new StringBuilder("hey")));
		System.out.println(sb1);
		
		
		
	}
}
