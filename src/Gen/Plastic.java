package Gen;

public class Plastic extends Material{
    @Override
    public String toString() {
        return "used Plastic";
    }

    @Override
    public String doPrinting() {
        return "print Plastic";
    }
}
