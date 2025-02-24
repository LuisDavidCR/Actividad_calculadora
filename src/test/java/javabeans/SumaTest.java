package javabeans;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    //metodos estaticos no hace falta inicializar un objeto de clase.

    @Test
    void sumarDosEnteros() {
        //caso1 suma de dos enteros positivos resultado entero positivo
        assertEquals(10, Suma.sumarDosEnteros(4, 6), "La suma de 4 y 6 debe ser 10");

        //caso2 suma de dos enteros negativos resultado entero negativo
        assertEquals(-10, Suma.sumarDosEnteros(-4, -6), "La suma de -4 y -6 debe ser -10");

        //caso3 suma de un entero mayor positivo y un entero menor negativo resultado entero positivo
        assertEquals(2, Suma.sumarDosEnteros(-4, 6), "La suma de -4 y 6 debe ser 2");

        //caso4 suma de un entero mayor negativo y un entero menor positivo resultado entero negativo
        assertEquals(-2, Suma.sumarDosEnteros(4, -6), "La suma de 4 y -6 debe ser -2");

        //caso5 suma de dos enteros supera el maximo admitido lanza una excepcion
        assertThrows(ArithmeticException.class, () -> Suma.sumarDosEnteros(Integer.MAX_VALUE, 1));

        //caso suma de dos enteros supera el minimo admitido lanza una excepcion
        assertThrows(ArithmeticException.class, () -> Suma.sumarDosEnteros(Integer.MIN_VALUE, -1));
    }

    @Test
    void sumarDosReales() {
        //caso1 suma de dos reales positivos resultado real positivo
        assertEquals(5.9, Suma.sumarDosReales(3.5, 2.4),
                0.0001, "La suma de 3.5 y 2.4 debe ser 5.9");

        //caso2 suma de dos reales negativos resultado real negativo
        assertEquals(-5.9, Suma.sumarDosReales(-3.5, -2.4),
                0.0001, "La suma de -3.5 y -2.4 debe ser 5.9");

        //caso3 suma de un real mayor positivo y un real menor negativo resultado real positivo
        assertEquals(1.1, Suma.sumarDosReales(3.5, -2.4),
                0.0001, "La suma de 3.5 y -2.4 debe ser 1.1");

        //caso4 suma de un real mayor negativo y un real menor positivo resultado real negativo
        assertEquals(-1.1, Suma.sumarDosReales(-3.5, 2.4),
                0.0001, "La suma de -3.5 y 2.4 debe ser -1.1");

        //caso5 suma de dos reales supera el maximo admitido lanza una excepcion
        assertThrows(ArithmeticException.class, () -> Suma.sumarDosReales(Double.MAX_VALUE, 1));

        //caso suma de dos reales supera el minimo admitido lanza una excepcion
        assertThrows(ArithmeticException.class, () -> Suma.sumarDosReales(-Double.MAX_VALUE, -1));
    }

    @Test
    void sumarTresReales() {
        //caso1 suma de tres reales positivos resultado real positivo
        assertEquals(9.9, Suma.sumarTresReales(3.3, 3.3, 3.3), 0.0001);

        //caso2 suma de tres reales negativos resultado real negativo
        assertEquals(-9.9, Suma.sumarTresReales(-3.3, -3.3, -3.3), 0.0001);

        //caso3 suma de dos reales supera el maximo admitido lanza una excepcion
        assertThrows(ArithmeticException.class, () -> Suma.sumarTresReales(Double.MAX_VALUE, 1.1, 0.1));

        //caso4 suma de dos reales supera el minimo admitido lanza una excepcion
        assertThrows(ArithmeticException.class, () -> Suma.sumarTresReales(-1.1, -0.1, -Double.MAX_VALUE));
    }

    @Test
    void sumaAcumulada() {
        //caso1 introducir valores que se acumulen
        assertEquals(5.1, Suma.sumaAcumulada(5.1), 0.0001);
        assertEquals(8.2, Suma.sumaAcumulada(3.1), 0.0001, "5.1 + 3.1 = 8.2");
        assertEquals(10.3, Suma.sumaAcumulada(2.1), 0.0001, "8.2 + 2.1 = 10.3");

        //caso2 suma de dos reales supera el maximo admitido lanza una excepcion
        assertThrows(ArithmeticException.class, () -> Suma.sumaAcumulada(Double.MAX_VALUE +1));
    }
}