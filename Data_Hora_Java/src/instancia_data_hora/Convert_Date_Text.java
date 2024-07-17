package instancia_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Convert_Date_Text {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2002-07-25");
        LocalDateTime d02 = LocalDateTime.parse("2023-12-26T18:39:53");
        Instant d03 = Instant.now();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatador3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d01 = " + formatador.format(d01));
        System.out.println("d02 = " + d02.format(formatador2));
        System.out.println("d02 = " + d02.format(formatador));
        System.out.println("d03 = " + formatador3.format(d03));

    }
}
