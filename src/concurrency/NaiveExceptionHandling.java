package concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class NaiveExceptionHandling {
	public static void main(String[] args) {
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());
		} catch (RuntimeException ue) {
			System.out.println("Exception has been handled");
		}
	}
}
