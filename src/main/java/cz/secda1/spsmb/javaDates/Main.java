package cz.secda1.spsmb.javaDates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    static DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public static void main(String[] args) throws ParseException {
        System.out.println(DateTimeUtils.formattedDate(LocalDateTime.of(2023, 11, 12, 23, 59)));

        String dateString = "13.12.2023";
        System.out.println(dateString);

        LocalDate date = LocalDate.now();
        System.out.println(DateTimeUtils.atMoonTime(date));

        System.out.println(DateTimeUtils.whatsTheDateToday(LocalDate.now()));

        System.out.println(DateTimeUtils.daysToChristmas());

    }
}
