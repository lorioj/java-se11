package exams;

public class Green {
	private String name = "Green";
	
	
	public void setName(String name) {
		String title = "Mr. ";
		this.name = title + name;
	}
	
	public String toString() {
		return name;
	}

}
