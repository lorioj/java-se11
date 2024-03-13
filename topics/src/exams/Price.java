package exams;

public class Price {
	private final double value;
	
	public Price(String value){
		this(Double.parseDouble(value));
	}
	
	public Price(double value) {
		this.value = value;
	}
	
//	public Price() {
//		
//	}
	public double getValue() {
		return value;
	}
}
