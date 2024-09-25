public class TiposDatos {
    public static void main(String[] args) {
        //Enteros (Valor default 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32767;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong =  9223372036854775807L; //L o l indicar tipo long
        System.out.println("tipoLong = " + tipoLong);

        //Flotante (Valor default 0.0)
        float tipoFloat = 3.40282347F; //F o f indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 1.79769313486231570D; //D o d tipo double(opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        //Character (Valor default \u0000)
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);

        //Booleano (Valor default false)
        boolean tipoBooolean = true;
        System.out.println("tipoBooolean = " + tipoBooolean);
        tipoBooolean = false;
        System.out.println("tipoBooolean = " + tipoBooolean);

        //String (Valor default null)
        //Tipos Object (referencia)
        String nombre = null; 
        System.out.println("nombre = " + nombre);
        nombre = "Juan";
        System.out.println("nombre = " + nombre);

    }
}
