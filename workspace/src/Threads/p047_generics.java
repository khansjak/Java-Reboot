class Test<T,U> {
    T value;
    U value1;

    Test(T val,U val1) {
        this.value = val;
        this.value1 = val1;
    }


    public void getValue() {
        System.out.println(this.value+" "+this.value1);
    }
}

public class p047_generics {
    public static void main(String[] args) {
        System.out.println("Hello Generics");
        //Test test = new Test(10);
        //System.out.println(test.getValue());

        //What if i want to pass a string value and print
        //It wont allow since constructor taking and returning value is int.
        //T Type is solution

        //Test test1 = new Test("Javed");
        //System.out.println(test1.getValue());
        System.out.println();
        Test<Integer,String> test = new Test<>(10,"King");
        test.getValue();
        Test<String,Integer> test1 = new Test<>("Jak",102);
        test1.getValue();


    }
}

//Generics is Java is like templates in C.
// Instead of defining multiple types and methods we can use Generic.


