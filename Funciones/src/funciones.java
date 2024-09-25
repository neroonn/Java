public class funciones {

    static void saludar(String mensaje){
        System.out.println("Mensaje: "+ mensaje);
    }

    public static void main(String[] args) {
        //public : se puede acceder de cualquier archivo
        //static : se asocia a clase funciones. si se crea otra clase con static se asocia al main
        //void : no regresa ningun tipo de informacion

        saludar("Hola desde java");
        saludar("Adios");

    }
}
