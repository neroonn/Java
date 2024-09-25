import java.util.Scanner;

public class SistemaDescuentos {
    public static void main(String[] args) {

        final var NO_PRODUCTOS_DESCUENTOS = 10;
        var consola = new Scanner(System.in);

        System.out.println("Cuantos productos compraste hoy?");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.println("Tines la membresia de la tienda (true/false)");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var tieneDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTOS && tienesMembresia;

        System.out.println("tienes Descuento = " + tieneDescuento);
    }
}
