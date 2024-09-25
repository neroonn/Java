public class ManejoSubcadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //Subcadena
        var subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);

        var cadena2 = cadena1.substring(5);
        System.out.println("cadena2 = " + cadena2);
    }
}