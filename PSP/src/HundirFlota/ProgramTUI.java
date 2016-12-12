package HundirFlota;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTUI {
  
  /**
   * Simula el juego de hundir la flota en modo de un solo jugador.
   * 
   * @param args Not used.
   */
  public static void main(String args[]) {
    // Declaracion de variables
    boolean found = false;
    int coordenadaX, coordenadaY, posicionX = -1, posicionY = -1, i = 1, continuar = 1, puntuacion = 3600;
    String nombre;
    char[] a = new char[36];
    for (int o=0; o < a.length; o++) {
      a[o] = 'O';
    }
    // Fin declaracion de variables, array lleno de O.
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.ENGLISH);
    System.out.println("HUNDIR EL BARCO!");
    System.out.println("================");
    // Situa el barco en un sitio aleatorio en un tablero de 6x6
    coordenadaX = (int)(Math.random() * 6); 
    coordenadaY = (int)(Math.random() * 6); 
    System.out.printf("Introduce tu nombre: ");
    nombre = sc.next();
    System.out.printf("El barco ya esta situado\n\n");
    // Cuadricula con el contenido de cada posicion del array.
    System.out.printf("  Y\n");
    System.out.printf(" (5) | "+a[30]+" | "+a[31]+" | "+a[32]+" | "+a[33]+" | "+a[34]+" | "+a[35]+" |\n");
    System.out.printf(" (4) | "+a[24]+" | "+a[25]+" | "+a[26]+" | "+a[27]+" | "+a[28]+" | "+a[29]+" |\n");
    System.out.printf(" (3) | "+a[18]+" | "+a[19]+" | "+a[20]+" | "+a[21]+" | "+a[22]+" | "+a[23]+" |\n");
    System.out.printf(" (2) | "+a[12]+" | "+a[13]+" | "+a[14]+" | "+a[15]+" | "+a[16]+" | "+a[17]+" |\n");
    System.out.printf(" (1) | "+a[6]+" | "+a[7]+" | "+a[8]+" | "+a[9]+" | "+a[10]+" | "+a[11]+" |\n");
    System.out.printf(" (0) | "+a[0]+" | "+a[1]+" | "+a[2]+" | "+a[3]+" | "+a[4]+" | "+a[5]+" |\n");
    System.out.printf("      (0) (1) (2) (3) (4) (5)  X\n\n");
    // found solo sera true al ganar o al rendirnos, entonces se acaba el bucle.
    while (!found) {
      // Coordenadas para el disparo.
      System.out.println("Introduce la posicion X: ");
      posicionX = sc.nextInt();
      System.out.println("Introduce la posicion Y: ");
      posicionY = sc.nextInt();
      // Si las posiciones entradas por el usuario coinciden con las coordenadas, gana la partida.
      if (posicionX == coordenadaX && posicionY == coordenadaY) {
        System.out.printf("Felicidades %s!\nHas hundido el barco en %d intentos", nombre, i);
        System.out.printf("\nPuntuacion: %d\nHasta la proxima!!!", puntuacion);
        found = true;
        // Comprueba los 8 puntos mas cercanos del barco.
      } else if (posicionX + 1 == coordenadaX && (posicionY == coordenadaY || posicionY == coordenadaY - 1 || 
                                                  posicionY == coordenadaY + 1) || 
                 posicionX - 1 == coordenadaX && (posicionY == coordenadaY || posicionY == coordenadaY - 1 || 
                                                  posicionY == coordenadaY + 1) ||
                 posicionY + 1 == coordenadaY && posicionX == coordenadaX || 
                 posicionY - 1 == coordenadaY && posicionX == coordenadaX) {
        System.out.println("Casi!");
      } else {
        // Si ni si quiera se ha acercado, muestra este mensaje.
        System.out.println("Que mala punteria ...");
      }
      // Comprueba la variable found inicializada en false.
      if (!found) {
        System.out.println("Quieres continuar (1 -> si, 0 -> no)?");
        continuar = sc.nextInt();
      }
      // Si decide no continuar, se muestra la posición del barco.
      if (continuar == 0) {
        System.out.printf("Que pena %s!\nNo has hundido el barco ...", nombre);
        System.out.printf("Estaba en la posicion (%d,%d)", coordenadaX, coordenadaY);
        System.out.printf("\nPuntuacion: 0\nHasta la proxima!!!\n");
        // Se activa true en found para no volver a entrar al bucle.
        found = true;
      } else {
        if (!found) {
          // Limpia la pantalla (de manera cutre :P)
          for (int k=0;k<25;k++) {
            System.out.println(' ');
          }
          // Muestra una X en las posiciones que el usuario dispare.
          switch (posicionY) {
            case 0: switch(posicionX) {
              case 0: a[0] = 'X'; break;
              case 1: a[1] = 'X'; break;
              case 2: a[2] = 'X'; break;
              case 3: a[3] = 'X'; break;
              case 4: a[4] = 'X'; break;
              case 5: a[5] = 'X'; break;
            } break;
            case 1: switch(posicionX) {
              case 0: a[6] = 'X'; break;
              case 1: a[7] = 'X'; break;
              case 2: a[8] = 'X'; break;
              case 3: a[9] = 'X'; break;
              case 4: a[10] = 'X'; break;
              case 5: a[11] = 'X'; break;
            } break;
            case 2: switch(posicionX) {
              case 0: a[12] = 'X'; break;
              case 1: a[13] = 'X'; break;
              case 2: a[14] = 'X'; break;
              case 3: a[15] = 'X'; break;
              case 4: a[16] = 'X'; break;
              case 5: a[17] = 'X'; break;
            } break;
            case 3: switch(posicionX) {
              case 0: a[18] = 'X'; break;
              case 1: a[19] = 'X'; break;
              case 2: a[20] = 'X'; break;
              case 3: a[21] = 'X'; break;
              case 4: a[22] = 'X'; break;
              case 5: a[23] = 'X'; break;
            } break;
            case 4: switch(posicionX) {
              case 0: a[24] = 'X'; break;
              case 1: a[25] = 'X'; break;
              case 2: a[26] = 'X'; break;
              case 3: a[27] = 'X'; break;
              case 4: a[28] = 'X'; break;
              case 5: a[29] = 'X'; break;
            } break;
            case 5: switch(posicionX) {
              case 0: a[30] = 'X'; break;
              case 1: a[31] = 'X'; break;
              case 2: a[32] = 'X'; break;
              case 3: a[33] = 'X'; break;
              case 4: a[34] = 'X'; break;
              case 5: a[35] = 'X'; break;
            } break;
          }
          
          // Vuelve a escribir el tablero con la X correspondiente.
          System.out.printf("  Y\n");
          System.out.printf(" (5) | "+a[30]+" | "+a[31]+" | "+a[32]+" | "+a[33]+" | "+a[34]+" | "+a[35]+" |\n");
          System.out.printf(" (4) | "+a[24]+" | "+a[25]+" | "+a[26]+" | "+a[27]+" | "+a[28]+" | "+a[29]+" |\n");
          System.out.printf(" (3) | "+a[18]+" | "+a[19]+" | "+a[20]+" | "+a[21]+" | "+a[22]+" | "+a[23]+" |\n");
          System.out.printf(" (2) | "+a[12]+" | "+a[13]+" | "+a[14]+" | "+a[15]+" | "+a[16]+" | "+a[17]+" |\n");
          System.out.printf(" (1) | "+a[6]+" | "+a[7]+" | "+a[8]+" | "+a[9]+" | "+a[10]+" | "+a[11]+" |\n");
          System.out.printf(" (0) | "+a[0]+" | "+a[1]+" | "+a[2]+" | "+a[3]+" | "+a[4]+" | "+a[5]+" |\n");
          System.out.printf("      (0) (1) (2) (3) (4) (5)  X\n\n");
          
        }
      }
      // Resta 100 puntos a puntuacion(3600) por cada fallo y suma 1 al contador para saber los intentos.
      puntuacion -= 100; 
      i++;
    }
  }
}