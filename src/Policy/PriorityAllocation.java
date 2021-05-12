package Policy;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("Imported call from queue in order of high priority");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("Get the best agent from the queue");
    }
}
