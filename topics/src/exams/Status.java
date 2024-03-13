package exams;


public enum Status {
	SILVER(1),GOLD(2);
	private int rate;
	private Status(int rate) {
		this.rate = rate;
	}
	
	
//	public Status addStatus(int rate) {
////		return new Status(rate);
//	}

}
