package DataStruct.Stack;

import DataStruct.Arr.MyArray;

public class MyStack {
    MyArray arrayStack;
    int top;

    public MyStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(--top);
    }
    public void printAll(){
        arrayStack.printAll();
    }
    public boolean isFull() {
        return top == arrayStack.ARRAY_SIZE;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
