package exams;

interface APIInterface{
	public default void process() {
		System.out.println("process called 1");
	}
}

public class ApiImp extends AbstractAPI implements APIInterface{

	@Override
	public void process() {
		System.out.println("process called 2");
	}

}
