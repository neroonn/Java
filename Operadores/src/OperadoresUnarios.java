public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 3, b = -2, resultado;
        var c = true;

        resultado = +a;
        System.out.println("resultado = " + resultado);

        resultado = -a;
        System.out.println("resultado = " + resultado);

        a = 3;
        //Pre-incremento
        resultado = ++a;
        System.out.println("Pre-incremento= " + resultado);

        a = 3;
        //Post-Incremento
        resultado = a++;
        System.out.println("Post-Incremento= " + resultado);
        System.out.println("Usando a= " + a);

    }
}
