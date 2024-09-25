public class EjercicioAcumuladorSuma {
    public static void main(String[] args) {
    /*
        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        var numero = 1;
        while (numero <= MAXIMO){
            System.out.println("acumuladorSuma + numero = " + acumuladorSuma + " + " + numero);

            acumuladorSuma += numero++; // acumuladorSuma + numero

            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");

        }
        System.out.println(acumuladorSuma);

     */








        final var MAXIMO = 5;
        int numero;

        var suma = 0;

        for (numero = 1; numero <= MAXIMO; numero++){
            suma += numero;
        }
        System.out.println(suma);



    }
}
