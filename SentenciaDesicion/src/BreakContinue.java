public class BreakContinue {
    public static void main(String[] args) {

        System.out.println("Break:");
        for (int numero = 1;numero < 10; numero++){
            //System.out.println("numero = " + numero);
            if (numero % 2 == 0){
                System.out.print(numero+"\n");
                break;

            }
        }
        System.out.println("\nContinue:");
        for (var impar = 1;impar <10;impar++){
            if (impar % 2 == 1){
                continue;
            }
            System.out.print(impar);
        }
    }
}
