import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class admCuentas {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;

        System.out.println("*** Administrador de cuentas ***");
        while(!salir){
            System.out.print("""
                    Menu:
                    1.Crear cuenta
                    2.Eliminar cuenta
                    3.Salir
                    Escoge opcion:\s""");
            var opcion = consola.nextInt();
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema...\n");
                    salir = true;
                    System.out.println("Fin del sistema de administracion cuentas.");
                }
                default -> System.out.println("Opcion Invalida...\n");
            }

        }

    }
}
