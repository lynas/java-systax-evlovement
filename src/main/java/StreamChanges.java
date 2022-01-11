import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChanges {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        List<Student> studentList2 = List.of(
                new Student(1, "Sazzad"),
                new Student(2, "Lopa")
        );

        studentList.add(new Student(1, "Sazzad"));
        studentList.add(new Student(2, "Anaya"));
        studentList.add(new Student(3, "Suraiya"));

        studentList.stream().map(Student::getName).toList();
        studentList.stream().map(Student::getName).collect(Collectors.toUnmodifiableList());
        studentList.stream().filter(student -> student.getId() == 1).findFirst().orElseThrow();

    }
}

class Student {
    private Integer id;
    private String name;

    public Student() {
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
