import java.util.Scanner;

public class SistemaEnvio {
    public static void main(String[] args) {

        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;

        var consola = new Scanner(System.in);
        System.out.println("Ingresa destino paquete(nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();

        System.out.println("Ingresa peso del paquete en kg: ");
        double pesoPaquete = Double.parseDouble(consola.nextLine());


        Double costoEnvio = switch (destino){
            case "nacional" -> TARIFA_NACIONAL * pesoPaquete;
            case "internacional" -> TARIFA_INTERNACIONAL * pesoPaquete;
            default -> {
                System.out.println("Destino invalido");
                yield null;
            }
        };

        if(costoEnvio != null){
            System.out.printf("El costo del envio del paquete es: $.2f",costoEnvio);
        }


    }
}
