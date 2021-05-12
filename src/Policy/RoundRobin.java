package Policy;

public class RoundRobin implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("Imported call sequentially from queue");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("Imported agent sequentially from queue");
    }
}
