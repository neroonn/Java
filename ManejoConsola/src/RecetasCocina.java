import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        //Scanner
        Scanner consola = new Scanner(System.in);

        System.out.println("***Ingresa la receta***");
        System.out.print("Nombre receta: ");
        var nombreReceta = consola.nextLine();

        System.out.print("Ingredientes: ");
        var ingredientes = consola.nextLine();

        System.out.print("Tiempo de preparacion(minutos): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.print("Dificultad (baja/media/alta): ");
        var dificultad = consola.nextLine();

        System.out.println("\n---Receta cocina---");
        System.out.println("Nombre receta: "+nombreReceta);
        System.out.println("Ingredientes: "+ingredientes);
        System.out.println("Tiempo de preparacion(minutos): "+tiempoPreparacion+"m");
        System.out.println("Dificultad: "+dificultad);

    }
}
