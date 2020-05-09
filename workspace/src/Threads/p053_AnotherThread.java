package Threads;

public class p053_AnotherThread {
    public static void main(String[] args) {
        HelloRunner r = new HelloRunner();
        Thread t = new Thread(r);
        t.start();
    }

}

class HelloRunner implements Runnable {

    @Override
    public void run() {

        int i = 0;
        while (true) {
            System.out.println("Hello" + i++);
            if (i == 50) {
                break;
            }
        }
    }
}
