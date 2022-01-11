import java.util.ArrayList;
import java.util.List;

public class CopyList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("St1");
        stringList.add("St2");

        List<String> stringListCopy = List.copyOf(stringList);
//        stringListCopy.add("st3");
        System.out.println(stringListCopy.size());


    }
}
