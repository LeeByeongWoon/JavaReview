package Thread;

class PriorityThread extends Thread{
    @Override
    public void run() {
        int sum = 0;
        Thread t = currentThread();
        System.out.println(t+" start");
        for(int i =0; i<= 1000000;i++){
            sum +=i;
        }
        System.out.println(t.getPriority()+" end");
    }
}

public class PriorityThreadT{
    public static void main(String[] args) {
        int i;

        PriorityThread th1 = new PriorityThread();
        PriorityThread th2 = new PriorityThread();
        PriorityThread th3 = new PriorityThread();

        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MAX_PRIORITY);

        th1.start();
        th2.start();
        th3.start();

    }
}
