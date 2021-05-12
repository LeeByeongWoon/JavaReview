package DataStruct.Que;

public class LinkQueueTest {
    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.enqueue("A");
        linkQueue.enqueue("B");
        linkQueue.enqueue("C");
        linkQueue.enqueue("D");
        linkQueue.enqueue("E");
        System.out.println(linkQueue.dequeue());
        linkQueue.printQueue();
        System.out.println(linkQueue.front.getData()+" "+linkQueue.rear.getData());
        LinkQueue2 linkQueue2 = new LinkQueue2();
        linkQueue2.enqueue("A");
        linkQueue2.enqueue("B");
        linkQueue2.enqueue("C");
        linkQueue2.enqueue("D");
        linkQueue2.printQueue();
        System.out.println(linkQueue2.getFront()+" , "+linkQueue2.getRear());
        System.out.println(linkQueue2.dequeue());
        linkQueue2.printQueue();
        System.out.println(linkQueue2.dequeue());
        linkQueue2.printQueue();
        System.out.println(linkQueue2.dequeue());
        linkQueue2.printQueue();
        System.out.println(linkQueue2.dequeue());
        linkQueue2.printQueue();
        System.out.println(linkQueue2.getFront()+" , "+linkQueue2.getRear());
    }
}
