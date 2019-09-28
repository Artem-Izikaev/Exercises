import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by Artem Izikaev on 05.11.2016.
 */
public class Meetup {
    private final LocalDate firstDayOfMonth;
    private final LocalDate lastDayOfMonth;

    public Meetup(int month, int year) {
        firstDayOfMonth = LocalDate.of(year, month, 1);
        lastDayOfMonth = firstDayOfMonth.plusMonths(1).minusDays(1);
    }

    public LocalDate day (DayOfWeek day, MeetupSchedule meet) {
        LocalDate resultDate;
        if (meet == MeetupSchedule.LAST)
            resultDate = prevDateForWeekDay (day, lastDayOfMonth);
        else
            resultDate = nextDateForWeekDay (day, firstDayOfMonth);

        switch (meet) {
            case SECOND:
                resultDate = resultDate.plusWeeks(1);
                break;
            case THIRD:
                resultDate = resultDate.plusWeeks(2);
                break;
            case FOURTH:
                resultDate = resultDate.plusWeeks(3);
                break;
            case TEENTH:
                while (resultDate.getDayOfMonth() < 13)
                    resultDate = resultDate.plusWeeks(1);
                break;
        }
        return resultDate;
    }

    // Следующая дата переданного дня недели начиная с переданной даты
    private LocalDate nextDateForWeekDay (DayOfWeek weekDay, LocalDate startDate) {
        LocalDate resultDate = startDate;
        while (resultDate.getDayOfWeek() != weekDay) {
            resultDate = resultDate.plusDays(1);
        }
        return resultDate;
    }
    // Предыдущая дата переданного дня недели начиная с переданной даты
    private LocalDate prevDateForWeekDay (DayOfWeek weekDay, LocalDate startDate) {
        LocalDate resultDate = startDate;
        while (resultDate.getDayOfWeek() != weekDay) {
            resultDate = resultDate.minusDays(1);
        }
        return resultDate;
    }
}
