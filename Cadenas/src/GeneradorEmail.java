public class GeneradorEmail {
    public static void main(String[] args) {
        //Datos
        var nombre = " Ubaldo Acosta Soto ";
        var empresa = "Global Mentory";
        var dominio = ".com.mx";

        var nombreNormalizado = nombre.trim().replace(" ",".").toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        var nombreEmpresa = empresa+dominio;
        nombreEmpresa = nombreEmpresa.replace(" ","").toLowerCase();
        System.out.println("nombreEmpresa = " + nombreEmpresa);

        var email = nombreNormalizado+"@"+nombreEmpresa;
        System.out.println("email = " + email);
    }
}
