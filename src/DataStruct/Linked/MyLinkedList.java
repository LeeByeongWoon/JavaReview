package DataStruct.Linked;

public class MyLinkedList {
    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode = new MyListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            MyListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++; // size
        return newNode;
    }

    public MyListNode insertElement(int position, String data) {
        MyListNode tempNode = head;
        MyListNode preNode = null;

        MyListNode newNode = new MyListNode(data);

        if (position < 0 || position > count) {
            return null;
        }
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            for (int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position) {
        MyListNode tempNode = head;
        MyListNode preNode = null;

        if (position == 0) {
            head = tempNode.next;
        } else {
            for (int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        return tempNode;
    }

    public String getElement(int position) {
        MyListNode tempNode = head;

        if (position >= count) {
            System.out.println("not available value total count is :" + count);
            return "error";
        }
        if (position == 0) {
            return head.getData();
        }
        for (int i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }
        return tempNode.getData();
    }

    public MyListNode getNode(int position) {
        int i;
        MyListNode tempNode = head;

        if (position >= count) {
            System.out.println("?????? ?????? ?????? ?????????. ?????? ???????????? ????????? " + count + "??? ?????????.");
            return null;
        }

        if (position == 0) {  //??? ??? ??????

            return head;
        }

        for (i = 0; i < position; i++) {
            tempNode = tempNode.next;

        }
        return tempNode;
    }

    public void removeAll() {
        head = null;
        count = 0;

    }

    public int getSize() {
        return count;
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("????????? ????????? ????????????.");
            return;
        }

        MyListNode temp = head;
        while (temp != null) {
            System.out.print(temp.getData());
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty() {
        return (head == null);
    }

}

