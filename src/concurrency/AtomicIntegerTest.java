package concurrency;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;


public class AtomicIntegerTest implements Runnable {
	private AtomicInteger i = new AtomicInteger(0);
	public int getValue() { return i.get(); }
	private void evenIncrement() { i.addAndGet(2); }
	public void run() {
		while (true)
			evenIncrement();
	}
	
	public static void main(String[] args) {
		new Timer().schedule(new TimerTask() {
			public void run() {
				System.err.println("Aborting");
				System.exit(0);
			}
		}, 5000);
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicIntegerTest ait = new AtomicIntegerTest();
		exec.execute(ait);
		while (true) {
			int val = ait.getValue();
			if ((val & 0x1) == 1) {
				System.out.println(val);
				System.exit(0);
			}
		}
	}
}