package javabeans;

import static java.lang.Integer.*;

/**
 * Clase que proporciona operaciones matemáticas básicas.
 *  * @author Luis Calzadilla / @LuisDavidCR
 *  * @version 0.1
 * @param acumulador -- guarda  valor acumulado.
 */

public class Suma {

    private static double acumulador;

    public static double getAcumulador() {
        return acumulador;
    }


    /**
     * Realiza la suma de dos n&uacute;meros enteros.
     *
     * @param a Primer n&uacute;mero entero.
     * @param b Segundo n&uacute;mero entero.
     * @throws ArithmeticException si la cantidad supera el rango int.
     * @return La suma de a y b.
     */

    public static int sumarDosEnteros(int a, int b) {
        if ((a > 0 && b > MAX_VALUE - a) || (a < 0 && b < MIN_VALUE -a))
            throw new ArithmeticException("Supera el valor maximo o minimo admitido");
        return a + b;
    }

    /**
     * Realiza la suma de dos números decimales (reales).
     *
     * @param a Primer número decimal.
     * @param b Segundo número decimal.
     * @throws ArithmeticException si la cantidad supera el rango Double.
     * @return La suma de a y b.
     */

    public static double sumarDosReales(double a, double b) {
        if ((a > 0 && b > Double.MAX_VALUE - a) || (a < 0 && b < -Double.MAX_VALUE -a ))
            throw new ArithmeticException("Supera el valor maximo o minimo admito");
        return a + b;
    }

    /**
     * Realiza la suma de dos números decimales (reales).
     *
     * @param a Primer número decimal.
     * @param b Segundo número decimal.
     * @param c Tercer número decinal.
     * @throws ArithmeticException si la cantidad supera el rango Double.
     * @return La suma de a y b.
     */

    public static double sumarTresReales(double a, double b, double c) {
        //verificar primero si supera el limite en a + b.
        if ((a > 0 && b > Double.MAX_VALUE - a) || (a < 0 && b < -Double.MAX_VALUE -a))
            throw new ArithmeticException("Supera el valor maximo o minimo admito");
        double suma1 = a +b;
        //verificar ahora suma1 + c.
        if ((c > 0 && suma1 > Double.MAX_VALUE - c) || (c < 0 && suma1 < -Double.MAX_VALUE -c))
            throw new ArithmeticException("Supera el valor maximo o minimo admito");
        return suma1 + c;
    }

    /**
     * Reinicia la variable acumulador a cero.
     */
    public static void  reiniciarAcumulador() {
        acumulador = 0;
    }

    /**
     * Suma el valor recivido a la variable acumulador
     * @param a valor a sumar.
     * @return acumulador =+ a.
     */
    public static double sumaAcumulada(double a) {
        if (acumulador == 0)
            return acumulador = a;
        if ((a > 0 && acumulador > Double.MAX_VALUE - a) || (a < 0 && acumulador < -Double.MAX_VALUE -a))
            throw new ArithmeticException("Supera el valor maximo o minimo admito");
        return acumulador = acumulador + a;
    }

}

