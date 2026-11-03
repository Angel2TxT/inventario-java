import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {
    @Test
    void testCalcularSubTotal() {
        int resultado = inventario.calcularSubTotal(50, 4);
        assertEquals(200, resultado);
    }
}
