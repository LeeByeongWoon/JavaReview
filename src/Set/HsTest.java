package Set;

import java.util.Objects;

public class HsTest {
    public static void main(String[] args) {

        Hs hashSet = new Hs();
        hashSet.addMember(new Member("one"));
        hashSet.addMember(new Member("two"));
        hashSet.addMember(new Member("three"));
        hashSet.addMember(new Member("four"));
        hashSet.addMember(new Member("five"));
        System.out.println(hashSet);
        hashSet.addMember(new Member("five"));
        hashSet.addMember(new Member(4,"five"));
        System.out.println(hashSet);
        Member test= new Member("hello Man");
        System.out.println(Objects.hash(test));
    }
}
