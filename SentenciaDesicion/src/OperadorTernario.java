public class OperadorTernario {
    public static void main(String[] args) {

        var numero = 5;

        var resutado = (numero %2 == 0) ? "Par" : "impar";

        System.out.println("resutado = " + resutado);

        var edad = -6;
        var resultado2 = (edad >= 18) ? "Sos mayor de edad" : "Sos menor de edad";

        System.out.println("resultado2 = " + resultado2);
    }
}
