import java.util.Scanner;

public class RevisarNumero {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.println("Numero: ");
        var numero = Integer.parseInt(consola.nextLine());


        if(numero >0){
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        }

    }
}
