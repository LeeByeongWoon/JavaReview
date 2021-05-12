package exInterface;

import exInterface.Calc;
import exInterface.Calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calculator();
        calc.description();
        calc.drive(1, 3);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            arr.add(i);
        }
        int[] array = new int[arr.size()];
        int size = 0;
        for (int temp : arr) {
            array[size++] = temp;
        }
        Calc.total(array);
        System.out.println(Arrays.toString(array));
    }
}
