public class vehiculo {
    String modelo;
    String color;
    float km;

    void mostrarVehiculo(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Color: "+color);
        System.out.printf("Km: %.2f",km);
    }

    public static void main(String[] args) {

        var vehiculo1 = new vehiculo();
        vehiculo1.modelo = "Toyota";
        vehiculo1.color = "Rojo";
        vehiculo1.km = 6900;
        vehiculo1.mostrarVehiculo();

        System.out.println();

        var vehiculo2 = new vehiculo();
        vehiculo2.modelo = "Ford";
        vehiculo2.color = "Azul";
        vehiculo2.km = 60000;
        vehiculo2.mostrarVehiculo();

    }
}
