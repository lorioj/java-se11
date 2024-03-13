package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	int d;

	public static void main(String[] args) {

		groupingBy(); // grouping all elements into map
//		partitioningBy(); // spliting list into two parts
		Stream<Object> l = Stream.of("john", "condat", "lorio", "jjjj").map(s -> {
			List<String> res = new ArrayList<>();
			res.add(s);
			return res;
		});
		
		
		List<String> list = Stream.of("john", "condat", "lorio", "jjjj").map(k -> k).collect(Collectors.toList());
		System.out.println(list);
		

	}

	static void collectors() {
		Map<Integer, String> map = Stream.of("john", "condat", "lorio", "jjjj")
				.collect(Collectors.toMap(String::length, v -> v));

		System.out.println(map);
	}

	static void groupingBy() {
		Map<String, List<String>> map = Stream.of("john", "condat", "lorio", "jjjj", "john")
				.collect(Collectors.groupingBy(k -> k));

		System.out.println(map);
	}

	static void partitioningBy() {
		Map<Boolean, List<String>> map = Stream.of("john", "condat", "lorio", "jjjj", "john")
				.collect(Collectors.partitioningBy(k -> k.length() <= 4));

		System.out.println(map);
	}

	static void groupingByUsingManual() {
		Map<Object, List<String>> map = Stream.of("john", "condat", "lorio", "jjjj", "john")
				.collect(Collectors.groupingBy(k -> {
					List<String> res = new ArrayList<>();
					res.add(k);
					return res;
				}));
		System.out.println(map);
	}
	
	

}
