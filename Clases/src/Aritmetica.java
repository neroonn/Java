public class Aritmetica {
    int operando1;
    int operando2;

    public Aritmetica(){

    }

    public Aritmetica(int operando1,int operando2){
        System.out.println("Ejecutando constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Operador this : "+this);
    }

    /*
    public Aritmetica(int op1, int op2){
        System.out.println("Constructor");
        operando1 = op1;
        operando2 = op2;
    }
    */


    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("resultado suma = " + resultado);
    }

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("resultado resta = " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo aritmetica");
        var aritmetica1 = new Aritmetica(25,5);
        aritmetica1.sumar();
        aritmetica1.restar();
        System.out.println("aritmetica1 Memoria = " + aritmetica1);

        System.out.println();

        var aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 9;
        aritmetica2.operando2 = 3;
        aritmetica2.sumar();

        /*
        var aritmetica2 = new Aritmetica();
        //aritmetica2.operando1 = 12;
        //aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();
        */

        System.out.println();
        var aritmetica3 = new Aritmetica(12,6);
        aritmetica3.sumar();
        System.out.println("Memoria aritmetica3: "+aritmetica3);
    }
}
