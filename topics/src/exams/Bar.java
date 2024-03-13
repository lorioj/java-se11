package exams;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Bar extends Foo {

	public void foo(Collection arg) {
		System.out.println("bar collection");
	}

	public void foo(List arg) {
		System.out.println("bar list");
	}
	
	
	
//	public List<Integer> foo(Set<CharSequence> m){
//		return null;
//	}
//	
//	public List<Number> foo(TreeSet<String> m){
//		return null;
//	}

}
