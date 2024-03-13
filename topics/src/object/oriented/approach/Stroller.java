package object.oriented.approach;

public class Stroller extends ChildCare implements Tool{
	
	@Override
	public void staticMethod() {
		
	}

	final public void use(int fun) {
		int width = 5;
		class ParkVisit{
			int getValue() {
				return width + fun;
			}
		}
		System.out.println(new ParkVisit().getValue());
		
	}
	
	
	public static void main(String[] args) {
		new Stroller().use(23);
	}


}
