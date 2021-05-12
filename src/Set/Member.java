package Set;

import java.util.Objects;

public class Member implements Comparable<Member> {
    private static int number = 0;
    private int MemberNum;
    private String name;

    public int getMemberNum() {
        return MemberNum;
    }

    public String getName() {
        return name;
    }

    Member(String name) {
        this.name = name;
        MemberNum = number;
        number++;
    }
    Member(int number,String name){
        this.name = name;
        this.MemberNum = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return MemberNum == member.MemberNum && name.equals(member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MemberNum, name);
    }

    @Override
    public String toString() {
        return
                "MemberNum=" + MemberNum +
                " name='" + name +"'";
    }

    @Override
    public int compareTo(Member member) {
        return Integer.compare(this.MemberNum, member.MemberNum);
//         bigger = positive == 1 , smaller = negative == -1, equals = 0;

    }
}
