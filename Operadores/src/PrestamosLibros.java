import java.util.Scanner;

public class PrestamosLibros {
    public static void main(String[] args) {

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.println("Credencial estuadiante (t/f)");
        var tinensCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.println("A cuantos km vives de la biblioteca");
        var kmBiblioteca = Integer.parseInt(consola.nextLine());

        var elegiblePrestamo = tinensCredencial || kmBiblioteca < DISTANCIA_PERMITIDA_KM;
        System.out.println("elegiblePrestamo = " + elegiblePrestamo);
    }
}
