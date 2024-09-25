import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.print("Numero 1:");
        var numero1 = Integer.parseInt(consola.nextLine());

        System.out.print("Numero 2:");
        var numero2 = Integer.parseInt(consola.nextLine());

        var numeroMayor = (numero1 > numero2) ? "Numero 1 es mayor: "+ numero1 : (numero2 > numero1) ? "Numero 2 es mayor: "+numero2 : "Los numeros son iguales: "+numero1+ "=" +numero2;

        System.out.println(numeroMayor);
    }
}
