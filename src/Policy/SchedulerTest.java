package Policy;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("choose one how to call to agent");
        int ch = System.in.read();
        Scheduler scheduler =null;

        if ( ch == 'R' || ch == 'r'){
            scheduler = new RoundRobin();
        }
        else if( ch == 'L' || ch == 'l'){
            scheduler = new LeastJob();
        }
        else if( ch == 'P' || ch == 'p'){
            scheduler = new PriorityAllocation();
        }
        else {
            System.out.println("do not supported command");
            return;
        }
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
