import java.util.Scanner;

public class Estacion {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("Proporciona numero del mes 1/12: ");
        var mes = Integer.parseInt(consola.nextLine());

        switch (mes){
            case 12,1,2 -> System.out.println("Verano");
            case 3,4,5 -> System.out.println("Otoño");
            case 6,7,8 -> System.out.println("Invierno");
            case 9,10,11 -> System.out.println("Primavera");
            default -> System.out.println("*********");
        }
    }
}
