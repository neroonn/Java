import java.util.Scanner;

public class promedioCalificacionesDos {
    public static void main(String[] args) {


        System.out.println("*** Promedio de calificaciones ***");
        var consola = new Scanner(System.in);
        System.out.print("Total de calificaciones: ");
        var totalCalificaiones = Integer.parseInt(consola.nextLine());

        var calificaciones = new int [totalCalificaiones];

        for (var i = 0;i < totalCalificaiones;i++){
            System.out.print("Calificacion["+i+"] =");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }
        var sumaPromedio = 0;
        for (var i = 0;i < totalCalificaiones;i++){
            sumaPromedio += calificaciones[i];
        }
        var promedio = sumaPromedio / totalCalificaiones;
        System.out.println("Promedio: "+promedio);

    }
}
