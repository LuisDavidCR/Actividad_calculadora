package javabeans;

import static java.lang.Integer.*;

/**
 * Proporciona las operaciones de suma todos sus metodos son estaticos.
 * @author Luis Calzadilla / @LuisDavidCR
 * @version 0.1
 * @param acumulador -- guarda  valor acumulado.
 */

public class Suma {

    private static double acumulador;

    public static double getAcumulador() {
        return acumulador;
    }


    /**
     * Realiza la suma de dos numeros enteros.
     * @param a Primer numero entero.
     * @param b Segundo numero entero.
     * @throws ArithmeticException si la cantidad supera el rango int.
     * @return La suma de a y b.
     */

    public static int sumarDosEnteros(int a, int b) {
        if ((a > 0 && b > MAX_VALUE - a) || (a < 0 && b < MIN_VALUE -a))
            throw new ArithmeticException("Supera el valor maximo o minimo admitido");
        return a + b;
    }

    /**
     * Realiza la suma de dos números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @throws ArithmeticException si la cantidad supera el rango Double.
     * @return La suma de a y b.
     */

    public static double sumarDosReales(double a, double b) {
        if ((a > 0 && b > Double.MAX_VALUE - a) || (a < 0 && b < -Double.MAX_VALUE -a ))
            throw new ArithmeticException("Supera el valor maximo o minimo admitido");
        return a + b;
    }

    /**
     * Realiza la suma de tres números reales.
     * @param a Primer número real.
     * @param b Segundo número real
     * @param c Tercer número real.
     * @throws ArithmeticException si la cantidad supera el rango Double.
     * @return La suma de a y b.
     */

    public static double sumarTresReales(double a, double b, double c) {
        //verificar primero si supera el limite en a + b.
        if ((a > 0 && b > Double.MAX_VALUE - a) || (a < 0 && b < -Double.MAX_VALUE -a))
            throw new ArithmeticException("Supera el valor maximo o minimo admitido");
        double suma1 = a +b;
        //verificar ahora suma1 + c.
        if ((c > 0 && suma1 > Double.MAX_VALUE - c) || (c < 0 && suma1 < -Double.MAX_VALUE -c))
            throw new ArithmeticException("Supera el valor maximo o minimo admitido");
        return suma1 + c;
    }

    /**
     * Reinicia la variable acumulador a cero.
     */
    public static void  reiniciarAcumulador() {
        acumulador = 0;
    }

    /**
     * Suma el valor recivido a la variable acumulador.
     * @param a valor que se a sumar al acumulador.
     * @throws ArithmeticException si la cantidad supera el rango Double.
     * @return acumulador =+ a. se guarda en la varialble.
     */
    public static double sumaAcumulada(double a) {
        if (acumulador == 0)
            return acumulador = a;
        if ((a > 0 && acumulador > Double.MAX_VALUE - a) || (a < 0 && acumulador < -Double.MAX_VALUE -a))
            throw new ArithmeticException("Supera el valor maximo o minimo admitido");
        return acumulador = acumulador + a;
    }

}

