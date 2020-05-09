package Lambda;

interface Sayable1{
    public String say(String name);
}
public class p018_lambda_single_parameter {
    public static void main(String[] args) {
        Sayable1 s1 = (name)->{
            return "Hello "+name;
        };
        System.out.println(s1.say(" Sonu"));

    }
}
