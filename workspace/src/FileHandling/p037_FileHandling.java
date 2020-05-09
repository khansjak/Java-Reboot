import java.io.FileOutputStream;
import java.io.IOException;

public class p037_FileHandling {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/jak/Simply/workspace/src/fout.txt");
        String message = "Hola World";
        byte data[]=message.getBytes();

        fileOutputStream.write(65);
        fileOutputStream.close();
        System.out.printf("Hello World of Streams!");
    }
}
