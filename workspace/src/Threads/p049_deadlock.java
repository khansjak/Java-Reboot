package Threads;

//Resource A
 class ClassA {
    private int num = 10;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
//Resource B
 class ClassB {
    private int num = 20;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class p049_deadlock {
    public static void main(String[] args) {
        p049_deadlock obj = new p049_deadlock();
        final ClassA objA= new ClassA();
        final ClassB objB= new ClassB();

        //Thread 1


        //Thread 2
    }
}
