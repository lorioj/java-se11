package advance.generics;

public class Animal extends Zoo{
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
