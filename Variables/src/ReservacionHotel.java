public class ReservacionHotel {
    public  static void main(String[] args){
        final String NOMBRE_CLIENTE = "Juan pepe";
        System.out.println("NOMBRE_CLIENTE = " + NOMBRE_CLIENTE);
        var diasEstancia = 7;
        System.out.println("diasEstancia = " + diasEstancia);
        var tarifaDiaria = 315.5F;
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        var tieneVistaAlMar = true;
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
        System.out.println("***Valores modificados***");
        diasEstancia = 8;
        System.out.println("diasEstancia = " + diasEstancia);
        tarifaDiaria = 330.8F;
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        tieneVistaAlMar = false;
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
        

    }
}
