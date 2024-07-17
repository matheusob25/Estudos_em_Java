package instancia_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_hour {
    public static void main(String[] args) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.parse("25/07/2002", dt);

        LocalDateTime time = LocalDateTime.parse("2023-12-26T18:39:53");
        LocalDateTime tm = LocalDateTime.now();
        LocalDateTime tm2 = LocalDateTime.parse("25/07/2002 12:40", dt2);
        LocalDateTime tm3 = LocalDateTime.of(2002, 07, 25, 12, 45, 35);

        Instant in = Instant.now();
        Instant in2 = Instant.parse("2023-12-27T02:45:58+03:00");



        System.out.println(ld);
        System.out.println(in);
        System.out.println(tm);
        System.out.println(time.getYear());
        System.out.println(in2.toString());
        System.out.println(ld2);
        System.out.println(tm2);
        System.out.println(tm3);
    }
}
