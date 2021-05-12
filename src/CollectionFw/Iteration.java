package CollectionFw;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {
    ArrayList<Integer> numbers = new ArrayList<>();

    public void addNumbers(int i) {
        numbers.add(i);
    }
    public int removeNumber(int i){
        Iterator<Integer> ir = numbers.iterator();
        while(ir.hasNext()){
            int dump = ir.next();
            if(dump == i){
                numbers.remove(dump);
                return dump;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Iteration{" +
                "numbers=" + numbers +
                '}';
    }
}
