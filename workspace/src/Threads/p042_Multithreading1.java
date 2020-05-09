package Threads;

class firstThread extends Thread{
    public void run(){
        System.out.println("First Thread running ...");
    }
}

public class p042_Multithreading1 {
    public static void main(String[] args) {
        firstThread obj = new firstThread();
        obj.start();
        //obj.start();
    }
}


