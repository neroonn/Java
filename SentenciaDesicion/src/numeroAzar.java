import java.util.Random;
import java.util.Scanner;

public class numeroAzar {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        Random azar = new Random();
        int intentos;

        for (intentos = 3; intentos >=1; intentos--){
            int numeroAzar = azar.nextInt(6);
            System.out.println("numeroAzar = " + numeroAzar);
            System.out.println("Intentos: "+intentos);
            System.out.println("Adivina un numero del 1 al 5.");
            var numero = consola.nextInt();
            if (numeroAzar == numero){
                System.out.println("Ganaste!");
            }else {
                System.out.println("Numero incorrecto!");
            }

        }

    }
}
