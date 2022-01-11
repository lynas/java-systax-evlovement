import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayPeriodSupport {
    public static void main(String[] args) {
        LocalTime date = LocalTime.parse("15:25:08.690791");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
//        assertThat(date.format(formatter)).isEqualTo("3 in the afternoon");
        System.out.println(date.format(formatter));
    }
}
