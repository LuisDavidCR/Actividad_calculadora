package aplicaciones;

import java.util.Scanner;

public class Division {

    /**
     * Clase que sirve para seleccionar el tipo de Division que se va a realizar.
     * @author Andrés Alejandro Romera Mata.
     * @return Void porque los resultados de las operaciones lo devuelve cada operación.
     */

    public static void menu_division() {
        Scanner sc = new Scanner(System.in);
        char indice;
        do {
            System.out.println("Elige el tipo de division que quieres realizar: ");
            System.out.println("Para operacion de 2 reales pulse 'R'");
            System.out.println("Para operacion de 2 enteros pulse 'N'");
            System.out.println("Para operacion invertir 'I'");
            System.out.println("Para raiz cuadrada 'C'");
            System.out.println("Para salir pulse 'X'");

            indice = sc.next().charAt(0);

            switch (indice) {
                case 'R':
                    System.out.println("Introduzca el primer numero: ");
                    float num1 = sc.nextFloat();
                    System.out.println("Introduzca el segundo numero: ");
                    float num2 = sc.nextFloat();
                    while (num2==0f) {
                        System.out.println("Introduzca el segundo numero: ");
                        num2 = sc.nextFloat();
                    }
                    System.out.println("El resultado es: " + reales(num1, num2));
                    break;
                case 'N':
                    System.out.println("Introduzca el primer numero: ");
                    int num3 = sc.nextInt();
                    System.out.println("Introduzca el segundo numero: ");
                    int num4 = sc.nextInt();
                    while (num4 ==0){
                        System.out.println("Introduzca el segundo numero: ");
                        num4 = sc.nextInt();
                    }
                    System.out.println("El resultado es: " + enteros(num3, num4));
                    break;
                case 'I':
                    System.out.println("Introduzca el segundo numero: ");
                    float num5 = sc.nextFloat();
                    while (num5 ==0f){
                        System.out.println("Introduzca el segundo numero: ");
                        num5 = sc.nextFloat();
                    }
                    System.out.println("El resultado es: " + inverso(num5));
                    break;
                case 'C':
                    System.out.println("Introduzca el segundo numero: ");
                    int num6 = sc.nextInt();
                    System.out.println("El resultado es: "+ raiz(num6));
                    break;
                default:
                    System.out.println("Entrada incorrecta");
                    break;
            }
        } while (indice!='X');
    }

    /**
     * Clase que divide dos números reales
     * @author Andrés ALejandro Romera Mata
     * @param num1 float del dividendo
     * @param num2 float del divisor
     * @return float de dividir num1 y num2
     */

    static float reales(float num1, float num2) {
        return num1 / num2;
    }

    /**
     * Clase que divide dos números enteros
     * @author Andrés ALejandro Romera Mata
     * @param num1 int del dividendo
     * @param num2 int del divisor
     * @return int de dividir num1 y num2
     */

    static int enteros(int num1, int num2) {
        return num1 / num2;
    }

    /**
     * Clase que realiza el inverso
     * @author Andrés ALejandro Romera Mata
     * @param num1 float del primer operador del producto
     * @return float de invertir num1
     */

    static float inverso(float num1) {
        return 1/num1;
    }

    /**
     * Clase que realiza la raiz cuadrada
     * @author Andrés ALejandro Romera Mata
     * @param rc int del cual se obtener la raiz cuadrada
     * @return double que devuelve el resultado de la raiz cuadrada
     */

    static double raiz(int rc) {
        return Math.sqrt(rc);
    }
}

