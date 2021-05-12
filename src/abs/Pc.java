package abs;

public abstract class Pc {
    abstract void display();
    abstract void typing();
    void turnOn(){
        System.out.println("전원을 켭니다");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다");
    }
}
