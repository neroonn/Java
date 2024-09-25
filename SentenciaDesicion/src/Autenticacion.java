import java.util.Scanner;

public class Autenticacion {
    public static void main(String[] args) {

        final var USUARIO = "pepe";
        final var PASSWORD = "pepe123";

        System.out.println("***Sistema de autenticacion***");
        var consola = new Scanner(System.in);
        System.out.print("Usuario: ");
        var usuario = consola.nextLine();
        System.out.print("Contraseña: ");
        var password = consola.nextLine();

        if (USUARIO.equals(usuario) && PASSWORD.equals(password)){
            System.out.println("Bienvenidos al sistema");
        }
        else if (!USUARIO.equals(usuario)){
            System.out.println("Usuario Invalido");
        }
        else if (!PASSWORD.equals(password)) {
            System.out.println("Contraseña invalida");
        }
        else {
            System.out.println("Usuario y contraseña invalido.");
        }

    }
}
