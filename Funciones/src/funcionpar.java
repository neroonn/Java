import java.util.Scanner;

public class funcionpar {

    //Funcion para saber si un numero es par
    //static: para llamarla del metodo principal
    static boolean esPar(int numero){
        /*
        if (numero % 2 == 0){
            return true;
        }else {
            return false;
        }
        */
        return (numero % 2 == 0) ?  true :  false;
    }

    public static void main(String[] args) {

        System.out.println("Proporciona un numero: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Numero par?"+esPar(numero));
    }
}
