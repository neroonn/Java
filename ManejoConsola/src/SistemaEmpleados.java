import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        //Scanner
        var consola = new Scanner(System.in);

        // Nombre empleado
        System.out.print("Nombre: ");
        var nombreEmpleado = consola.nextLine();

        // Edad empleado
        System.out.print("Edad: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Salario empleado
        System.out.print("Salario: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Es jefe de departamento
        System.out.print("Es jefe de departamento: ");
        var  jefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        System.out.println("\n***DATOS DEL EMPLEADO***");
        System.out.println("\tNombre empleado: "+nombreEmpleado);
        System.out.println("\tEdad empleado: "+edadEmpleado);
        //System.out.println("\tSalario empleado: "+salarioEmpleado);
        //System.out.println("\tSalario: $%.2f".formatted(salarioEmpleado));
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs jefe de departamento?(true/false) "+jefeDepartamento);



    }
}
