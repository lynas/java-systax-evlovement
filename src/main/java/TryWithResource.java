import java.io.Closeable;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {

        MyAutoCloseable mac = new MyAutoCloseable();
        try(mac) {
            mac.getStatus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MyAutoCloseable implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Closing automatically");
    }

    public String getStatus() {
        System.out.println(this.getClass().getName());
        return "Status";
    }
}
