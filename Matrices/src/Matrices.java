public class Matrices {
    public static void main(String[] args) {



        //Definimos matriz - reservamos espacio de memoria
        int[][] matriz = new int[2][3];//renglones*columna
        // var matrizz = new int[2][3];

        //Modificar valores
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[1][0] = 300;
        matriz[1][1] = 500;

        //Acceder valores
        System.out.println("Matriz[0][0]= "+matriz[0][0]);
        System.out.println("Matriz[1][1]= "+matriz[1][1]);
    }
}
