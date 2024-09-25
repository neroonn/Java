import java.util.Scanner;

public class CajeroDos {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var saldo = 1000;
        var salir = false;

        System.out.println("*** Cajero Automatico***");
        while (!salir){
            System.out.printf("""      
                    1. Ver saldo
                    2. Retirar
                    3.Depositar
                    4.Salir
                    Elige una opcion:\s""");

            var opcion = consola.nextInt();
            switch (opcion ){
                case 1 -> System.out.printf("Tu saldo es: $%d%n%n",saldo);
                case 2 -> {
                    System.out.printf("Cantidad a retirar: ");
                    var retiro = consola.nextInt();
                    if (retiro <= saldo){
                        saldo -= retiro;
                        System.out.printf("Tu nuevo saldo es: $%d%n",saldo);
                    }
                    else {
                        System.out.printf("No tienes suficiente saldo para retirar.\n");
                    }
                }
                case 3 ->{
                    System.out.println("Cantidad a depositar: ");
                    var deposito = consola.nextInt();
                    saldo += deposito;
                    System.out.printf("Tu nuevo saldo es: $%d%n%n",saldo);
                }
                case 4 ->{
                    System.out.println("Saliendo del sistema...\n");
                    salir = true;
                }
                default -> System.out.println("Dato incorrecto.\n");
            }
        }
    }
}
