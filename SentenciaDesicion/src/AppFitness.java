import java.util.Scanner;

public class AppFitness {
    public static void main(String[] args) {


        var consola = new Scanner(System.in);
        System.out.println("Nombre usuario: ");
        var nombre = consola.nextLine();

        System.out.println("Pasos caminados al dia: ");
        var pasos = Integer.parseInt(consola.nextLine());

        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        var caloriasQuemadas = pasos * CALORIAS_POR_PASO;

        var metaAlcanzada = (pasos >= META_PASOS_DIARIO) ? "Felicidades "+nombre+" alcanzaste la meta diaria de pasos" : nombre+" no alcanzaste la meta de pasos diarios";
        System.out.println("caloriasQuemadas = " + caloriasQuemadas);
        System.out.println("metaAlcanzada = " + metaAlcanzada);
    }
}
