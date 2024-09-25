import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("numero entero: ");
        var dato = Integer.parseInt(consola.nextLine());

        var dentroRango = dato >= 1 && dato <= 10;

        System.out.println("dentroRango 1/10 = " + dentroRango);

        var fueraRango = !(dato >= 1 && dato <= 10);

        System.out.println("fueraRango 1/10 = " + fueraRango);
    }
}
