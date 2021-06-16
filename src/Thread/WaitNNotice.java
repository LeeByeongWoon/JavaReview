package Thread;

import ConsPrec.Student;

import java.util.ArrayList;

class Library{
    public ArrayList<String> shelf = new ArrayList<>();
    public Library(){
        shelf.add("책1");
        shelf.add("책2");
        shelf.add("책3");

    }
    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();
        while(shelf.size() == 0){
            System.out.println(t.getName() +" : wait");
            wait();
            System.out.println(t.getName() +" : end");
        }
        String book = shelf.remove(0);
        System.out.println(t.getName()+":"+book+" lend");
        return book;

    }
    public synchronized void returnBook(String book){
        Thread t= Thread.currentThread();
        shelf.add(book);
        notifyAll();
        System.out.println(t.getName()+":"+book+" return");
    }
}
class Students extends Thread{
    public Students(String name){
        super(name);
    }
    @Override
    public void run() {
        try {
        String title = WaitNNotice.library.lendBook();
        if(title == null) {
            System.err.println("null");
            return;
        }
            sleep(5000);
            WaitNNotice.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class WaitNNotice {
    public static Library library =new Library();
    public static void main(String[] args) {
        Students std = new Students("no1");
        Students std2 = new Students("no2");
        Students std3 = new Students("no3");
        Students std4 = new Students("no4");
        Students std5 = new Students("no5");
        Students std6 = new Students("no6");

        std.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
    }
}
