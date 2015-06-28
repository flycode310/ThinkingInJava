package concurrency;

import java.io.PipedWriter;
import java.util.Random;


class Sender implements Runnable {
	private Random rand = new Random(47);
	private PipedWriter out = new PipedWriter();
	public PipedWriter getPipedWriter() { return out; }
}
public class PipedIO {

}
