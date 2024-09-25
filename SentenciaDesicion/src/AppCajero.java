import java.util.Scanner;

public class AppCajero {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;
        var saldo = 1000;

        System.out.println("*** Cajero automatico ***");
        //Menu aplicacion
        while(!salir){
            System.out.printf("""
                    Operaciones que puedes realizar:
                    1.Consultar saldo
                    2.Retirar
                    3.Depositar
                    4.Salir
                    Escoge una opcion:\s""");
            var opcion = consola.nextInt();

            switch (opcion){
                case 1 -> System.out.printf("El saldo es de: $%d%n%n",saldo);
                case 2 -> {

                        System.out.print("Ingresa el monto a retirar: ");
                        var retiro = consola.nextInt();
                        if(retiro <= saldo){
                            saldo -= retiro;
                            System.out.printf("Tu nuevo saldo es: $%d%n%n",saldo);
                        }
                        else {
                            System.out.printf("No cuentas con el saldo suficiente. " +
                                    "Saldo actual es: $%d%n%n",saldo);
                        }
                }
                case 3 -> {
                    System.out.println("Ingrese monoto a depositar: ");
                    var deposito = consola.nextInt();
                    saldo += deposito;
                    System.out.printf("Tu nuevo saldo es: $%d%%n%n",saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                }
                default -> System.out.println("Opcion Invalida...");
            }
        }
    }
}
