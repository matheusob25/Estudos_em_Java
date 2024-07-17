package instancia_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Convert_Global_For_Local {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2002-07-25");
        LocalDateTime d02 = LocalDateTime.parse("2023-12-26T18:39:53");
        Instant d03 = Instant.now();

        // Convertendo Global para local
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}
