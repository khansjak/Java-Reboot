package Threads;

class MyOuterClass {
    void MyOuterMethod() {
        System.out.println("In Outer");
        class MyInnerClass {
            void MyInnerMethod() {
                System.out.println("In Inner");
            }
        }
        MyInnerClass innerObj = new MyInnerClass();
        innerObj.MyInnerMethod();
    }

    private int value = 100;

    class MyInnerClass {
        public int getValue() {
            return value;
        }
    }
}


public class p048_InnerClasses {
    public static void main(String[] args) {
        MyOuterClass outer = new MyOuterClass();
        MyOuterClass.MyInnerClass inner = outer.new MyInnerClass();
        System.out.println(inner.getValue());
        outer.MyOuterMethod();
    }
}





/*
Parent Class
    |_Child Class <- This is inner class

Types *

|_Nested Inner Class
|_Method Local Inner Class
|_Static Inner Class
|_Annonymous



 */