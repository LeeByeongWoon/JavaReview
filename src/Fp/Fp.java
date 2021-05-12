package Fp;

import java.util.function.BinaryOperator;

public class Fp {
    public static void main(String[] args) {
        Add add = (x,y)->x+y;
        System.out.println(add.add(2,3));

        BinaryOperator<Integer> stringSum = (x,y)->x+y; // parameter value == return value
        System.out.println(stringSum.apply(1,2));

    }

}
