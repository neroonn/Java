import java.util.Scanner;

public class calculadoraDos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int opcion1 = 0,opcion2 = 0,resultado;
        var salir = false;

        while(!salir){
            System.out.printf("""
                    Calculadora:
                    1.Suma
                    2.Resta
                    3.Multiplicacion
                    4.Division
                    5.Salir
                    Escoge una opcion:\s""");
            var opcion = consola.nextInt();
            if (opcion >= 1 & opcion <=4){
                System.out.println("Primer valor: ");
                opcion1 = consola.nextInt();
                System.out.println("Segundo valor");
                opcion2 = consola.nextInt();
            }
            switch (opcion){
                case 1 ->{
                    resultado = opcion1 + opcion2;
                    System.out.printf("Resultado suma: %d%n%n",resultado);
                }
                case 2 ->{
                    resultado = opcion1 - opcion2;
                    System.out.printf("Resultado resta: %d%n%n",resultado);
                }
                case 3 ->{
                    resultado = opcion1 * opcion2;
                    System.out.printf("Resultado multiplicacion: %d%n%n",resultado);
                }
                case 4 ->{
                    if (opcion2 !=0){
                        resultado = opcion1 / opcion2;
                        System.out.printf("Resultado Division: %d%n%n",resultado);
                    }
                    else {
                        System.out.println("No podes dividir entre 0");
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo");
                    salir = true;
                }
                default -> {
                    System.out.println("Error");
                }
            }
        }


    }
}
