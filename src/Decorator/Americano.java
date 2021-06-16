package Decorator;

public class Americano extends Coffee{
    @Override
    public void brewing() {
        System.out.print("Americano ");
    }
}
