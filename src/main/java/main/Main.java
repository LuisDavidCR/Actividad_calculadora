package main;


import aplicaciones.ScannerGlobal;
import static aplicaciones.MenuOpciones.pintarMenu;
import static aplicaciones.MenuSuma.menuSuma;

import aplicaciones.Resta;
/** Clase Main donde se gestiona el menu de la calculadora
 * @author Luis Calzadilla / @LuisDavidCR
 * @version 0.1
 * @see aplicaciones.MenuOpciones
 * @see aplicaciones.ScannerGlobal
 * @see aplicaciones.MenuSuma
 */

public class Main {


    public static void main(String[] args) {
        int opcion = 0;

        do {
            opcion = pintarMenu();
            switch(opcion) {
                case 1:
                    menuSuma();
                    break;
                case 2:
                    Resta resta = new Resta();
                    resta.menuResta();
                    break;
                case 3:
                    System.out.println("Metodo Producto");
                    break;
                case 4:
                    System.out.println("Metodo División");
                    break;
            }


        }while(opcion != 5);

        System.out.println("FIN DE PROCESO");
        ScannerGlobal.leer.close();
    }

}