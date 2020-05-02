import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p040_FileHandling4 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter("demo2.txt");
            writer.write("This is demo 2 file.");

            writer.close();

            File file = new File("demo2.txt");
            if (file.exists()) {
                System.out.println("File is already exist");
                System.out.println(file.getPath());
                System.out.println(file.lastModified());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fileReader = new FileReader("demo.txt");
        Scanner data = new Scanner(fileReader);

        while (data.hasNextLine()) {
            System.out.println(data.nextLine());
        }

    }
}
