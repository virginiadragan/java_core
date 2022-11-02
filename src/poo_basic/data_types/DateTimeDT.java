package poo_basic.data_types;

import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class DateTimeDT {
    public void task1 () {
        LocalDate date = LocalDate.now();
        TemporalField week = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
        int weekNumber = date.get(week);

        System.out.println("Task1");
        System.out.println("Current Date and Time: " + date);
        System.out.println("Actual Year: " + date.getYear());
        System.out.println("Actual Month: " + date.getMonthValue());
        System.out.println("Actual Week of Year: " + weekNumber);
        System.out.println("Actual Date: " + date.getDayOfMonth());
    }

    public void task2 () {

    }
}
