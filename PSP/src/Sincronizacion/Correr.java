package Sincronizacion;

public class Correr {
	public static void main(String[] args) throws InterruptedException {
		Contador.c = 0;
		Thread s1 = new Suma();
		Thread r1 = new Resta();
		s1.start();
		r1.start();
		s1.join();
		r1.join();
		System.out.println("El resultado final es: " + Contador.c);
	}
}