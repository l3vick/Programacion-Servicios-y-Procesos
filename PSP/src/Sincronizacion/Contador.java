package Sincronizacion;

class Contador {
	volatile public static int c;
}

class Suma extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++)
			Contador.c++;
	}
}

class Resta extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++)
			Contador.c--;
	}
}

