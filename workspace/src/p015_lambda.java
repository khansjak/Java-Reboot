import org.w3c.dom.ls.LSOutput;

/*
1. Functional Interface can have only one abstract method in it.
2. And that abstract method will be accessible using lambda expression.
3. Can have more than one default static or overridden methods also.
4.
 */
interface Executable{
    int execute();
}

class Runner{
    public void run(Executable ex){
        System.out.println("Executable Block");
        int value = ex.execute();
    }
}
public class p015_lambda {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute() {
                //return 0;
                System.out.println("Hello from executable method");
                return 0;
            }
        });

        //We can use lambda when we have just one abstract method in interface
        //Only works with Interfaces

        runner.run(()->{
            System.out.println("Hello from lambda");
            return 0;
        });
    }
}
