package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hs {
    private HashSet<Member> hashSet ;

    public Hs(){
        hashSet = new HashSet<>();
    }
    public void addMember(Member member){
        hashSet.add(member);
    }
    public int removeMember(int number){
        Iterator<Member> it = hashSet.iterator();
        while(it.hasNext()){
            Member member = it.next();
            if(member.getMemberNum() == number){
                hashSet.remove(member);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Hs{" +
                "hashSet=" + hashSet +
                '}';
    }
}
