package Gen;

public class Point<T,V>{
    T x;
    V y;

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    Point(T x , V y){
        this.x = x;
        this.y = y;
    }

}
