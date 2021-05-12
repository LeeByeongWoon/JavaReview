package DataStruct.Que;

import java.util.LinkedList;

public class LinkQueue2 implements Queue {
    private final LinkedList<String> dump;

    private String front;
    private String rear;

    public String getFront() {
        return front;
    }

    public String getRear() {
        return rear;
    }

    LinkQueue2() {
        dump = new LinkedList<>();
    }

    @Override
    public void enqueue(String data) {
        if (dump.isEmpty()) {
            dump.add(data);
            front = dump.getFirst();
            rear=dump.getLast();
        }else{
            dump.add(data);
            rear = dump.getLast();
        }

        System.out.println(data + " is added");
    }

    @Override
    public String dequeue() {
        if (dump.isEmpty()) {
            return null;
        }
        String result = dump.pop();
        if (dump.isEmpty()) {
            front= null;
            rear = null;
            return result;
        }
        front = dump.getFirst();
        return result;
    }

    @Override
    public void printQueue() {
        System.out.println(dump);
    }
}
