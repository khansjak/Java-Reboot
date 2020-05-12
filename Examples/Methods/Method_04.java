package Examples.Methods;

//Write a Java method to count all vowels in a string.
public class Method_04 {

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "Three little ducks went swimming one day over the hills and far aways ";
        System.out.println("Number of vowels in the given string is :" + countVowels(string));

    }
}
