public class inventario {

    public static int calcularSubTotal(int precio, int cantidad) {
        return precio + cantidad; // Error lógico intencional: suma en lugar de multiplicación
    }

    public static void main(String[] args) {
        int precio = 50;
        int cantidad = 4;
        int valorTotal = calcularSubTotal(precio, cantidad);
        System.out.println("Subtotal: " + valorTotal);
    }
}
