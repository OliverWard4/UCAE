package LinkedList2Prac;

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
        // add node to list
    }

    public LinkedList2(int data, LinkedNode pointer) {
        // make a node then add it
    }

    public LinkedNode getHead() {
        // return the head
        return;
    }

    public LinkedNode getRear() {

        return rear;
    }

    // returns the next node from a node
    public LinkedNode getNext(LinkedNode node) {
        return node.getNext();
    }

    // sets the next from a given node ***IGNORE***
    public void setNext(LinkedNode node, LinkedNode newNode) {
        node.setNext(newNode);
    }

    public void push(LinkedNode p) {
        // push
    }

    public LinkedNode pop() {
        // pop
    }

    public LinkedNode peek() {
        // peek
    }

}
