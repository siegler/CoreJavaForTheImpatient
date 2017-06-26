package Ch2;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
Change the calendar printing program so it starts the week on a Sunday. Also make it print a newline at the end (but only one).
 */

public class Ex1 {
    private static int adjustedDayOfWeekValue(DayOfWeek day) {
        int value = day.getValue();
        // 1 = Sunday, ... 7 = Saturday
        return (value % 7) + 1;
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now().withDayOfMonth(1);
        int month;
        if (args.length >= 2) {
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year, month, 1);
        } else {
            month = date.getMonthValue();
        }

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = adjustedDayOfWeekValue(weekday);
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (adjustedDayOfWeekValue(date.getDayOfWeek()) == 1)
                System.out.println();
        }
        if (adjustedDayOfWeekValue(date.getDayOfWeek()) != 1)
            System.out.println();
    }
}
