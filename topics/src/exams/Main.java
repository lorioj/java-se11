package exams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	
	static void f(Object[] o) {
		System.err.println("Im object array");
	}
	
	static void f(long[] l) {
		System.err.println("Im long");
	}
	
	static void f(Object o) {
		System.err.println("Im object");
	}
	
	
//	class A{
//		
//	}
//	
//	class B extends A{
//		
//	}
//	
//	class C extends B{
//		
//	}
	
	
//	static int myint = 666;
	
//	static StringBuilder sb1 = new StringBuilder("yo ");
//	StringBuilder sb2 = new StringBuilder("yo ");
//	
//	StringBuilder foo(StringBuilder s) {
//		System.err.print(s + " oh " + sb2);
//		return new StringBuilder("ey");
//	}
	
	
//	@AuthorInfo( comments = {"sdf"}, date = "sdf")
//	static void method() {
//		
//	}
	
	
	
//	static Optional<Integer> convert(String s){
//		try {
//			return Optional.of(Integer.parseInt(s));
//		}catch (Exception e) {
//			return Optional.empty();
//		}
//	}
//	
//	
//	static class A{
//		void print() {
//			System.err.println("A");
//		}
//	}
//	
//	static class B extends A{
//		void print() {
//			System.err.println("B");
//		}
//	}
//	
//	static class C extends B{
//		void print() {
//			System.err.println("C");
//		}
//	}
	
	
	interface MyIn{
		private void sM() {};
		public void m();
	
	}
//	class MM implements MyIn{
//
//		
//		
//	}
//	
//	static class P{
//		int x;
//		String name;
//		public  int getX() {
//			return x;
//		}
//		public String getName() {
//			return name;
//		}
//		
//		P(int x, String name){
//			this.x = x;
//			this.name = name;
//		}
//		@Override
//		public String toString() {
//			return "P [x=" + x + ", name=" + name + "]";
//		}
//		
//		
//	}
	

	
	static class Per{
		int age;
		String name;
		Per(int age, String name){
			this.age = age;
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getName() {
			return name;
		}
	}
	
	static void add(Collection c) {
		c.add("something");
		c.add(2.2);
	}
	
	static Person per = null;
//	
//	@Repeatable(Meals.class)
//	@Target(ElementType.TYPE)
//	static @interface Meal{
//		String starter() default "";
//		String mainCourse();
//		String desert() default "";
//	}
//	
//	@Target(ElementType.TYPE)
//	static @interface Meals{
//		Meal[] values();
//	}
//	
	static Person p = null;
	
	public static void main(String[] args){
//		List<String> list = new ArrayList<>();
//		try(Stream<String> s = Files.lines(Paths.get("file.txt"))){
//			list = s.filter(f -> !f.equalsIgnoreCase("java")).map(String::toUpperCase).collect(Collectors.toList());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		list.forEach(System.out::println);
		//output are:
//		C-
//		C++
//
//		JAVA-
//
//		GO-
//
//		KOTLIN

	
		
		
//		try {
//			Files.readAllLines(Paths.get("")); // return list
//			Stream<String> s = Files.lines(Path.of("")); // return Stream
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		Integer[] intArray = {2,1,3,4,5};
//		List<Integer> list = new ArrayList<>(Arrays.asList(intArray));
//		list.parallelStream().forEachOrdered(s -> System.err.print(s + " "));//output is:2 1 3 4 5 
//		list.parallelStream().forEach(s -> System.err.print(s)); //output is:random order of intArray
		
		
//		List<Integer> list = new CopyOnWriteArrayList<>();
//		ExecutorService s = Executors.newFixedThreadPool(5);
//		CyclicBarrier c = new CyclicBarrier(2, () ->System.err.println(list));
//		IntStream.range(0,5).forEach(n -> s.execute(() -> {
//			try {
//				list.add(n);
//				c.await();
//			} catch (Exception e) {
//				System.err.println("Exception");
//			}
//		}));
//		s.shutdown();
		//output compile successfully 
		//
//		[1, 4, 0, 3, 2]
//		[1, 4, 0, 3, 2]

		
//		BiFunction<Integer, Integer, Integer> f = (int b, int c) ->  b; // not compile should Non primitive than int
//		UnaryOperator<Integer> u = (int i) -> (i * 2);//not compile
//		UnaryOperator u = (var i) -> (i * 2);
//		UnaryOperator u = i -> {return i * 2};
		
	
		
//		StringBuilder sb = new StringBuilder(5);
//		sb.append("HOWDY");
//		sb.insert(0, ' ');
//		sb.replace(3, 5, "LL");
//		sb.insert(6, "COW");
//		sb.delete(2, 7);
//		System.err.println(sb); //ouput is: HOW-> length of this is 4
		
		
		
//		List<Integer> l = IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList());
//		System.err.println(l);
		
		
//		List<StringBuilder> l = new ArrayList<>();
//		l.add(new StringBuilder("abc"));
//		l.add(new StringBuilder("zyx"));
////		l.stream().map(s -> s.reverse()); //[abc, zyx]
////		l.stream().map(s -> s.reverse()).toArray(); //[cba, xyz]
//		System.err.println(l);
		
//		Console c = System.console();
//		if(c == null) {
//			System.err.println("no console available");
//			return;
//		}
//		char[] pwd = c.readPassword("Enter Password: ");
//		System.err.println("Password is: " + pwd);
		
		
//		checkPerson(per);
//		System.err.println(per);
//		Person p2 = new Person("john");
//		checkPerson(p2);
//		System.err.println(p2);
		
		
		
//		Person p = new Person("Joe");
//		checkPerson(p);
//		System.err.print(p);
//		p = null;
//		checkPerson(p);
//		System.err.print(p); //Joe null
		
		
//		Which two statements print ……answerstopsecret?
//		Path p1 = Paths.get("/scratch/exam/topsecret/answers");
//		Path p2 = Paths.get("/scratch/exam/answers/temp.txt");
//		Path p3 = Paths.get("/scratch/answers/topsecret");
//		System.out.println(p1.relativize(p3));// output is:..\..\..\answers\topsecret
//		System.out.println(p2.relativize(p3));// output is:..\..\..\answers\topsecret
		
		
//		List<String> fruits = List.of("apple", "orange", "banana", "lemon");
//		Stream<String> s1 = fruits.stream();
//		Stream<String> s2 = s1.peek(i -> System.out.print(i + " "));
//		System.err.println("----------");
//		Stream<String> s3 = s2.sorted();
//		Stream<String> s4 = s3.peek(i -> System.out.print(i + " "));
//		System.err.println("----------");
//		String strFruits = s4.collect(Collectors.joining(","));
//		output is
//		----------
//		----------
//		apple orange banana lemon apple banana lemon orange 
		
		
		
		
//		List<String> l1 = new ArrayList<>(List.of("Eart", "Wind", "Fire"));
//		List<String> l2 = List.copyOf(l1);
//		l1.sort((a,b) -> a.compareTo(b));
//		l2.sort((a,b) -> a.compareTo(b));
//		System.err.println(l2.equals(l1)); //ouput is java.lang.UnsupportedOperationException
		
		
	
		
		
		
//		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3308/")){
//			PreparedStatement p = c.prepareStatement("sq");
//			PreparedStatement p2 = c.prepareStatement("sdf");
//	
//		}
//		
		
//		var f = List.of("apple", "orange", "banana", "lemon");
//		Optional<String> o = f.stream().filter(s -> s.contains("n")).findAny();
//		System.err.println(o.get()); // output is:orange
		
//		var l = new ArrayList<>(List.of("hello", 23));
//		l.add(2);
//		add(l);
//		System.err.println(l);//outpus is:[hello, 23, 2, something, 2.2]
		
//		List<String> l = List.of("am", "first", "second", "am", "mismatch");
//		Map<String, Long> m = l.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//		System.err.println(m);
	
//		how many objects are created answer is 4
//		LocalDate d1 = LocalDate.now();
//		d1.plusDays(1);
//		LocalDate d2 = d1.minusMonths(2);
//		d1.plusWeeks(3);
//		d2 = null;
////		System.err.println(d1 + ":" + d2);
//		
//		var f = List.of("apple", "orange", "banana");
//		Optional<String> o = f.stream().filter(s -> s.contains("a")).findFirst();
//		System.err.println(o);
//		
//		List<Per> p = new ArrayList<>(List.of(new Per(44, "Tom"), new Per(40, "Aman"), new Per(40, "Peter")));
//		p.sort(Comparator.comparing(Per::getAge).thenComparing(Per::getName));	
//		p.forEach(p1 -> System.err.println(p1.getName()));
		
		
//		String s = "";
//		if(s.compareTo(" ") >= 0) {//depends on what is first to compare to second
//			System.err.println("inside if");
//		}
//		if(s.isEmpty()) {
//			System.err.println("inside if");
//		}
		
//		 int i = 3;
//		 int j = 25;
//		 System.err.println(i > 2 ? i > 10 ? i * (j + 10) : i *j + 5: i); // ouput is 80
		 
//		List<Colors> l = new  ArrayList<>();
//		l.add(new Colors("red", 100));
//		l.add(new Colors("yellow", 75));
//		
//		Comparator c = new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				if(o1.compareTo(o2)>=0) {
//					return 1;
//				}
//				return -1;
//			}
//		};
//		
		
//		var fruits = List.of("apple", "orange", "banana", "lemon");
//		Optional<String> o = fruits.parallelStream().filter(f -> f.contains("n")).findAny();
//		System.err.println(o); //output is:Optional[banana] it alwasy print banana
		
//		var fruits = List.of("apple", "banana");
//		fruits.removeIf(p -> p.contains("p"));
//		System.err.println(fruits); // output is:java.lang.UnsupportedOperationException
		
		
//		Person p = null;
//		checkPerson(p);
//		System.err.println(p);
//		Person p2 = new Person("joe");
//		checkPerson(p2);
//		System.err.print(p2); //output is nullMary
		
		
//		A[] a = new B[1];
//		a[0] = new C();
//		a[0].print(); //output is  pring in c
		
		
//		IntStream.range(1, 4).peek(System.out::print).peek(i -> {
//			if(i == 1) {
//				throw new RuntimeException("run error");
//			}
//		}); //no output
		
//		Green g = new Green();
//		g.setName("blue");
//		System.err.println(g);
		
		
	
		
//		IntStream.range(1, 4).forEach(i -> {
//			if(i == 3) {
//				throw new RuntimeException("sd");
//			}
//		});
		
//		System.err.println(convert("s").get()); // thrown NoSuchElementException is thrown at run time.
		
//		System.err.println(Optional.of(Integer.parseInt(Optional.of("a").get())));
//		var fruits = List.of("apple", "orange", "banana", "lemon");
//		Optional<String> o = fruits.stream().filter(f -> f.contains("n")).findAny();
//		System.err.println(o.get()); //output produce same output
		
//		var l = List.of(1,2,3,4,5);
//		double a = l.stream().mapToInt(m -> m).average().getAsDouble();
//		double av  = l.stream().collect(Collectors.averagingDouble(d -> d));
		
//		BinaryOperator<Double> bo = (a,b) -> a + b;
//		double d  = List.of(new Employee(1), new Employee(12)).stream().map(Employee::getSalary).reduce(0.0,bo);
//		
//		var l = List.of("resdf");
//		UnaryOperator<String> u = String::toUpperCase;		
//		l.replaceAll(u);
		
//		Stream.of(2,3).map(e -> e).reduce((a,b) -> a + b).ifPresent(d -> d.doubleValue());;
		
//		var l = List.of(1,2,3,5);
//		for(int i : l) {
//			l.remove(i);
//		}
		
		
		
		
		
//		sb1 = sb1.append(new Main().foo(new StringBuilder("hey")));
//		System.err.println(sb1);
		
//		StringBuilder s = new StringBuilder("john");
//		StringBuilder s2 = new StringBuilder("john"); 
//		System.err.println(s2.toString() + ":" + s);
//		System.err.println(s.equals(s2.toString()));
//		System.err.println(s == s2);
		
		
//		Optional<Integer> i = Stream.of(23,3).reduce((a, b) -> a + b);
//		Integer d = Stream.of(3).reduce(0, (a, b) -> a + b);
		
	
//		Green g = new Green();
//		g.setName("blue");
//		System.err.println(g);
		
		
//		int i = 3;
//		int j = 25;
//		int r = i > 0 ? i < 1 ? 3 : i * j + 5 : i;
//		System.err.println(r); //output is 80
		
		
//		List<? extends A> l = new ArrayList<>();
//		List<B> b = new ArrayList<>();
//		List<? extends C> c = new ArrayList<>();
	
//		Stream.of(1).mapToInt(i -> i).boxed();
		
//		int[] arr = new int[3];
//		f(arr); // output Im object
		
		
//		int x = 0;
//		do {
//			x++;
//			if(x == 1) {
//				continue;
//			}
//			System.out.println(x);
//		}while(x < 1);// prints nothing
		
		
//		final BB bb = new BB();
//		AA a = new AA();
//		try(a; bb){
//			a.print();
//		}finally{
//			System.err.println("D");
//		}
		
	
//		var i = 10;
//		var j = 5;
//		i += (j * 5 + i) / j - 2;
//		System.out.println(i +  "sdsdfsfd");
//
//		Main m = null;
//		m.m(); // it will print method
//
//
//		// B is parent
//		B bb = new A();
//		System.out.println(bb.m() + " : " + bb.m2()); // B static method m : A method m2

//		Printer<Integer> i = new Printer<>(123);
//		Printer<String> s = new Printer<>("hello");
//		Printer<?> u = i;
//		i.print();
//		s.print();
//		u.print();
		// output
//		123 ->
//		hello ->
//		123 -> u

//		List<Integer> l = new ArrayList<>();
//		l.add(1);
//		l.add(2);
//		List<Integer> l2 = Collections.unmodifiableList(l);// class is used to get an unmodifiable view of the specified list
//		l.add(3);
//		System.out.println(l + " : " + l2); // [1, 2, 3] : [1, 2, 3]

//		List<Integer> lIterator = null;
//		lIterator.iterator();

//		Date dt = new Date();
//		DateFormat dateFormat;
//		// Date Format MEDIUM constant
//		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.FRENCH);
//		System.out.println("Locale FRENCH = " + dateFormat.format(dt));
//		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.GERMANY);
//		System.out.println("Locale GERMANY = " + dateFormat.format(dt));
//		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINESE);
//		System.out.println("Locale CHINESE = " + dateFormat.format(dt));
//		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CANADA);
//		System.out.println("Locale CANADA = " + dateFormat.format(dt));
//		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ITALY);
//		System.out.println("Locale ITALY = " + dateFormat.format(dt));
//		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.TAIWAN);
//		System.out.println("Locale TAIWAN = " + dateFormat.format(dt));
//		 output
//	      Locale FRENCH = 22 nov. 2018
//	    		  Locale GERMANY = 22.11.2018
//	    		  Locale CHINESE = 2018-11-22
//	    		  Locale CANADA = 22-Nov-2018
//	    		  Locale ITALY = 22-nov-2018
//	    		  Locale TAIWAN = 2018/11/22

//		Foo f1 = new Foo();
//		Foo f2 = new Bar();
//		Bar b1 = new Bar();
//		Collection<String> cString = new ArrayList<>();
//		f1.foo(cString); // foo collection
//		f2.foo(cString); // bar collection
//		b1.foo(cString); // bar collection
//
//		List<String> lString = new ArrayList<>();
//		f1.foo(lString); // foo list
//		f2.foo(lString);
//
//		int x = 0, y = 6;
//		for (; x < y; x++, y--) {
//			if (x % 2 == 0) {
//				continue;
//			}
//			System.out.println(x + "-" + y); // output 1-5
//		}

//		int xx = 10;
//		do {
//			for (int j = xx / 2; j > 0; j--) {
//				System.out.print(j + " ");
//			}
//			xx -= 2;
//		} while (xx > 0);
		// outpout 5 4 3 2 1 4 3 2 1 3 2 1 2 1 1
		
//		StringBuilder sb = new StringBuilder();
//		sb.append("HOWDY");
////		sb.insert(3,5, "LL"); // there is no three parameter int, int, String

//		for (var v = 0; v < 10; v++) {
//			switch (v % 5) {
//			case 2:
//				v *= 2 * 1;
//				break;
//			case 3:
//				v++;
//				break;
//			case 1:
//			case 4:
//				v++;
//				continue;
//			default:
//				break;
//			}
//			System.out.println(v + "swith ");
//			v++;
//		}
//		//output 0 4 9
		
		
		
		
//		Locale locale = Locale.US;
//		double currency = 1_00.00;
////		Currency formmater = NumberFormat.getInstance(locale).getCurrency(); // Currency is fit not NumberFormat
//		NumberFormat formmatter = NumberFormat.getCurrencyInstance(locale); // output $100.00
////		NumberFormat formmatter = NumberFormat.getCurrency(locale); 
////		NumberFormat formmatter = NumberFormat.getInstance(locale); output of this 100
//		System.out.println(formmatter.format(currency)); // $100.00
		
		
//		//initialization are correct
//		float xxxx = 1f;
//		int xsdf = 12_34;
//		short sss = (short)'A';
//		
//		Person person = new Person("Joe");
//		checkPerson(person);
//		System.out.println(person );
//		person = null;
//		checkPerson(person);
//		System.out.println(person);
////		//output is joe - null
		
//		var symbols = List.of("USD", "GBP", "EUR", "CNY");
//		var exchangeRate = List.of(1.0, 1.3255,1.1969,0.1558094);
//		var map1 = IntStream.range(0, Math.min(symbols.size(), exchangeRate.size()))
//				.boxed()
//				.collect(Collectors.
//						toMap(i -> symbols.get(i), i -> 1.0 / exchangeRate.get(i)));
//		var map2 = map1.entrySet().stream()
//				.sorted(Map.Entry.comparingByKey())
//				.collect(
//						Collectors
//						.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> o, LinkedHashMap::new));
//		map2.forEach((var k, var v) -> System.out.printf("%s -> %.2f\n", k, v));
		//OUTPUT IS 
//		CNY -> 6.42
//		EUR -> 0.84
//		GBP -> 0.75
//		USD -> 1.00
//		
		
//		List<String> li = new ArrayList<>();
//		Collection<String> co = li;
//		Bar bar = new Bar();
//		bar.foo(li); // bar list
//		bar.foo(co); // foo collection
//		
//		Super sup = new Sub();
//		System.out.println(sup.greeting() + ":" + sup.name());
//		
//		List<Integer> list = List.of(11,12,13,12,13);
//		double dd = list.get(0);
		
//		int myint = myint;
//		System.out.println(myint);
//		
//		AnotherClass aa = new AnotherClass();
//		Some as = new AnotherClass();
//		aa=as;
		
//		char d = 100, e = 'e';
//		int x = d;
//		int y = y =(int) e;
//		System.out.println((char)x + (char)y); // output is 201
		
//		var c = new CopyOnWriteArrayList<>(List.of("1","2","3","4"));
//		Runnable r  = () -> {
//			try {
//				Thread.sleep(150);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			c.set(3, "four");
//			System.out.print(c + " ");
//		};
//		Thread t = new Thread(r);
//		t.start();
//		for(var s : c) {
//			System.out.print(s + " ");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		//output 1 2 [1, 2, 3, four] 3 4 
		
//		Integer i = 11;
//		double d = i;
//		double e = Double.parseDouble(s)
		
//		List<String> l = new ArrayList<>();
//		Foo fo = new Foo();
//		Foo f = new Bar();
//		Bar b = new Bar();
//		fo.foo(l);
//		f.foo(l);
//		b.foo(l);
		
//		BiPredicate<Integer, Integer> b = (var x, final var y) -> (x.equals(y));
		
		
//		AbilityB x = new Test();
//		x.action(); // output ab action
		
		
//		System.out.println(Alphabet.getFirstLetter()); 
//		Season[] sa = Season.values();
//		System.out.println(Season.valueOf("SPRING").ordinal());
//		System.out.println(sa[1]);
		
//		var imp = new ApiImp();
//		imp.process(); // process called 2
		
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(1);
//		al.add(2);
//		al.add(3);
//		Iterator<Integer> itr =  al.iterator();
//		
//		while(itr.hasNext()) {
//			if(itr.next() == 2) {
//				System.out.println(itr.next());
//			}
//			
//		}
		
		
//		List<Integer> list = List.of(11,12,13,12,13);
//		Integer c = Integer.valueOf(list.get(0));
//		System.out.println(c);
		
//		String[] catName = {"abyssinian", "oxicat", "korat", "laperem", "bengal", "sphynx"};
//		var cats = new ArrayList<>(Arrays.asList(catName));
//		cats.sort((var a, var b) -> -a.compareTo(b));
//		cats.forEach(System.out::println);
		
//		Cyl c = new Cyl();
//		System.out.println(c.cal(3, 23));
		
		
	}
	
//	interface Rec{
//		default double cal(double d, double dd) {
//			return d;
//		}
//	}
	
//	interface Ecl{
//		default double cal(double d, double dd) {
//			return d + dd;
//		}
//	}
//	
//	static class Cyl implements Rec, Ecl{
//
//		@Override
//		public double cal(double d, double dd) {
//			double r = Rec.super.cal(d, dd);
//			double e = Ecl.super.cal(d, dd);
//			return r * e;
//		}
//
////		@Override
////		public double cal(double d, double dd) {
////			double ec = Ecl.super.cal(d, dd);
////			return ec;
////		}
//		
//	}
	
	
	
//	enum Alp{ 
//		A,B,C;
//		String getF() {
////			return A.toString();
//		}
//		
//	}
//	
//	static int reduce(int x) {
//		int y = 4;
//		class Computer{
//			int reduce(int x) {
//				return x-y--;
//			}
//		}
//		
//		Computer a = new Computer();
//		return a.reduce(x);
//	}
	
	
	
	
	

	
	static Person checkPerson(Person p) {
		if(p == null) {
			p = new Person("Mary");
		}else {
			p  = null;
		}
		return p;
	}
	
	static class Some{
		public void mm() {
			System.out.println("some class");
		}
	}
	
	static class AnotherClass extends Some{
		public void mm() {
			System.out.println("another class");
		}
	}
	

	static void m() {
		System.out.println("method");
	}

	
}
