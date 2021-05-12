package Gen;

public class GenTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        var gen = new Generic<>();
        gen.setMaterial(powder);

        System.out.println(gen);

    }
}
