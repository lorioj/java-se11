package object.oriented.approach;

public class Driver {
	static final int distance = 2;

	{
		System.out.println("me");
	}

	static {
		System.out.println("do");
	}

	{
		System.out.println("fa");
	}

	static {
		System.out.println("re");
	}

	Driver() {
		System.out.println("la");
	}

	public static void main(String[] args) {
		//cycles
		System.out.println("so");
		new Driver(); // output is do re so me fa la
		

		// variable scope
		int Integer = 23; // non-primitive variable is legal
//		int int = 3; //primitive variable is illegal
		var ____ = 2;
		var $sdf = "";
		int sdfwerd32f23 = 3;
		int sum = 1_000;
//		int a = _1000; //underscore is permited only in between values
//		int b = 1000_; // illegal
		int c = 1_00_0; // legal

		// comment
		// => this is single line comment
		/**/ // => this is multi line comment
		/***/ // this is javadoc

		// hiding same variable name. same method signature
		HiddingParent child = new HiddingChild();
		System.out.println(child.name);
		
		//Builder concept
		Bank b = new Bank.Builder().setName("BDO").build();
		System.out.println(b.getName());
		
		
		
		Driver d = new Driver();
		System.out.println(d.choose(2f)); // output is double
		System.out.println(d.choose((byte)2+2)); //output is int byte,short + digits it always call the int
		
		
		Forest f = new Forest();
		
		
	}
	
	
	
	static String choose(int c){return "int";}
//	static String choose(byte s) {return "byte"; }
	static String choose(short s) {return "short"; }
	static String choose(long l) {return "long"; }
	static String choose(double d) {return "double"; }
//	static String choose(float f) {return "float"; }
	static String choose(Float f) {return "Float"; }
	

}
