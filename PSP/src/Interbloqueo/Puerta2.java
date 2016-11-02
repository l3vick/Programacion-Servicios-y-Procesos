package Interbloqueo;

class Puerta2 {
	public static boolean CerrojoA;
	public static boolean CerrojoB;
	volatile public static int contador;
}

class LlaveA extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Puerta2.CerrojoA = true;
			if (Puerta2.CerrojoB)
				Puerta2.contador++;
			Puerta2.CerrojoA = false;
		}
		System.out.println("LlaveA terminando");
	}
}

class LlaveB extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Puerta2.CerrojoB = true;
			if (Puerta2.CerrojoA)
				Puerta2.contador++;
			Puerta2.CerrojoB = false;
		}
		System.out.println("LlaveB terminando");
	}
}