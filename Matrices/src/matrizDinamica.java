import java.util.Scanner;

public class matrizDinamica {
    public static void main(String[] args) {
        //Introducir valores
        int renglones, columnas;
        var consola = new Scanner(System.in);

        //Definir matriz
        System.out.println("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];

        for (var ren = 0; ren < renglones;ren++){
           for (var col = 0; col < columnas; col++){
               System.out.println("Valor ["+ren+"]["+col+"]=");
               matriz[ren][col] = Integer.parseInt(consola.nextLine());
           }
        }
        //Iterar valores matriz
        for(var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.println("Matriz ["+ren+"]["+col+"]="+matriz[ren][col]);
            }
        }
    }
}
