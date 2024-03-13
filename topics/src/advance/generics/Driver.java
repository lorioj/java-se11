package advance.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		
		
		

//		Printer<String> stringPrinter = new Printer<>("hello");
//		stringPrinter.print();
//
//		Printer<Integer> intPrinter = new Printer<Integer>(234234);
//		intPrinter.print();
//
//		Printer<Animal> animalPrinter = new Printer<Animal>(new Animal("my animal"));
//		animalPrinter.print();
//
//		String res = genericMethod("generic method");
//		System.out.println(res);
//
//		List<String> lString = new ArrayList<>(Arrays.asList("john", "lorio"));
//		List<?> l = lString; // new ArrayList<>(); //this is unkown, read only
//		System.out.println(l.get(0));
//
//		List<Animal> animals = new ArrayList<>(Arrays.asList(new Animal("first animal")));
//		List<Dog> dogs = new ArrayList<>(Arrays.asList(new Dog("1st dog")));
//		List<Zoo> zoos = new ArrayList<>(Arrays.asList(new Zoo()));
//		
//		List<? extends Animal> lExtendsAnimal = animals; //dogs compile, zoos compile error
////		lExtendsAnimal.add(new Animal("another animal")); // add in extends in not permitted
//		lExtendsAnimal.get(0); // get in extends is compile
//		
//		List<? super Animal> lSuperAnimal = animals; //animals compile, zoos compile, dog dont compile
//		lSuperAnimal.add(new Animal("another animal")); //add in super is permited
//		System.out.println(lSuperAnimal.get(0)); // get compile
//		System.out.println(lSuperAnimal);
		
		
	
	
	}

	static <T> T genericMethod(T t) {
		return t;
	}
	
	
}
