import java.util.Scanner;

public class promedioCalificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Cuantas calificaciones deseas agregar?");
        int totalCalificaciones = Integer.parseInt(consola.nextLine());

        var arrayCalificaciones = new int[totalCalificaciones];

        for (var i = 0; i < totalCalificaciones; i++){
            System.out.print("Calificacion["+i+"] = ");
            arrayCalificaciones[i] = Integer.parseInt(consola.nextLine());
            //System.out.println("arrayCalificaciones[i] = " + arrayCalificaciones[i]);
        }
        int sumaCalificaciones = 0;
        for (var i = 0; i < totalCalificaciones; i++){
            sumaCalificaciones += arrayCalificaciones[i];
        }
        var promedio = sumaCalificaciones / totalCalificaciones;
        System.out.println("Promedio calificaciones = " + promedio);
    }
}
