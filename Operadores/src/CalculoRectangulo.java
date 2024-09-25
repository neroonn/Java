import java.util.Scanner;

public class CalculoRectangulo {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Base del rectangulo: ");
        var baseRectangulo = Float.parseFloat(consola.nextLine());

        System.out.print("Altura del rectangulo: ");
        var alturaRectangulo = Float.parseFloat(consola.nextLine());

        var baseMasAltura = baseRectangulo + alturaRectangulo;
        var area = baseRectangulo * alturaRectangulo;
        var perimetro = 2*(baseRectangulo+alturaRectangulo);

        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
}
