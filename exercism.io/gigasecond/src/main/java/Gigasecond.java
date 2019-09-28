import java.time.*;

/**
 * Created by Artem Izikaev on 10.12.2016.
 */
public class Gigasecond {
    private final LocalDateTime startDateTime;
    private final static long GIGASECOND = 1_000_000_000L;

    public Gigasecond(LocalDateTime startDate) {
        this.startDateTime = startDate;
    }

    public Gigasecond(LocalDate startDate) {
        this.startDateTime = LocalDateTime.of(startDate, LocalTime.of(0,0,0));
    }

    public LocalDateTime getDate () {
        return startDateTime.plusSeconds(GIGASECOND);
    }

}
