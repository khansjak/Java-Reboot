package Strings;

public class p033_format {
    public static void main(String[] args) {
        String name = "James";

        String sf1 = String.format("Name is %s", name);
        String sf2 = String.format("Value is %f", 32.3323);
        String sf3 = String.format("Value is %32.12f", 32.33434);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);

    }
}
