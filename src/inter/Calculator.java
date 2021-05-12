package inter;

public class Calculator implements Calc {

    @Override
    public void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    @Override
    public void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    @Override
    public void times(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    @Override
    public void drive(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: " + Error);
        } else {
            System.out.println(num1 / num2);
        }

    }
}
