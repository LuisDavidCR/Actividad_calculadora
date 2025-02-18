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
        if (a + b >= MAX_VALUE || a + b <= MIN_VALUE)
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
        if (a + b > Double.MAX_VALUE  || a + b < -Double.MAX_VALUE )
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
        if (a + b + c > Double.MAX_VALUE || a + b + c < -Double.MAX_VALUE)
            throw new ArithmeticException("Supera el valor maximo o minimo admito");
        return a + b + c;
    }

    /**
     * Suma el valor recivido a la variable acumulador
     * @param a valor a sumar.
     * @return acumulador =+ a.
     */
    public static double sumaAcumulada(double a) {
        if (a == 0)
            return acumulador = 0;
        return acumulador = acumulador + a;
    }

}

