public class sumaResta {
    int operando1;
    int operando2;

    public sumaResta(int op1,int op2){
        operando1 = op1;
        operando2 = op2;
    }

    void sumar(){
        int resultado = operando1 + operando2;
        System.out.println("Resultado suma = " + resultado);
    }

    void restar(){
        int resultado = operando1 - operando2;
        System.out.println("Resultado resta = " + resultado);
    }
    public static void main(String[] args) {
        var calculo1 = new sumaResta(5,10);
        System.out.println("*Calculo 1*");
        calculo1.sumar();
        calculo1.restar();

        System.out.println();

        /*
        System.out.println("*Calculo 2*");
        var calculo2 = new sumaResta();
        calculo2.operando1 = 70;
        calculo2.operando2 = 1;
        calculo2.sumar();
        calculo2.restar();

         */
    }
}
