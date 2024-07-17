package instancia_data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculo_Data_hora {
    public static void main(String[] args) {
        LocalDateTime d00 = LocalDateTime.now();
        LocalDateTime d01 = LocalDateTime.parse("2002-07-25t12:45:34");
        LocalDateTime d02 = LocalDateTime.parse("2023-12-26T18:39:53");
        Instant d03 = Instant.now();

        System.out.println("5 dias antes do aniversário: "+ d01.minusDays(5));

        System.out.println("----------------------------------------------------------------------");
        LocalDateTime pastWeekLocalDateTime = d02.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = d02.plusWeeks(1);

        System.out.println("d02  = " + d02);
        System.out.println("d02 - 1 week = " + pastWeekLocalDateTime);
        System.out.println("d02 + 1 week = " + nextWeekLocalDateTime);

        System.out.println("----------------------------------------------------------------------");

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("d03 = "+ d03);
        System.out.println("d03 - 7 days= "+ pastWeekInstant);
        System.out.println("d03 + 7 days= "+ nextWeekInstant);

        System.out.println("----------------------------------------------------------------------");

        Duration t1 = Duration.between(d01, d00);

        System.out.println(t1.toDays());
        System.out.println("----------------------------------------------------------------------");
    }
}
