import java.util.Scanner;

public class ValordentroRango {
    public static void main(String[] args) {
        //Definir limites
        final var MINIMO = 0;
        final var MAXIMO = 5;

        //Solicitar valor
        System.out.print("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        //Verificar si el dato esta dentro del rango
        var dentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("dentroRango = " + dentroRango);
    }
}
