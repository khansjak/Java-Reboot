
class SecondThread implements Runnable{
    public void run(){
        System.out.println("Second Thread running ...");
    }
}

public class p043_Multithreading2 {
    public static void main(String[] args) {
        SecondThread obj = new SecondThread();
        Thread thread = new Thread(obj);
        thread.start();
    }
}

/*
Thread vs Runnable
Runnable is better approach then extending the thread class.
Because java does not support multiple inheritance.
Cant extend any other class.
Extending a thread class just to create  thread is not advised.
Runnable is an interface which help us to achieve a task by using a thread class.
 */
