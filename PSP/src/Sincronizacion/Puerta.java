package Sincronizacion;

class Puerta {
	public static boolean abierta;
	public static int rapido;
	public static int lento;
}

class Rapido extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++)
			if (Puerta.abierta) {
				Puerta.abierta = false;
				Puerta.rapido++;
				Puerta.abierta = true;
			}
		System.out.println("Rápido terminando");
	}
}

class Lento extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++)
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		if (Puerta.abierta) {
			Puerta.abierta = false;
			Puerta.lento++;
			Puerta.abierta = true;
		}
		System.out.println("Lento terminando");
	}
}
