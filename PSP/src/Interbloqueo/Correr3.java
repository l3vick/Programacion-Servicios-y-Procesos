package Interbloqueo;

public class Correr3 {
	public static void main(String[] args) throws InterruptedException {
		Thread a = new LlaveA();
		Thread b = new LlaveB();
		a.start();
		b.start();
		a.join();
		b.join();
		System.out.println("El resultado final es: " + Puerta2.contador);
	}
}