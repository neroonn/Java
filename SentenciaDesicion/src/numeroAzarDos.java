import java.util.Random;
import java.util.Scanner;

public class numeroAzarDos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var azar = new Random();

        var numeroAleatorio = azar.nextInt(11);
        var intentos = 0;
        var adivinar = 0;
        final var INTENTOS = 3;

        while (numeroAleatorio != adivinar & intentos < INTENTOS){
            System.out.println("Adivina el numero del 1 al 10.");
            adivinar = consola.nextInt();

            if (adivinar < numeroAleatorio){
                System.out.println("Elige un numero Mayor");
            } else if (adivinar > numeroAleatorio) {
                System.out.println("Elige un numero menor");
            }

            intentos++;
        }

        if (adivinar == numeroAleatorio){
            System.out.printf("Ganaste! intentos: %dn%n%n",intentos);
        }else {
            System.out.println("Perdiste!");
            System.out.printf("El numero era: %d",numeroAleatorio);
        }

    }
}
