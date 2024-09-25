import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //1.Declaramos array.
        int[] enteros;

        //2.Inicializar array. reservar espacio memoria.
        enteros = new int[3];

        //3.Declarar e inicializar un array.
        int[] numeros = new int[5];
        var numerosdos = new int[3];

        //Modificacion
        numeros[0] = 20;

        //Declarar
        System.out.println("Numeros [0] = "+numeros[0]);

        //Sintaxis simplificada.
        int[] enterosTres = {100,200,300,400,500};
        System.out.println("enteros [4] = " + enterosTres[4]);

        for (var i = 0;i < enterosTres.length;i++){
            System.out.println("Valor indice = " + enterosTres[i]);
        }

        //Introducir valores array
        var consola = new Scanner(System.in);

        //Declarar array
        System.out.println("Proporciona el largo array");
        var largoArray = Integer.parseInt(consola.nextLine());

        //Creamos array
        var enterosCuatro = new int[largoArray];

        //Solicitar valores
        for (var i = 0; i < largoArray;i++ ){
            System.out.println("Proporciona enteros["+i+"]= ");
            enterosCuatro[i] = Integer.parseInt(consola.nextLine());
        }
        //Imprimir
        for (var i = 0; i < largoArray;i++){
            System.out.println("enteros["+i+"] = " + enterosCuatro[i]);
        }
    }
}
