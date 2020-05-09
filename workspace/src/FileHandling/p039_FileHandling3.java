package FileHandling;

import java.io.File;

public class p039_FileHandling3 {
    public static void main(String[] args) {
        File file = new File("Arrays/demo.txt");
        if (file.exists()) {
            System.out.println("File Exist");
            System.out.println(file.getName());
            System.out.println(file.length());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.canRead());
            System.out.println(file.getTotalSpace());
        } else {
            System.out.println("File does not exist");
        }
    }
}
