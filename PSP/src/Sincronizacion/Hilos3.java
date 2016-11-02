package Sincronizacion;

public class Hilos3 {
	public static void main(String[] args) {
		Historial historial = new Historial();
		new Habla("Hola", historial).start();
		new Habla("Adiós", historial).start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		historial.mostrar();
	}
}