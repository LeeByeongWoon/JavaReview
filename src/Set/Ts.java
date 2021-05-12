package Set;

import java.util.TreeSet;

public class Ts {
    private TreeSet<Member> treeSet ;

    public Ts(){
        treeSet = new TreeSet<>();
    }
    public void addMember(Member member){
        treeSet.add(member);
    }
    public int removeMember(int number){
        treeSet.removeIf(member -> member.getMemberNum() == number);
        return 0;
    }

    @Override
    public String toString() {
        return "Hs{" +
                "TreeSet=" + treeSet +
                '}';
    }
}
