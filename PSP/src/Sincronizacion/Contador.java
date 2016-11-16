package Sincronizacion;

class Contador {
	static int contador;

	public synchronized static void sumar() {
		for (int i = 0; i < 1000; i++)
			contador++;

	}

	public synchronized static void restar() {
		for (int i = 0; i < 1000; i++)
			contador--;

	}

}

class Suma extends Thread {
	public void run() {
		Contador.sumar();
	}
}

class Resta extends Thread {
	public synchronized void run() {
		Contador.restar();
	}
}
