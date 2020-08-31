package show.shanhe.interview.time;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTime demo with OpenJDK-14.2
 *
 * @author shanhe
 * @since JDK 8
 */
public class LocalDateTimeDemo {

    /* init formatter for print time string */
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    /**
     * now
     */
    @Test
    public void now() {
        System.out.println(LocalDateTime.now());
    }

    /**
     * format now
     */
    @Test
    public void format() {
        System.out.println(LocalDateTime.now().format(FORMATTER));
    }

    /**
     * the day of week
     */
    @Test
    public void dayOfWeek() {
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);
    }

    /**
     * the week of year
     */
    @Test
    public void weekOfYear() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toLocalDate().format(DateTimeFormatter.ISO_WEEK_DATE));
    }
}
