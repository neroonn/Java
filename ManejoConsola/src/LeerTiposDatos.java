import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        //Int
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        //Double
        System.out.print("Ingresa altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        //Consumir caracter salto de linea
        consola.nextLine();
        //String
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        //Conversion de datos
        //Int
        System.out.print("Valor entero: ");
        //var enteroString = consola.nextLine();
        //var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);
        
        //Float
        System.out.print("Valor flotante: ");
        //var flotanteString = consola.nextLine();
        //var flotante = Float.parseFloat(flotanteString);
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);



    }
}
