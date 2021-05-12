package Gen;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenMethod {
    public <T, V> ArrayList<Double> makeRectangle(Point<T, V> p1, Point<T, V> p2) {
        double left = ((Number) p1.getX()).doubleValue();
        double right = ((Number) p2.getX()).doubleValue();
        double top = ((Number) p1.getY()).doubleValue();
        double bottom = ((Number) p2.getY()).doubleValue();

        double width = right - left;
        double height = bottom - top;
        ArrayList<Double> dump = new ArrayList<>();
        dump.add(width);
        dump.add(height);
        dump.add(width*height);

        return dump;
    }

    public static void main(String[] args) {
        GenMethod genMethod = new GenMethod();
        Point<Integer, Double> p1 = new Point<>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        ArrayList<Double> size = genMethod.makeRectangle(p1, p2);

        System.out.println(size);
    }
}
