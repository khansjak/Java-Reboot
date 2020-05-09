package Lambda;

interface Sayble{
    public String say();
}

public class p017_lambda_no_parameter {
    public static void main(String[] args) {
        Sayble s=()->{
            return "I have nothing to say";
        };
        System.out.println(s.say());
    }
}
