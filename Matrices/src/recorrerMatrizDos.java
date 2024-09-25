public class recorrerMatrizDos {
    public static void main(String[] args) {
        //Definir matriz

        var matriz = new int[][]{{100,200,300},{500,600,700}};

        //Recorrer matriz
        //1.Ciclo externo-Recorrer renglones
        for (var ren = 0; ren < matriz.length;ren++) {
            //2.Ciclo interno-Recorrer columnas
            for (var col = 0; col < matriz[ren].length; col++) {
                System.out.println("Valor [" + ren + "][" + col + "]" + matriz[ren][col]);
            }
            //System.out.println("Matriz.length= "+matriz.length);
            //System.out.println("Matriz[ren].length= "+matriz[ren].length);
        }
    }
}
