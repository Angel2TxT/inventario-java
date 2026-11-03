import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {
    @Test
    void testCalcularSubTotal() {
        int resultado = calcularSubTotal(50, 10);
        assertEquals(200, resultado);
    }
}
