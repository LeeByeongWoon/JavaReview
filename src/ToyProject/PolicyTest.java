package ToyProject;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class PolicyTest {
    public static void main(String[] args) {
        System.out.println(Define.SubjectCode.get(1001));
        System.out.println(Define.SubjectCode.entrySet());

        Set<Integer> i = Define.SubjectCode.keySet();
        System.out.println(i);
        ArrayList<Map<Integer,String>> list = Define.addCode();
        System.out.println(list);
        System.out.println(list.get(0).entrySet());



    }
}
