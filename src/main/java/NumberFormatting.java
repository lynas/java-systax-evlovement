import java.text.NumberFormat;
import java.util.Locale;
// jdk 12
public class NumberFormatting {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        NumberFormat likesShort = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);
        likesShort.setMaximumFractionDigits(2);
//        assertEquals("2.59K", likesShort.format(2592));
        System.out.println(likesShort.format(2592));

        NumberFormat likesLong = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG);
        likesLong.setMaximumFractionDigits(2);
//        assertEquals("2.59 thousand", likesLong.format(2592));
        System.out.println(likesLong.format(2592));
    }
}
