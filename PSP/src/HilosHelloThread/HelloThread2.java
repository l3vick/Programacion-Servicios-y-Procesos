package HilosHelloThread;

class HelloThread2 extends Thread {
	public void run() {
		// C�digo a ejecutar por el hilo
		System.out.println("Hola desde el hilo creado!");
	}
}