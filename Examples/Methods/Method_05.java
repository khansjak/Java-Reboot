package Examples.Methods;

//Write a Java method to count all words in a string.
public class Method_05 {

    public static int countCharacters(String str) {
        int count = 0;
        String str1[] = str.split(" +");
        count = str1.length;
        return count;
    }

    public static void main(String[] args) {
        String str = "Three little ducks went swimming one day , over the hills and far away .";
        System.out.println("Number of characters in the string is :" + countCharacters(str));
    }

}
