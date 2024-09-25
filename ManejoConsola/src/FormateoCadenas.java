public class FormateoCadenas {
    public static void main(String[] args) {

        var nombre = "Matias";
        var edad = 35;
        var salario = 16000.50;

        var mensaje = String.format("Nombre: %s, Edad: %d, Salario %.2f", nombre,edad,salario);
        System.out.println(mensaje);

        //metodo printf
        System.out.printf("Nombre: %s edad: %d salario: $%.2f",nombre,edad,salario);


        var numeroEmpleados = 12;
        //Formateo con text block
        mensaje = """
                %nDetalle persona:\s
                ------------------
                \tNombre: %s
                \tNumero empleados: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre,numeroEmpleados,edad,salario);
        System.out.println(mensaje);

        //Formateo tex block printf directamente
        System.out.printf("""
                %nDetalle persona:\s
                ------------------
                \tNombre: %s
                \tNumero empleados: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """,nombre,numeroEmpleados,edad,salario);

    }
}
