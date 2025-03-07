package aplicaciones;

import java.util.Scanner;

public class Producto {


    /**
     * Clase que sirve para seleccionar el tipo de producto que se va a realizar.
     * @author Andrés Alejandro Romera Mata.
     * @return Void porque los resultados de las operaciones lo devuelve cada operación.
     */

    public static void menu_producto() {
        Scanner sc = new Scanner(System.in);
        char indice;
        do {
            System.out.println("Elige el tipo de producto que quieres realizar: ");
            System.out.println("Para operacion de 2 reales pulse 'R'");
            System.out.println("Para operacion de 2 enteros pulse 'N'");
            System.out.println("Para operacion de 3 reales pulse 'T'");
            System.out.println("Para potencia pulse 'E'");
            System.out.println("Para salir pulse 'X'");

            indice = sc.next().charAt(0);

            switch (indice) {
                case 'R':
                    System.out.println("Inserte el primer numero: ");
                    float num1 = sc.nextFloat();
                    System.out.println("Inserte el segundo numero: ");
                    float num2 = sc.nextFloat();
                    System.out.println("El resultado es: " + reales(num1, num2));
                    break;
                case 'N':
                    System.out.println("Inserte el primer numero: ");
                    int num3 = sc.nextInt();
                    System.out.println("Inserte el segundo numero: ");
                    int num4 = sc.nextInt();
                    System.out.println("El resultado es: " + enteros(num3, num4));
                    break;
                case 'T':
                    System.out.println("Inserte el primer numero: ");
                    float num5 = sc.nextFloat();
                    System.out.println("Inserte el segundo numero: ");
                    float num6 = sc.nextFloat();
                    System.out.println("Inserte el tercer numero: ");
                    float num7 = sc.nextFloat();
                    System.out.println("El resultado es: " + tres_reales(num5, num6, num7));
                    break;
                case 'E':
                    System.out.println("Inserte la base: ");
                    double base = sc.nextDouble();
                    System.out.println("Inserte el exponente: ");
                    double exponente = sc.nextDouble();
                    System.out.println("El resultado es: " + exponente(base, exponente));
                    break;
                default:
                    System.out.println("Entrada incorrecta");
                    break;
            }
        } while (indice!='X');
    }

    /**
     * Clase que multiplica dos números reales
     * @author Andrés ALejandro Romera Mata
     * @param num1 float del primer operador del producto
     * @param num2 float del segundo operador del producto
     * @return float de multiplicar num1 y num2
     */

    static float reales(float num1, float num2) {
        return num1 * num2;
    }

    /**
     * Clase que multiplica dos números enteros
     * @author Andrés ALejandro Romera Mata
     * @param num1 int del primer operador del producto
     * @param num2 int del segundo operador del producto
     * @return int de multiplicar num1 y num2
     */

    static int enteros(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Clase que multiplica tres números reales
     * @author Andrés ALejandro Romera Mata
     * @param num1 float del primer operador del producto
     * @param num2 float del segundo operador del producto
     * @param num3 float del tercer operador del producto
     * @return float de multiplicar num1, num2 y num3
     */

    static float tres_reales(float num1, float num2, float num3) {
        return num1 * num2 * num3;
    }

    /**
     * Clase que realiza la operacion del exponente
     * @author Andrés ALejandro Romera Mata
     * @param base double de base de la operación
     * @param exponent double del exponente de la operación
     * @return double que devuelve el resultado de multiplicar exponent-veces la base
     */

    static double exponente(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}