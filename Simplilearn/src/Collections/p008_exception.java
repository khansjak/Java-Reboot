package Collections;

class InvalidAgeException extends Exception {

}

class Check{
   public void method1(int num1, int num2) throws ArithmeticException{
       System.out.println(num1/num2);
   }
   public void method2(int num1 , int num2){
       try{
           method1(num1,num2);
       }catch (ArithmeticException ex){
           System.out.println(ex.getMessage());
       }
   }
}
public class p008_exception {
    public static void main(String[] args)  {
        Check obj = new Check();
        obj.method2(20,0);
    }
}
