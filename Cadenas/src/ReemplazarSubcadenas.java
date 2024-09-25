public class ReemplazarSubcadenas {
    public static void main(String[] args) {

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        var cadena2 = cadena1.replace("Mundo","a todos");
        System.out.println("cadena2 = " + cadena2);

        var cadena3 = cadena1.replace("Hola", "Saludos");
        System.out.println("cadena3 = " + cadena3);

        var cadena4 = cadena2.replace("Hola","Saludos");
        System.out.println("cadena4 = " + cadena4);

        String cadena5 = "Buenas";
        String cadena6 = "Noches";
        String cadena77 = cadena5 + " " + cadena6;
        System.out.println("cadena77 = " + cadena77);

        //Metodo concat
        String cadena7 = cadena5.concat(" ").concat(cadena6);
        System.out.println("cadena7 = " + cadena7);

        //StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena5);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena6);
        String resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena5).append(" ").append(cadena6);
        String resultado2 = stringBuffer.toString();
        System.out.println("resultado2 = stringbuffer " + resultado2);

        //Join
        resultado2 = String.join(" -- ",cadena5,cadena6, " adios");
        System.out.println("resultado2 join = " + resultado2);

    }
}
