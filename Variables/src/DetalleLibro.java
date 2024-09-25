public class DetalleLibro {
    public static void main(String[] args) {
        //Detalle de un libro
        String tituloLibro = "El señor de los anillos";
        int fecha = 1954;
        boolean disponible = true;
        double precio = 50.10;
        //Imprimir variables
        System.out.println(tituloLibro);
        System.out.println(fecha);
        System.out.println(disponible);
        System.out.println(precio);
        //Modificar
        tituloLibro = "El señor pepe";
        System.out.println(tituloLibro);
    }
}
