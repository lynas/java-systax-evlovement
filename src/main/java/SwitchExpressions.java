import java.time.DayOfWeek;
import java.time.LocalDate;
//12
public class SwitchExpressions {
    public static void main(String[] args) {
        Object obj = "Hello World!";
        if (obj instanceof String) {
            String s = (String) obj;
            int length = s.length();
            System.out.println(length);
        }

        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                // more logic
                System.out.println("Working Day");
            }
        }
    }
}
