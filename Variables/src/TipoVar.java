public class TipoVar {
    public static void main(String[] args) {
        System.out.println("Uso de var");
        var nombre = "carlos";
        System.out.println("nombre = " + nombre);

        var edad = 30; //se infiere tipo int
        var edad2 = 30L; //se infiere tipo long
        var distancia = 300.5F; //se infiere tipo float
        var disponible = true; //se infiere tipo boolean
    }
}

