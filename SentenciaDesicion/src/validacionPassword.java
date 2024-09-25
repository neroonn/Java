import java.util.Scanner;

public class validacionPassword {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        final var password = "pepito123";
        var salir = false;

        while (!salir){
            System.out.println("Introduce la contraseña: ");
            var passwordUsuario = consola.nextLine();

            if (passwordUsuario.length() >= 6){
                System.out.println("Confirmar contraseña: ");
                var passwordConfirmar = consola.nextLine();
                if (passwordUsuario.equals(passwordConfirmar)){
                    System.out.println("Contraseña correcta");
                    salir = true;
                }
                else {
                    System.out.println("Validacion incorrecta");
                }
            }
            else {
                System.out.println("Contraseña incorrecta");
            }

        }
    }
}
