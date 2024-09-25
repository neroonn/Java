import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("***Reserva Hotel***");
        System.out.println("Nombre: ");
        var nombre = consola.nextLine();

        System.out.println("Dias estadia hotel: ");
        var estadia = Integer.parseInt(consola.nextLine());

        System.out.println("Vista al mar (true/false): ");
        var vistaMar = Boolean.parseBoolean(consola.nextLine());

        var cuartoSinVistaMar = 150.5;
        var cuartoVistaMar = 190.5;


        var costoTotal = 0.0;

        if (vistaMar){
            costoTotal = estadia*cuartoVistaMar;
        } else{
            costoTotal = estadia*cuartoSinVistaMar;
        }
        System.out.printf("""
                    Cliente: %s
                    Dias estadia: %d
                    Costo total: $%.2f
                    Habitacion con vista al mar: %s
                    """,nombre,estadia,costoTotal,vistaMar ? "Si :)" : "No :(");


    }
}
