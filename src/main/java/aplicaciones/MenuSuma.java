package aplicaciones;

import static aplicaciones.ValidarEntradas.*;
import static javabeans.Suma.*;

/**
 * Muestra el menu suma
 * @author Luis Calzadilla / @LuisDavidCR
 * @see javabeans.Suma
 */

public class MenuSuma {

    /**
     * Ejecuta la opcion en el menu elijida y muestra el resulta.
     * captura excepciones si las hubiese.
     */
    public static void menuSuma() {
        int opcion;

        do {
            opcion = pintarMenu();
            switch(opcion) {
                case 1:
                    try {
                        System.out.println("El resultado de la suma es: " +
                                sumarDosEnteros(ingresaEntero(), ingresaEntero()));
                    }catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("El resultado de la suma es: " +
                                sumarDosReales(ingresaReal(), ingresaReal()));
                    }catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("El resultado de la suma es: " +
                                sumarTresReales(ingresaReal(), ingresaReal(), ingresaReal()));
                    }catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        sumaAcumulada(ingresaReal());
                        System.out.println("La suma acumulada es: " + getAcumulador());
                    }catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
            }


        }while(opcion != 5);

        System.out.println("FIN DE PROCESO");


    }

    /**
     * Imprime en la consola las opciones a elegir.
     * @return opcion , devuelve la opcion elegida.
     */
    public static int pintarMenu() {
        int opcion = 0;

        System.out.println("\n************Menu Suma************\n");
        System.out.println("1.- Suma dos numeros enteros");
        System.out.println("2.- Suma dos numeros reales");
        System.out.println("3.- Suma tres numeros reales");
        System.out.println("4.- Suma con valor acumulado");
        System.out.println("5.- Volver atras y reiniciar el acumulador\n");

        System.out.println("Teclea una opcion, 5 para volver atras");

        opcion = ingresaOpcion();
        if (opcion == 5)    // reinicia el acumulador a 0.
            reiniciarAcumulador();
        return opcion;
    }
}
