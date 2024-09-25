import java.util.Scanner;

public class casaEspejos {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("introduce edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.println("Miedo: ");
        var miedo = Boolean.parseBoolean(consola.nextLine());


        if (!miedo && edad >= 10){
            System.out.println("puedes entrar");
        }else {
            System.out.println("no puedes entrar");
        }
    }
}
