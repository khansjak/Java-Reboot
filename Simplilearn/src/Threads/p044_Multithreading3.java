package Threads;

class MyRunnable implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Start.");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " End.");
        } catch (Exception ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
}

public class p044_Multithreading3 {
    public static void main(String[] args) {
        System.out.println("Main Thread execuation starts ...");
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable, "Thread One");
        Thread thread2 = new Thread(runnable, "Thread Two");
        Thread thread3 = new Thread(runnable, "Thread Three");

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        thread2.start();
        try {
            thread2.join(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        thread3.start();
        try {
            thread2.join();
            thread3.join();

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("Main Thread ends here ...");


    }
}
