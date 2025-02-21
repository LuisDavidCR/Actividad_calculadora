import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RestaTest {
    private Resta resta;

    @BeforeEach
    void setUp() {
        resta = new Resta();
    }

    @Test
    void testRestarDosReales() {
        // restas normales 
        assertEquals(3.5f, resta.restarDosReales(5.5f, 2.0f), 0.0001);
        assertEquals(-1.5f, resta.restarDosReales(2.5f, 4.0f), 0.0001);
        assertEquals(0.0f, resta.restarDosReales(10.0f, 10.0f), 0.0001);
        assertEquals(-20.5f, resta.restarDosReales(-10.0f, 10.5f), 0.0001);
    }

    @Test
    void testRestarDosEnteros() {
        // con números enteros
        assertEquals(3, resta.restarDosEnteros(5, 2));
        assertEquals(-5, resta.restarDosEnteros(0, 5));
        assertEquals(0, resta.restarDosEnteros(7, 7));
        assertEquals(-15, resta.restarDosEnteros(-5, 10));
    }

    @Test
    void testRestarTresReales() {
        // con tres números reales
        assertEquals(-4.5f, resta.restarTresReales(5.0f, 3.0f, 6.5f), 0.0001);
        assertEquals(0.0f, resta.restarTresReales(10.0f, -5.0f, -5.0f), 0.0001);
        assertEquals(-30.0f, resta.restarTresReales(-10.0f, 10.0f, 10.0f), 0.0001);
        assertEquals(5.5f, resta.restarTresReales(10.0f, 3.0f, 1.5f), 0.0001);
    }

    @Test
    void testRestaAcumulada() {
        // con la resta acumulada, que se mantiene en memoria
        assertEquals(-5.0f, resta.restaAcumulada(5.0f), 0.0001);
        assertEquals(-8.0f, resta.restaAcumulada(3.0f), 0.0001);
        assertEquals(-10.0f, resta.restaAcumulada(2.0f), 0.0001);
        assertEquals(-15.5f, resta.restaAcumulada(5.5f), 0.0001);
    }

    @Test
    void testNumerosMuyGrandes() {
        //  con valores extremos 
        assertEquals(Float.POSITIVE_INFINITY, resta.restarDosReales(Float.MAX_VALUE, -Float.MAX_VALUE), 0.0001);
        assertEquals(Float.NEGATIVE_INFINITY, resta.restarDosReales(-Float.MAX_VALUE, Float.MAX_VALUE), 0.0001);
        assertEquals(0, resta.restarDosEnteros(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals(-1, resta.restarDosEnteros(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
