public class BusquedaSubcadena {
    public static void main(String[] args) {
        //Buscar subcadenas
        //indexOf - devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo";

        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        //lastIndexOf - devuelve el indice de la ultima aparicion de la subcadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //indexOf o lastIndexOf subcadena no encontrada devuelve -1
        var cadena3 = cadena1.indexOf("Java");
        System.out.println("cadena3 = " + cadena3);

        var cadena4 = cadena1.indexOf("Mundo");
        System.out.println("cadena4 = " + cadena4);

    }
}
