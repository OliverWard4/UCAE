package LinkedList2;

public class LinkedList2 {

    LinkedNode head;
    LinkedNode rear;
    int size = 0;

    // Constructor
    public LinkedList2(LinkedNode head, LinkedNode rear) {
        this.head = head;
        head.setNext(rear);
        this.rear = rear;
        size++;
        size++;
    }

    public LinkedList2(LinkedNode head) {
        this.head = head;
        this.rear = head;
        size++;
    }

    public LinkedList2(int data, LinkedNode pointer) {
        LinkedNode temp = new LinkedNode(data, pointer);
        head = temp;
        rear = temp;
        size++;
    }

    public LinkedNode getHead() {

        return head;
    }

    public LinkedNode getRear() {

        return rear;
    }

    // returns the next node from a node
    public LinkedNode getNext(LinkedNode node) {
        return node.getNext();
    }

    // sets the next from a given node
    public void setNext(LinkedNode node, LinkedNode newNode) {
        node.setNext(newNode);
    }

    public void push(LinkedNode p) {
        rear.setNext(p);
        p.setBack(rear);
        rear = p;
        size++;
    }

    public LinkedNode pop() {
        LinkedNode temp = head;
        head = head.getNext();
        head.setBack(null);
        size--;
        return temp;
    }

    public LinkedNode peek() {
        return head;
    }

}
