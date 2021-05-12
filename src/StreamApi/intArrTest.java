package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intArrTest {
    public static void main(String[] args) {
        List<Integer> temp = Arrays.asList(1,2,3,4,5);
        System.out.println(temp);

        Integer[] arr = temp.toArray(new Integer[0]);
        int[] arr2 = {1,2,3,4,5};

        Arrays.stream(arr2).sum();// intStream 함수로 다른 값에서는 사용 불가
        //Arrays.stream(arr).sum(); // Integer value
        temp.forEach(System.out::print);
        System.out.println();
        temp.stream().filter(integer -> integer%2 == 0).forEach(System.out::print);
        int a = temp.stream().reduce(0,Integer::sum);
        System.out.println(a);

    }
}
