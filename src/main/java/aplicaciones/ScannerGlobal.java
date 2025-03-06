package aplicaciones;

import java.util.Scanner;

/**
 * Clase para generar un solo Scanner en memoria para la entrada de datos
 * que usen todas las clases necesarias y cerrarlo solo en el main.
 * @author Luis Calzadilla Romero
 */
public class ScannerGlobal {
    public static final Scanner leer = new Scanner(System.in);
}
