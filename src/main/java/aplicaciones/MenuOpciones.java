package aplicaciones;


import static aplicaciones.ValidarEntradas.ingresaOpcion;

/** Clase para mostrar el menu en consola
 * @author Luis Calzadilla / @LuisDavidCR
 * @version 0.1
 */

public class MenuOpciones {

    /** Método para gestinar el Menu Principal
     * @param opcion - tipo int, inicia a 0.
     * @return opcion --  valor recivido.
     */
    public static int pintarMenu() {
        int opcion = 0;

        System.out.println("\n************ACTIVIDAD CALCULADORA************\n");
        System.out.println("1.- Operaciones Suma");
        System.out.println("2.- Operaciones Resta");
        System.out.println("3.- Operaciones Producto");
        System.out.println("4.- Operaciones Divicion");
        System.out.println("5.- Salir\n");

        System.out.println("Teclea una opcion, 5 para salir");

        opcion = ingresaOpcion();

        return opcion;
    }

}
