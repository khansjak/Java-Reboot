package Strings;

public class p034_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Welcome ");
        sb.append("Java");
        System.out.println(sb);

        sb.insert(1,"Python");
        System.out.println(sb);
    }
}
