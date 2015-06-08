package concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class SingleThreadExecutor {
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}
