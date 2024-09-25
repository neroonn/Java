public class OperadoresAsignacionComparacion {
    public static void main(String[] args) {
        var numero = 10;

        numero += 5;
        System.out.println("numero = " + numero);

        int a = 10, b = 15, c = 20;
        System.out.printf("a = %d, b = %d, c = %d", a,b,c);

        var resultado = a == b;
        System.out.println("\nresultado = " + resultado);
        resultado = a !=b;
        System.out.println("resultado = " + resultado);
        resultado = a <= b;
        System.out.println("resultado = " + resultado);
    }
}
