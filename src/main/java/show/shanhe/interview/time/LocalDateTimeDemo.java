package show.shanhe.interview.time;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    /**
     * 当前时间
     */
    @Test
    public void now() {
        System.out.println(LocalDateTime.now());
    }

    /**
     * 格式化当前时间
     */
    @Test
    public void formatNow(){
        System.out.println(LocalDateTime.now().format(formatter));
    }

    /**
     * 星期几（返回的是时间的枚举）
     */
    @Test
    public void dayOfWeek(){
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);
    }

    /**
     * 本年的第几周
     */
    @Test
    public void weekOfYear() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toLocalDate().format(DateTimeFormatter.ISO_WEEK_DATE));
    }
}
