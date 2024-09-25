import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Cual fue el monto de tu compra?: ");
        var montoCompra = Integer.parseInt(consola.nextLine());

        System.out.println("Eres miembro de la tienda? (t/f): ");
        boolean miembroTienda = Boolean.parseBoolean(consola.nextLine());

        double descuento = montoCompra *0.1;
        double descuento2 = montoCompra *0.05;

        var montoDescuento = montoCompra - descuento;

        if (montoCompra > 1000 && miembroTienda){
            System.out.printf("""
                    Felicidades, obtuviste un descuento del 10%%.
                    Monto de la compra:$%d
                    Monto del descuento:$%f
                    Monto final de la compra con descuento:$%f
                    """,montoCompra,descuento,montoDescuento);
        }else if (montoCompra < 1000 && miembroTienda){
            System.out.printf("""
                    Felicidades, obtuviste un descuento del 5%%.
                    Monto de la compra:$%d
                    Monto del descuento:$%f
                    Monto final de la compra con descuento:$%f
                    """,montoCompra,descuento2,montoDescuento);
        }else{
            System.out.println("No obtuviste ningun descuento.Monto final: $"+montoCompra);
        }
    }
}
