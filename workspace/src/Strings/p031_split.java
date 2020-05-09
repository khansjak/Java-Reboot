public class p031_split {
    public static void main(String[] args) {
        String s1 = "Java Split message example";
        String[] words = s1.split("\\s");

        for (String w : words) {
            System.out.println(w);
        }
    }
}
