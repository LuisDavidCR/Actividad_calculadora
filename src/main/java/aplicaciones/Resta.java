package aplicaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase para ejecutar distintos tipos de restas.
 * @author Paolo Natham Rodriguez Vasquez
 * Funciones:
 * - MenuResta(): Muestra un menú interactivo para elegir entre distintos tipos de restas.
 * - restarDosReales(float num1, float num2): Resta dos números reales.
 * - restarDosEnteros(int numInt1, int numInt2): Resta dos números enteros.
 * - restarTresReales(float numTri1, float numTri2, float numTri3): (Actualmente suma, se debe revisar la lógica)
 * - restaAcumulada(float num): Resta un número del acumulador (inicialmente 0) y lo actualiza.
 */
public class Resta {

    Scanner input = new Scanner(System.in);
    float acumulador = 0;

    /**
     * Función principal del menú.
     * @author Paolo Natham Rodriguez Vasquez
     * 
     */
    public void menuResta() {

        char indice;

        do {
            System.out.println("\n*********** Menu Resta ***********");
            System.out.println("'R' Resta dos números reales");
            System.out.println("'N' Resta dos números enteros");
            System.out.println("'T' Resta tres números reales");
            System.out.println("'A' Resta con valor acumulado");
            System.out.println("'X' Volver atrás <----");
            System.out.println("\nTeclea una opción ");

            indice = Character.toLowerCase(input.next().charAt(0));

            switch (indice) {
                case 'r':
                    try {
                        System.out.println("Inserte el primer número (real): ");
                        float num1 = input.nextFloat();
                        // Validación para detectar números fuera del rango de float
                        if (Float.isInfinite(num1)) {
                            System.out.println("El número ingresado es demasiado grande o pequeño.");
                            break;
                        }
                        System.out.println("Inserte el segundo número (real): ");
                        float num2 = input.nextFloat();
                        if (Float.isInfinite(num2)) {
                            System.out.println("El número ingresado es demasiado grande o pequeño.");
                            break;
                        }
                        System.out.println("Respuesta: " + restarDosReales(num1, num2));
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Asegúrese de ingresar un número válido.");
                        input.nextLine(); // limpiar buffer
                    }
                    break;

                case 'n':
                    try {
                        System.out.println("Inserte el primer número (entero): ");
                        int numInt1 = input.nextInt();
                        System.out.println("Inserte el segundo número (entero): ");
                        int numInt2 = input.nextInt();
                        System.out.println("Respuesta: " + restarDosEnteros(numInt1, numInt2));
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Asegúrese de ingresar un entero válido.");
                        input.nextLine();
                    }
                    break;

                case 't':
                    try {
                        System.out.println("Inserte el primer número (real): ");
                        float numTri1 = input.nextFloat();
                        System.out.println("Inserte el segundo número (real): ");
                        float numTri2 = input.nextFloat();
                        System.out.println("Inserte el tercer número (real): ");
                        float numTri3 = input.nextFloat();
                        System.out.println("Respuesta: " + restarTresReales(numTri1, numTri2, numTri3));
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: Asegúrese de ingresar números reales válidos.");
                        input.nextLine();
                    }
                    break;

                case 'a':
                    try {
                        System.out.println("Inserte el número para restar de: " + acumulador);
                        System.out.print(": ");
                        float num = input.nextFloat();
                        if (Float.isInfinite(num)) {
                            System.out.println("El número ingresado es demasiado grande o pequeño.");
                            break;
                        }
                        System.out.println("Respuesta: " + restaAcumulada(num));
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: Asegúrese de ingresar un número real válido.");
                        input.nextLine(); // limpiar buffer
                    }
                    break;

                default:
                    System.out.println("Entrada incorrecta. Intente nuevamente.");
                    break;
            }
        } while (indice != 'x');
    }

    /**
     * Resta dos números reales.
     * @author Paolo Natham Rodriguez Vasquez
     * @param num1 Minuendo.
     * @param num2 Sustraendo.
     * @return La diferencia entre num1 y num2.
     */
    public float restarDosReales(float num1, float num2) {
        return num1 - num2;
    }

    /**
     * Resta dos números enteros.
     * @author Paolo Natham Rodriguez Vasquez
     * @param numInt1 Minuendo.
     * @param numInt2 Sustraendo.
     * @return La diferencia entre numInt1 y numInt2.
     */
    public int restarDosEnteros(int numInt1, int numInt2) {
        return numInt1 - numInt2;
    }

    /**
     * "Resta" tres números reales. Actualmente, la función suma los tres números,
     * lo que indica que hay que revisar la lógica.
     * @author Paolo Natham Rodriguez Vasquez
     * @param numTri1 Primer número.
     * @param numTri2 Segundo número.
     * @param numTri3 Tercer número.
     * @return La suma de los tres números.
     */
    public float restarTresReales(float numTri1, float numTri2, float numTri3) {
        return numTri1 + numTri2 + numTri3;
    }

    /**
     * Resta un número del acumulador.
     * El acumulador inicia en 0 y se actualiza con cada operación.
     * @author Paolo Natham Rodriguez Vasquez
     * @param num Número a restar del acumulador.
     * @return El nuevo valor del acumulador después de la resta.
     */
    public float restaAcumulada(float num) {
        acumulador -= num;
        return acumulador;
    }
}
