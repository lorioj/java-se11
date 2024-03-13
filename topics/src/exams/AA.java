package exams;

import java.io.Closeable;
import java.io.IOException;

public class AA implements AutoCloseable{
	
	public AA() {
		System.out.println("A");
	}
	void print() {
		System.out.println("C");
	}

	@Override
	public void close() throws Exception {
		System.out.println("B");
	}

}