package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {
	public static void main(String[] args) {
		ExecutorService s = Executors.newFixedThreadPool(4);
		ZooManager m = new ZooManager();
		CyclicBarrier c = new CyclicBarrier(4, () -> System.out.println("already removed the lion"));
		CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("already clean cage"));
			
		try {
			for(int i = 0; i < 4; i++) {
				s.submit(() -> m.performTask(c, c2));	
			}
		
		} finally {
			if(s != null) {
				s.shutdown();
			}
		}
		
	}

	static void ex() {
		ExecutorService s = Executors.newSingleThreadExecutor();
		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				try {
					System.out.println("run");
					Thread.sleep(1_000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Callable<String> c = () -> "sd";

		try {
			s.execute(r);
			Future<String> f = s.submit(c);
			while (!f.isDone()) {
				System.out.println("is not done");
			}
			System.out.println(f.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (s != null) {
				s.shutdown();
			}
		}
	}

}
