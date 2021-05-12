package DataStruct.Que;

import DataStruct.Linked.MyLinkedList;
import DataStruct.Linked.MyListNode;

public class LinkQueue extends MyLinkedList implements Queue {

    MyListNode front;
    MyListNode rear;

    @Override
    public void enqueue(String data) {
        MyListNode newNode;
        if(isEmpty()){
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }
        else{
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData()+" is added");
    }

    @Override
    public String dequeue() {
        if(isEmpty()){
            return null;
        }
        String data = front.getData();
        front = front.next;
        removeElement(0);

        if (front == null){
            rear = null;
        }
        return data;
    }

    @Override
    public void printQueue() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        MyListNode temp = front;
        while(temp!= null){
            System.out.print(temp.getData() + ",");
            temp = temp.next;
        }
        System.out.println();
    }
}
