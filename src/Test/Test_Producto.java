package Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @BeforeEach
    void setUp() {}
    Producto producto=new Class.Producto();

    @Test
    void producto_reales() {
        float resultado = producto.reales(1.5,3.4);
        assertEquals(5.1, resultado, "El resultado de reales debería ser 5.1");
    }

    @Test
    void proucto_enteros(3) {
        int resultado = producto.enteros(1,3);
        assertEquals(3, resultado, "El resultado de enteros debería ser 3");
    }

    @Test
    void producto_tres_reales() {
        float resultado = producto.tres_reales(1,2,3);
        assertEquals(6, resultado, "El resultado de tres reales debería ser 6");
    }

    @Test
    void exponente() {
        double resultado = producto.exponente(3,2);
        assertEquals(9, resultado, "El resultado del exponente debería ser: 9.0");
    }
}
