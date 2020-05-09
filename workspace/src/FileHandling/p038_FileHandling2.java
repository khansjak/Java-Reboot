import java.io.File;
import java.io.IOException;

public class p038_FileHandling2 {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File has created");
            } else {
                System.out.println("File exist already");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
