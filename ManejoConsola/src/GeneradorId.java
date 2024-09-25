import java.util.Random;
import java.util.Scanner;

public class GeneradorId {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        Random azar = new Random();

        System.out.println("***Sistema Generador ID Único***");
        System.out.print("Cual es tu nombre? ");
        var nombre = consola.nextLine();

        System.out.print("Cual es tu apellido? ");
        var apellido = consola.nextLine();

        System.out.print("Cual es tu año de nacimiento? ");
        var nacimiento = consola.nextLine();

        var numeroAleatorio = azar.nextInt(10000);
        var charNombre = nombre.trim().toUpperCase().substring(0,2);
        var charApellido = apellido.trim().toUpperCase().substring(0,2);
        var charNacimiento = nacimiento.trim().substring(2);


        var mensaje = """
                \tHola %s
                \tTu nuevo número de identificacion (ID) generado por el sistema es: %s%s%s%04d 
                """.formatted(nombre,charNombre,charApellido,charNacimiento,numeroAleatorio);

        System.out.println(mensaje);
    }
}
