package Threads;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread is running :" + i);
        }
    }
}

public class p045_Multithreading4 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.run();
        myThread2.run();

        //Run never starts new thread and joins.
        //never use run() to invoke the thread.

    }
}
