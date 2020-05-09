package Strings;

public class p027_String1 {
    public static void main(String[] args) {
        String name="Abdul";
        name.concat("Kalam");
        System.out.printf("Name is :"+name);
    }
}


// Name will be printed as Abdul and wont concat Kalam because Strings are immutable and wont change value once initiated.