package HilosHelloThread;

public class RunThread2 {
	public static void main(String args[]) {
		
		new HelloThread2().start();// Crea y arranca un nuevo hilo de ejecución
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hola desde el hilo principal!");
		System.out.println("Proceso acabando.");
	}
}
