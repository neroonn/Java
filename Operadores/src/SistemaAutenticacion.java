import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {

        final var USUARIO_VALIDO = "pepe";
        final var PASSWORD_VALIDO = "pepe123";

        var consola = new Scanner(System.in);

        System.out.print("Usuario: ");
        var usuario = consola.nextLine();

        System.out.print("Contraseña: ");
        var password = consola.nextLine();

        var validadorDatos = USUARIO_VALIDO.equals(usuario) && PASSWORD_VALIDO.equals(password);

        System.out.println("validadorDatos = " + validadorDatos);

    }

}
