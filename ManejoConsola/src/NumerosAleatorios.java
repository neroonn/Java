import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        var azar = new Random();

        //numero aleatorio entre 0 y 36
        var numeroAleatorio = azar.nextInt(37);
        System.out.println("Numero aleatorio entre 0 y 36: "+numeroAleatorio);

        //numero aleatorio entre 1 y 36
        numeroAleatorio = azar.nextInt(36)+1;
        System.out.println("Numero aleatorio entre 0 y 36: "+numeroAleatorio);

        //numero flotante entre 0.0 y 1
        var flotanteAleatorio = azar.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        //Simular lanzamiento de un dado (1 a 6)
        var dado = azar.nextInt(6)+1;
        System.out.println("dado = " + dado);
    }
}
