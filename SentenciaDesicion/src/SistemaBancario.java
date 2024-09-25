import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("Deseas salir del sistema (t/f)?");
        var respuestaSistema = Boolean.parseBoolean(consola.nextLine());

        if (!respuestaSistema){
            System.out.println("Continuamos dentro del sistema");
        }
        else {
            System.out.println("Saliendo del sistema");
        }
    }
}
