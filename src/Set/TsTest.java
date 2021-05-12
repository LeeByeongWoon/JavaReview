package Set;

import java.util.TreeSet;

public class TsTest {
    public static void main(String[] args) {
        Ts ts = new Ts();
        ts.addMember(new Member("good"));
        ts.addMember(new Member("bad"));
        ts.addMember(new Member("nice"));
        ts.addMember(new Member("amazing"));

        System.out.println(ts);
    }
}
