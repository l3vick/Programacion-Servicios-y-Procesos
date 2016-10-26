package Interrupociones;

public class Dormilon extends Thread {
	int siesta;
	int intervalo;

	public Dormilon(String nombre, int siesta) {
		this.setName(nombre);//damos nombre al hilo
		this.siesta = siesta;
	}

	public void run() {
		try {
			System.out.println("El ni�o se echa a dormir");
			Thread.sleep(siesta);
		
		} catch (InterruptedException e) {
			System.out.println("Siesta interrumida por mam�");
			return;
		}
		
		System.out.println("El ni�o se despierta solito");
		/*if (interrupted()==true){
			System.out.println("El ni�o llora");
		} else {
			System.out.println("El ni�o se despierta solito");
		}*/
		
	}

	public static void main(String[] args) {
		int siesta = 800;
		int despertador = 700;
		System.out.println("La mam� acueta al ni�o");
		Thread nene = new Dormilon("Pablo Jr",siesta);
		nene.start();
		
		
	
		try {
			Thread.sleep(despertador);
			nene.interrupt();//interrumpe si el despertador es mayor que la siesta lanza excepcion InterruptedException
			if(nene.isAlive()){
				
				System.out.println("voy a despertar al peque");
				System.out.println(nene.getName()+ " "+nene.getId()+ " " + nene.toString());
			} else {
				System.out.println("El ni�o ya se ha despertado solo");
			}
			
			if (nene.isInterrupted()){
				System.out.println("Hilo interrumpido por la madre");
			}
			
			if(nene.isAlive()){
				System.out.println("El ni�o queria alargar la siesta");
			}
			
			nene.join();//madre espera a hijo
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fin de la historia");
	}
}