package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class CompareStream implements BinaryOperator<String>{
    @Override
    public String apply(String s1, String s2) {
        {
            if (s1.getBytes().length >= s2.getBytes().length) return s1;
            else return s2;
        }
    }
}
public class ReduceT {
    public static void main(String[] args) {
        List<String> greetings = Arrays.asList("안녕하세요", "hello", "good morning");
        String result =greetings.stream().reduce(new CompareStream()).get();
        System.out.println(result);
    }
}
