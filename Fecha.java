import java.time.LocalDate;
public class Fecha {
    LocalDate fechaActual;
    LocalDate fechaEspecifica;
    LocalDate fechaActualModificada;
    LocalDate fechaEspecificaModificada;
    
    public Fecha() {
        fechaActual = LocalDate.now();
        fechaEspecifica = LocalDate.of(2000, 5, 20);
        fechaActualModificada = fechaActual;
        fechaEspecificaModificada = fechaEspecifica;
    }
    
    public void mostrarDiaMesAno() {
        System.out.println("Año de la fecha actual y la fecha específica:");
        System.out.println(fechaActual.getYear());
        System.out.println(fechaEspecifica.getYear());
        System.out.println();
        
        System.out.println("Mes de la fecha actual y la fecha específica:");
        System.out.println(fechaActual.getMonth());
        System.out.println(fechaEspecifica.getMonth());
        System.out.println();
        
        System.out.println("Número del mes de la fecha actual y la fecha específica:");
        System.out.println(fechaActual.getMonthValue());
        System.out.println(fechaEspecifica.getMonthValue());
        System.out.println();
        
        System.out.println("Día en el mes de la fecha actual y la fecha específica:");
        System.out.println(fechaActual.getDayOfMonth());
        System.out.println(fechaEspecifica.getDayOfMonth());
        System.out.println();
        
        System.out.println("Día en el año de la fecha actual y la fecha específica:");
        System.out.println(fechaActual.getDayOfYear());
        System.out.println(fechaEspecifica.getDayOfYear());
        System.out.println();
        
        System.out.println("Año, mes y día de la fecha actual y la fecha específica:");
        System.out.println(fechaActual.toString());
        System.out.println(fechaEspecifica.toString());
        System.out.println();
    }
    
    public void sumaDiaSemanaMesAnoFechaActual(int sumaAno, int sumaMes, int sumaSemana, int sumaDia) {
        fechaActualModificada = fechaActualModificada.plusYears(sumaAno);
        fechaActualModificada = fechaActualModificada.plusMonths(sumaMes);
        fechaActualModificada = fechaActualModificada.plusWeeks(sumaSemana);
        fechaActualModificada = fechaActualModificada.plusDays(sumaDia);
    }
    
    public void restaDiaSemanaMesAnoFechaEspecifica(int restaAno, int restaMes, int restaSemana, int restaDia) {
        fechaEspecificaModificada = fechaEspecificaModificada.minusYears(restaAno);
        fechaEspecificaModificada = fechaEspecificaModificada.minusMonths(restaMes);
        fechaEspecificaModificada = fechaEspecificaModificada.minusWeeks(restaSemana);
        fechaEspecificaModificada = fechaEspecificaModificada.minusDays(restaDia);
    }
    
    public void mostrarDiaMesAnoDeLasNuevasFechas() {
        System.out.println("Año de la fecha actual modificada y la fecha específica modificada:");
        System.out.println(fechaActualModificada.getYear());
        System.out.println(fechaEspecificaModificada.getYear());
        System.out.println();
        
        System.out.println("Mes de la fecha actual modificada y la fecha específica modificada:");
        System.out.println(fechaActualModificada.getMonth());
        System.out.println(fechaEspecificaModificada.getMonth());
        System.out.println();
        
        System.out.println("Número del mes de la fecha actual modificada y la fecha específica modificada:");
        System.out.println(fechaActualModificada.getMonthValue());
        System.out.println(fechaEspecificaModificada.getMonthValue());
        System.out.println();
        
        System.out.println("Día en el mes de la fecha actual modificada y la fecha específica modificada:");
        System.out.println(fechaActualModificada.getDayOfMonth());
        System.out.println(fechaEspecificaModificada.getDayOfMonth());
        System.out.println();
        
        System.out.println("Día en el año de la fecha actual modificada y la fecha específica modificada:");
        System.out.println(fechaActualModificada.getDayOfYear());
        System.out.println(fechaEspecificaModificada.getDayOfYear());
        System.out.println();
        
        System.out.println("Año, mes y día de la fecha actual modificada y la fecha específica modificada:");
        System.out.println(fechaActualModificada.toString());
        System.out.println(fechaEspecificaModificada.toString());
        System.out.println();
    }
    
    public void mostrarDiaDeLaSemana() {
        System.out.println("El número del día de la semana de la fecha actual es: " + fechaActual.getDayOfWeek().getValue());
        System.out.println("El número del día de la semana de la fecha especifíca es: " + fechaEspecifica.getDayOfWeek().getValue());
    }
    
    public void mostrarEra() {
        System.out.println("El número del día de la semana de la fecha actual es: " + fechaActual.getEra());
        System.out.println("El número del día de la semana de la fecha especifíca es: " + fechaEspecifica.getEra());
    }
}