package HilosHelloThread;

class RunThread {
	public static void main(String args[]) {
		new HelloThread(); // Crea un nuevo hilo de ejecución
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("Hola desde el hilo principal!");
		System.out.println("Proceso acabando.");
	}
}