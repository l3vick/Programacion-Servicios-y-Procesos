package Procesos;

import java.io.IOException;

public class runtimeProcessRuntime {
	public static void main(String[] args) {
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec(args);
			process.waitFor();
//			process.destroy();
			System.out.println("Fin");
		} catch (IOException ex) {
			System.err.println("Excepción de E/S!!");
			System.exit(-1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}