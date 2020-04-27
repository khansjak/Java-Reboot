public class p021_lambda_thread {
    public static void main(String[] args) {
        Runnable r1=()->{
            System.out.println("Thread 1 is running ...");
        };
        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2=()->{
            System.out.println("Thread 2 is running ...");
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }

}




