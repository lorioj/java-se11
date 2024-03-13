package exams;

public class Person {
	private String name;
	
	Person(String name){
		this.name = name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public String toString() {
		return name;
	}
	
	
	//this is for green
//	private String name = "Green";
//	public Person(String name) {
//		String title = "Mr. ";
//		name = title + name;
//	}
//	
//	public String toString() {
//		return name;
//	}
	
}
