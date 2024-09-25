import java.util.Scanner;

public class GeneracionTIcket {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Preico leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.println("Preico pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.println("Aplicar descuento");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());


        //Calculo total sin impuestos
        var subtotal = precioPan+precioPan;

        //Aplicar descuento
        var descuento = subtotal * (descuentoPorcentaje/100.0);

        //Subtotal con descuento
        var subtotalConDescuento =  subtotal-descuento;

        // + impuestos
        var impuestos = subtotalConDescuento*0.50;

        //total
        var total = subtotalConDescuento+impuestos;

        System.out.println("total = " + total);

        System.out.printf("""
                \tTotal sin impuestos: $%.2f
                \tImpuestos(50%%): $%.2f
                \tTotal: $%.2f
                """,subtotal,impuestos,total);


    }
}
