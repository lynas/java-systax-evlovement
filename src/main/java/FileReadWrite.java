import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath = Files.writeString(Files.createTempFile(filePath1, "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
//        assertThat(fileContent).isEqualTo("Sample text");

        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "Java 12 Article");
        Files.writeString(filePath2, "Java 12 Article");

        long mismatch = Files.mismatch(filePath1, filePath2);
    }
}
