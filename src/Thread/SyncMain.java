package Thread;


class Bank {
    private int money = 10000;

    public synchronized void depositNWithdrawMoney(int save, boolean insert, int time) {
        //Critical Section Lock
        int m = getMoney();
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (insert) {
            setMoney(m + save);
        } else if (m >= save) {
            setMoney(m - save);
        } else {
            System.out.println("not available transaction");
        }
    }

    public int getMoney() {
        return money;
    }

    private void setMoney(int money) {
        this.money = money;
    }
}

class Plus extends Thread {
    public void run() {
        System.out.println("start work");
        SyncMain.myBank.depositNWithdrawMoney(3000, true, 3000);
        System.out.println(SyncMain.myBank.getMoney());
    }
}

class Minus extends Thread {
    public void run() {
        System.out.println("start work");
        SyncMain.myBank.depositNWithdrawMoney(1000, false, 200);
        System.out.println(SyncMain.myBank.getMoney());
    }
}

public class SyncMain {
    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {
        Plus deposit = new Plus();
        deposit.start();
//       deposit.join(); // wait

        Minus withDraw = new Minus();
        withDraw.start();
        withDraw.join();


    }

}
