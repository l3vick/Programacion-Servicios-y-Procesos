package Interrupociones;

public class CounterThread extends Thread {
	String name;

	public CounterThread(String name) {
		this.name = name;
	}

	public void run() {
		int count = 0;
		try {
			while (++count < 10000) {
				System.out.println(name + ": " + count);
				sleep(10);
			}
		} catch (InterruptedException e) {
			System.err.println(name + " interrumpido");
		}
	}
}

class Prioridad {
	public static void main(String[] args) {
		CounterThread thread1 = new CounterThread("thread1");
		thread1.setPriority(Thread.MIN_PRIORITY);
		CounterThread thread2 = new CounterThread("thread2");
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
		thread1.start();
		try {
			Thread.sleep(1000);
			thread1.interrupt();
			thread2.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}