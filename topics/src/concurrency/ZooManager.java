package concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ZooManager {
	
	
	public void removeLion() {
		System.out.println("remove lion");
	}
	
	public void cleanCage() {
		System.out.println("clean cage");
	}
	
	public void putLion() {
		System.out.println("put lion");
	}
	
	public void performTask(CyclicBarrier c, CyclicBarrier c2) {
		try {
			removeLion();
			c.await();
			cleanCage();
			c2.await();
			putLion();
		} catch (InterruptedException | BrokenBarrierException e) {
		}
	
	}

}
