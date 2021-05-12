package CollectionFw;

public class IteratorTest {
    public static void main(String[] args) {
        Iteration it = new Iteration();
        it.addNumbers(1);
        it.addNumbers(2);
        it.addNumbers(3);
        it.addNumbers(4);
        it.addNumbers(5);

        System.out.println(it.removeNumber(2));
        System.out.println(it.removeNumber(7));

        System.out.println(it);
    }
}
