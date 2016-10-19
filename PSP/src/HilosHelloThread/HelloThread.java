package HilosHelloThread;

class HelloThread implements Runnable {
	Thread t;

	HelloThread() {
		t = new Thread(this, "Nuevo Thread");
		System.out.println("Creado hilo: " + t);
		t.start(); // Arranca el nuevo hilo de ejecuci�n. Ejecuta run
	}

	public void run() {
		// C�digo a ejecutar por el hilo
		System.out.println("Hola desde el hilo creado!");
		System.out.println("Hilo finalizando.");
	}
}

