import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Date;
import java.util.TimeZone;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    
    public static void main(String[] args)
    {
        Date fecha2 = new Date();
        Date fechaCaracas = new Date();
        LocalDate  descAmerica = LocalDate.of(1492, 10, 12);
        LocalDate fecha = LocalDate.now(); 
        LocalTime horaActual = LocalTime.now();
        ZoneId zonaCaracas = ZoneId.of("America/Caracas");
        LocalTime horaCaracas = LocalTime.now(zonaCaracas);
        LocalDateTime horaNeil = LocalDateTime.of(1969, 7, 21, 3, 56);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoCaracas = new SimpleDateFormat("dd/MM/yyyy");

        TimeZone zonaHoraria = TimeZone.getTimeZone("America/Caracas");
        formatoCaracas.setTimeZone(zonaHoraria);

        String fechaActual = formato.format(fecha2);
        String fechaActualCaracas = formatoCaracas.format(fechaCaracas); 
        
        Period periodo = Period.between(descAmerica, fecha);

        int añosTranscurridos = periodo.getYears();
        int diferenciaHoraria = horaActual.getHour() - horaCaracas.getHour();
        System.out.println("La fecha de hoy es: " + fechaActual );
        System.out.println("La fecha actual en Caracas es: " + fechaActualCaracas);
        System.out.println("Han pasado " + añosTranscurridos + " años");
        System.out.println("La hora actual en España es: " + horaActual);
        System.out.println("La hora actual en Caracas es: " + horaCaracas);
        System.out.println("La diferencia horaria entre Madrid y Caracas es de "+diferenciaHoraria+" horas");
        System.out.println("Neil Armstrong pisó la luna el: " + horaNeil);
    }
}
