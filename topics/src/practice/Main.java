package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
	
	static List<Future<String>> l = new ArrayList<>();
	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		List<E ntity> l = new ArrayList<>();
//
//		for (int i = 0; i < 3; i++) {
//
//			Map<String, EntityType> map = new HashMap<>();
//			EntityType s = new EntityType.Builder().setPrice(i).setQnty(3).build();
//			map.put("ABC" + i, s);
//			Entity e = new Entity.B().setName("name"  + i).setMap(map).build();
//			l.add(e);
//
//		}
// 
//		for (Entity e : l) {
//			System.err.println(e.toString());
//		}
		
		
		for(int i = 0; i < 5; i++) {
			System.err.println(i);
		}
		
		
//		ex("client1");
//		
//		
//		
//		for(Future<String> f : l) {
//			System.err.println(f.get());
//		}
	}

	static void ex(String client) throws InterruptedException, ExecutionException {

		ExecutorService s = Executors.newCachedThreadPool();
		
		
		
		for(int i = 0; i < 10; i++) {
			
			String v = i + "sdf"; 
			Future<String> f = s.submit(() -> v);
			
			l.add(f);
		}
		
		ScheduledExecutorService schedule = Executors.newScheduledThreadPool(3);
	

	}
	
	
	
}
  