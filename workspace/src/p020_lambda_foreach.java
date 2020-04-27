import java.util.ArrayList;
import java.util.List;

public class p020_lambda_foreach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ankit");
        list.add("Mayank");
        list.add("Irfan");
        list.add("Jai");

        list.forEach(
                (n)-> System.out.println(n)
        );
    }
}
