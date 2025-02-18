package Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @BeforeEach
    void setUp() {
        Division division = new Division();
    }

    @org.junit.jupiter.api.Test
    void reales() {
        float resultado = division.reales(4.5,2);
        assertEquals(2.25, resultado,"Si divides 4.5 entre 2 debería dar 2.25");

    }

    @org.junit.jupiter.api.Test
    void enteros() {
        int resultado = division.enteros(4,2);
        assertEquals(2, resultado,"Si divides 4 entre 2 debería dar 2");
    }

    @org.junit.jupiter.api.Test
    void inverso() {
        float resultado = division.inverso(4);
        assertEquals(0.25, resultado,"Si haces el inverso de 4 daría 1/4 o lo que es lo mismo, 0.25");
    }

    @org.junit.jupiter.api.Test
    void raiz() {
        float resultado = division.reales(4);
        assertEquals(2, resultado,"La raiz de 4 debería de dar 2");
    }
}
