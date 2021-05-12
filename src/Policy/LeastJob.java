package Policy;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("Imported call sequentially from queue");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("Get leastGob agent from queue");
    }
}
