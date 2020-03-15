package JavaSe.Multithreading.Threading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Color.ANSI_BLACK+"Running from the Runnable Interface ");
	}

}
