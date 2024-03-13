package main;

import static object.oriented.approach.Bank.deposit; // static import

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


interface Tool {
	void use(int tool);
}

abstract class Childcare {
	abstract void use(int fun);
}

interface Tasty {
	default void eat() {
		System.out.println("spoiled");
	}
}



@Repeatable(Meals.class)
@Target(ElementType.TYPE)
@interface Meal{
	String mainC();
}

@Target(ElementType.TYPE)
@interface Meals{
	Meal[] value();
}


@Meal(mainC = "sdf")
@Meal(mainC = "sdf")
public class Main {

	static int x;
	static {
		x = 3;
	}
	
	
	@FunctionalInterface
	interface InterfaceB{
		int bread(int i);
		public boolean equals(Object o);
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		 
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
		Runnable task = () -> {
		    System.err.println("sample runnable");
		    
		};
		
		
		

		
		
		
		
		
		
		
		
		
//		Function<Integer, String> f = n -> Integer.toHexString(n);
//		Function<Integer, String> f = Integer::toHexString;
		
		
//		Main m = new Main();
//		synchronized (m) {
////			int x = 0;
//			x++;
//		}
//		
//		char[] c = new char[100];
//		try(FileReader reader = new FileReader("file_to_path")) {
//		
//			reader.read(c);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		var t = new Tasty() {
////			@Override
//			public void eat() {
//				System.out.println("main spoiled");
//			}
//		};
//		t.eat();

//		

//		for(int i = 0; i<100; i++) {
//			System.out.println(i);
//		}
//		
//		try(Connection con = DriverManager.getConnection("")){
//			PreparedStatement stmt = null;
//			ResultSet r = stmt.executeQuery("select * from table");
//		
//		} catch (SQLException e) {
//		}
//		int i = 3;
//		switch (i) {
//		case 2:
//			System.out.println("2");
//			break;
//		case 3:
//			System.out.println("3");
//		case 4:
//			System.out.println("3");
//			System.out.println("6");
//
//			deposit(12); // this is the static import
//
//		}
//		int[] nums1 = {};
//
//		List<Integer> n = Arrays.asList(1, 3);

	}

}
