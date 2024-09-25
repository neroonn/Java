public class ComparacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //Comparacion de cadenas en referencia (==)
        System.out.print("cadena1 = cadena2: ");
        System.out.println(cadena1 == cadena2);
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        //Comparacion de cadenas en contenido metodo equals
        System.out.print("cadena1 es igual eb contenido que cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
