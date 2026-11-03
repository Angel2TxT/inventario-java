import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {
    @Test
    void testCalcularSubTotal() {
        int resultado = inventario.calcularSubTotal(50, 4);
        // Fallo intencional: se espera 999 pero el resultado es 200
        assertEquals(999, resultado);
    }
}

