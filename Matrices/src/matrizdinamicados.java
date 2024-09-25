import java.util.Scanner;

public class matrizdinamicados {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Renglones: ");
        var renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Columnas: ");
        var columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];

        for (var ren = 0;ren < renglones;ren++){
            for (var col = 0;col < columnas;col++){
                System.out.println("Valor ["+ren+"]["+col+"]=");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        for (var ren = 0;ren < renglones;ren++){
            for (var col = 0;col < columnas;col++){
                System.out.println("Matriz ["+ren+"]["+col+"]="+matriz[ren][col]);
            }
        }
    }
}
