package Thread;

class MyThread implements Runnable { // extends Thread
    @Override
    public void run() {
        int i;
        for (i = 1; i < 200; i++) {
            System.out.print(i + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + "start");
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        Thread runnable1 = new Thread(th1);
        Thread runnable2 = new Thread(th2);
        runnable1.start();
        runnable2.start();
        System.out.println(Thread.currentThread() + "end");
    }
}
