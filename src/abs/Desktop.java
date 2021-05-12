package abs;

public class Desktop extends Pc{
    @Override
    void display() {
        System.out.println("Desktop display");
    }

    @Override
    void typing() {
        System.out.println("Desktop type");
    }
}
