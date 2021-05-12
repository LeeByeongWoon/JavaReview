package exInterface;

public interface Calc {
    double PI = 3.14;
    int Error = -999999999;

    void add(int num1, int num2);
    void subtract(int num1, int num2);
    void times(int num1, int num2);
    void drive(double num1, double num2);

    default void description(){
        System.out.println("provide for integer");
    }
    static int total (int[] arr){
        int total =0;
        for(int num: arr){
            total += num;
        }
        myStaticMethod();
        System.out.println(total);
        return total;
    }
    private static void myStaticMethod(){
        System.out.println("static method");
    }
}