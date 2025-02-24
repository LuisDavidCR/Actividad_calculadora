package aplicaciones;

import java.util.InputMismatchException;

/**
 * Valida los datos de entrada.
 * @author Luis Calzadilla / @LuisDavidCR
 */

public class ValidarEntradas {

    /**
     * Valida el ingreso de un numero entero.
     * @throws ArithmeticException si el dato es invalido.
     * @return numero -- devuelve el valor aceptado.
     */

    public static int ingresaEntero() {

        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Introduce un numero entero");
            try {
                numero = ScannerGlobal.leer.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("numero fuera de rango o valor no numerico");
                ScannerGlobal.leer.next();
            }
        }
        return numero;
    }

    /**
     * Valida el ingreso de un numero real.
     * @throws ArithmeticException si el dato es invalido.
     * @return numero -- devuelve el valor aceptado.
     */

    public static double ingresaReal() {

        double numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Introduce un numero real");
            try {
                numero = ScannerGlobal.leer.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("numero fuera de rango o valor no numerico");
                ScannerGlobal.leer.next();
            }
        }
        return numero;
    }

    /**
     * Valida la opcion escogida.
     * @return opcion -- devuelve la opcion aceptada.
     */

    public static int ingresaOpcion() {
        int opcion = 0;
        while(true) {
            if (ScannerGlobal.leer.hasNextInt()) {   /// Verifica que valor ingresado sea un numero entero
                opcion = ScannerGlobal.leer.nextInt();
                if (opcion < 1 || opcion > 5) { ///Fuera de Rango de valores
                    System.out.println("Opcion incorrecta, validos del 1 al 5");
                }
                else
                    break;
            }
            else {
                System.out.println("Opcion incorrecta, solo debes ingresar numeros enteros.");
                ScannerGlobal.leer.next(); /// si no es un valor entero descarta la salida
            }

        }
        return opcion;
    }
}
