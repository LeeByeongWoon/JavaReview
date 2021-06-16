package Decorator;

public class CoffeeT {
    public static void main(String[] args) {
        Coffee coffee = new Americano();
        coffee.brewing();
        System.out.println();

        Coffee latte = new Latte(coffee);
        latte.brewing();
        System.out.println();

        Coffee mocha = new Mocha(new Latte(new Americano()));
        mocha.brewing();
        System.out.println();

        Coffee mocha2 = new Mocha(new Americano());
        mocha2.brewing();
    }
}
