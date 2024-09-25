import java.util.Scanner;

public class sumaDiagonal {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Renglones: ");
        var renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Columnas: ");
        var columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];

        for (var ren = 0; ren < renglones;ren++){
            for (var col = 0;col < columnas;col++){
                System.out.print("Valor ["+ren+"]["+col+"]=");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        var sumaDiagonal = 0;
        for (var ren = 0; ren < renglones;ren++){
            for (var col = 0;col < columnas;col++){
                if (ren == col){
                    sumaDiagonal += matriz[ren][col];
                }
            }
        }
        System.out.println("Suma diagonal= "+sumaDiagonal);
    }
}
