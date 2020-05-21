package Examples.Methods;

class sticExample
{
    static
    {
        System.out.println("this is outside of main class");
    }
}
class StaticBlock {
    static
    {
        System.out.println("this is inside of main class");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("hello static concept");
    }

}