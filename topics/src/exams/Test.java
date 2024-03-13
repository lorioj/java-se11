package exams;

interface AbilityA{
	default void action() {
		System.out.println("a action");
	}
}

interface AbilityB{
	void action();
}

public class Test implements AbilityA, AbilityB{

	@Override
	public void action() {
		System.out.println("ab action");
	}
	
}
