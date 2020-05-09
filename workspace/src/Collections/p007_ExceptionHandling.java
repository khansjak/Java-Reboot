class Arithmatic{
    int array[] = {10,20,30,40};
    int num1= 50;
    int num2 = 10;

    public void division(int num1 , int num2){
        try{
            int result = num1/num2;
            System.out.println("Division"+result);
            System.out.println("4rht element of array :"+array[3]);
            System.out.println("5th element of array "+array[4]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
            System.out.println("getMessage() :"+ ex.getMessage());
            System.out.println("getCause() :"+ex.getCause());
            System.out.println("toString :"+ex.toString());
            System.out.println("print stack trace :" );
            ex.printStackTrace();

        }
        catch (ArithmeticException ex){
            System.out.println(ex);
        }

        catch (Exception ex){
            System.out.println(ex);
        }

        finally {
            //It will always execute
            System.out.println("Finally");
        }
    }
}

class p07_ExceptionHandling {
    public static void main(String[] args) {
        Arithmatic arithmatic = new Arithmatic();
        arithmatic.division(10,2);
    }
}
