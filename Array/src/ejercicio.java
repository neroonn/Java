import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("largo del array: ");
        var numeroArray = Integer.parseInt(consola.nextLine());

        int[] entero = new int[numeroArray];

        for (var i = 0;i < numeroArray; i++){
            System.out.println("Introduce enteros ["+i+"] : ");
            entero[i] = Integer.parseInt(consola.nextLine());
        }
        for(var i = 0;i < numeroArray;i++){
            System.out.println("Entero["+i+"] ="+entero[i]);
        }
    }
}
