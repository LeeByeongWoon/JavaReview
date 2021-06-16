package ToyProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Define {
    public static final Map<Integer,String> SubjectCode = new HashMap<>(){{
        put(1001,"국어");
        put(1002,"수학");
    }};

    public static ArrayList<Map<Integer,String>> addCode(){
        ArrayList<Map<Integer,String>> codeList = new ArrayList<>();
        codeList.add(SubjectCode);
        return codeList;
    }



    public static final Map<Integer,String> EvaluationCode = new HashMap<>(){{
        put(0,"MajorSubject");
        put(1,"GeneralSubject");
        put(2,"PassFailSubject");
    }};
}
