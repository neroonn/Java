public class recorrerMatriz {
    public static void main(String[] args) {
        //Definir matriz
        final var RENGLONES = 2;
        final var COLUMNAS = 3;
        var matriz = new int[RENGLONES][COLUMNAS];

        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[1][0] = 300;
        matriz[1][1] = 500;

        //Recorrer matriz
        //1.Ciclo externo-Recorrer renglones
        for (var ren = 0; ren < RENGLONES;ren++){
            //2.Ciclo interno-Recorrer columnas
            for (var col = 0;col < COLUMNAS; col++){
                System.out.println("Valor ["+ren+"]["+col+"]"+matriz[ren][col]);
            }
        }
    }
}
