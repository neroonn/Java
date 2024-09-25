import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Introduce calificacion numerica: ");
        var calificacionNumerica = Integer.parseInt(consola.nextLine());

        switch (calificacionNumerica){
            case 9,10 -> System.out.println("A");
            case 8 -> System.out.println("B");
            case 7 -> System.out.println("C");
            case 6 -> System.out.println("D");
            case 0,1,2,3,4,5 -> System.out.println("F");
            default -> System.out.println("-0");
        }


    }
}
