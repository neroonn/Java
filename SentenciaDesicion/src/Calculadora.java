import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;
        while (!salir){
            System.out.printf("""
                    Calculadora:
                    1.Suma
                    2.Resta
                    3.Multiplicacion
                    4.Division
                    5.Salir
                    Escoge una opcion:\s""");
            var opciones = consola.nextInt();

            switch (opciones){
                case 1 ->{
                    System.out.print("Primer valor: ");
                    var primerValorSuma = consola.nextInt();
                    System.out.print("Segundo valor: ");
                    var segundoValorSuma = consola.nextInt();
                    var resultadoSuma = primerValorSuma + segundoValorSuma;
                    System.out.printf("El resultado de la suma es: %d%n%n",resultadoSuma );
                }
                case 2 ->{
                    System.out.print("Primer valor: ");
                    var primerValorResta = consola.nextInt();
                    System.out.print("Segundo valor: ");
                    var segundoValorResta = consola.nextInt();
                    var resultadoResta = primerValorResta - segundoValorResta;
                    System.out.printf("El resultado de la resta es: %d%n%n", resultadoResta);
                }
                case 3 ->{
                    System.out.print("Primer valor: ");
                    var primerValorMultiplicacion = consola.nextInt();
                    System.out.print("Segundo valor: ");
                    var segundoValorMultiplicacion = consola.nextInt();
                    var resultadoMultiplicacion = primerValorMultiplicacion * segundoValorMultiplicacion;
                    System.out.printf("El resultado de la multiplicacion es: %d%n%n",resultadoMultiplicacion);
                }
                case 4 ->{
                    System.out.print("Primer valor: ");
                    var primerValorDivision = consola.nextInt();
                    System.out.print("Segundo valor: ");
                    var segundoValorDivision = consola.nextInt();
                    if (!(segundoValorDivision == 0)) {
                        var resultadoDivision = primerValorDivision / segundoValorDivision;
                        System.out.printf("El resultado de la multiplicacion es: %d%n%n", resultadoDivision);
                    }
                    else {
                        System.out.println("\nError division entre 0\n");
                    }
                }
                case 5 ->{
                    System.out.println("Saliendo de la calculadora...");
                    salir = true;
                }
                default -> System.out.println("\n\n*** Error *** \n\n");
            }
        }

    }
}
