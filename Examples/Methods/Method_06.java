package Examples.Methods;

//Write a Java method to compute the sum of the digits in an integer.
public class Method_06 {
    public static int sumOfDigits(int digit) {
        int result = 0;
        while (digit > 0) {
            result += digit % 10;
            digit /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int digit = 57898;
        System.out.println("Sum of all digits is :" + sumOfDigits(digit));

    }
}
