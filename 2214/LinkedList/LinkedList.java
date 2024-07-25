package LinkedList;

public class LinkedList {

    LinkedNode head;

    // Constructor
    public LinkedList(LinkedNode head) {
        this.head = head;
    }

    public LinkedList(int data, LinkedNode pointer) {
        LinkedNode temp = new LinkedNode(data, pointer);
        head = temp;
    }

    // returns the next node from a node
    public LinkedNode getNext(LinkedNode node) {
        return node.getPointer();
    }

    // sets the next from a given node
    public void setNext(LinkedNode node, LinkedNode newNode) {
        node.setPointer(newNode);
    }

}
