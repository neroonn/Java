public class CaracteresEspeciales {
    public static void main(String[] args) {

        // \n -salto de linea
        var cadena1 = "Hola Mun\ndo";
        System.out.println("cadena1 = " + cadena1);

        // \t -tabulador
        System.out.println("\tHola\t Mundo");

        // \' -agregar comilla simple o doble
        System.out.println("Hola 'Mu'nd\"o");

        // \\ -una  diagonal invertida
        System.out.println("Hola \\ mundo");
    }
}
