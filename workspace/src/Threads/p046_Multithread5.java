class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread is running :"+i);
        }
    }
}

class p046_Multithreading5 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread2 = new MyThread1();

        myThread1.start();
        myThread2.start();

        //Start starts new thread


    }
}
