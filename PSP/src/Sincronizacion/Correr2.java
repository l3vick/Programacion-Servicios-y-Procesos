package Sincronizacion;

public class Correr2 {
	public static void main(String[] args) throws InterruptedException {
		Puerta.abierta = true;
		Thread r = new Rapido();
		Thread l = new Lento();
		r.start();
		l.start();
		r.join();
		l.join();
		System.out.println("El rápido tiene: " + Puerta.rapido + " y el lento: " + Puerta.lento);
	}
}